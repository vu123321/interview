public class _1007_MinimumDominoRotationForEqualRow {

    public static void main(String[] args) {

        int[] top = new int[] {2,1,2,4,2,2};
        int[] bottoms = new int[] {5,2,6,2,3,2};

        int res = getRotation(top, bottoms, top[0]);

        if(bottoms[0] != top[0]) {
            res = Math.min(res, getRotation(top, bottoms, bottoms[0]));
        }

        res = res == Integer.MAX_VALUE ? -1 : res;

        System.out.println("res: "+res);

    }


    private static int getRotation(int[] top, int[] bottoms, int target) {

        int rotateTop = 0, rotateBottoms = 0;

        for(int i = 0; i < top.length; i++) {

            if(top[i] != target && bottoms[i] != target) {
                return Integer.MAX_VALUE;
            }

            if(top[i] != target) rotateTop++;

            if(bottoms[i] != target) rotateBottoms++;
        }

        return Math.min(rotateTop, rotateBottoms);
    }
}
