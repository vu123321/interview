public class _2145_CountTheHiddenSequences {

    public static void main(String[] args) {


        System.out.println("result: "+countTheHiddenSequences(new int[]{1, -3, 4}, 1, 6));
        System.out.println("------------");
        System.out.println("resultCount: "+count(new int[]{1, -3, 4}, 1, 6));
    }


    private static int countTheHiddenSequences(int[] differences, int lower, int upper) {

        int y = 0;
        int x = 0;
        int current = 0;
        for(int difference : differences) {
             current += difference;
             x = Math.min(current, x);
             y = Math.max(current, y);
             if((y - x) > (upper - lower)) {
                 return 0;
             }
        }

        return (upper - lower) - (y - x) + 1;
    }

    private static int count(int[] nums, int lower, int upper) {
        int a = 0, b = 0, c = 0;
        for(int i = 0; i < nums.length; i++) {
            a += nums[i];
            b = Math.min(a, b);
            c = Math.max(a, c);
            if((c - b) > (upper - lower)) {
                return 0;
            }
        }

        return (upper - lower) -(c -b ) + 1;
    }
}
