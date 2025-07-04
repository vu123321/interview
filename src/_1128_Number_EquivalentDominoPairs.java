public class _1128_Number_EquivalentDominoPairs {


    public static void main(String[] args) {

        int[][] dominoes = {{1, 2}, {2, 1}, {3, 4}, {5, 6}};

        System.out.println("result processV2: "+processV2(dominoes));

    }


    private static int processV1(int[][] dominoes) {
        int[] count = new int[100];

        int numberOfPairs = 0;

        for(int[] domino : dominoes) {
            int lesserValue = Math.min(domino[0], domino[1]);
            int greaterValue = Math.max(domino[0], domino[1]);

            int normalizedDomino = lesserValue * 10 + greaterValue;

            // tang so luong cap tuong dong;
            int currentCount = count[normalizedDomino]; //lay so lan quan domino nay da thay truoc do.

            numberOfPairs += currentCount; // cong so lan da thay truoc do

            // cap nhat so lan xuat hien cua quan domino hien tai
            count[normalizedDomino]++;// tang so lan xuat hien len 1.

        }

        return numberOfPairs;

    }

    private static int processV2(int[][] dominoes) {
        int[] count = new int[100];

        int numberOfPairs = 0;

        for(int[] domino : dominoes) {
            int val = domino[0] > domino[1]
                    ? domino[1] * 10 + domino[0] : domino[0] * 10 + domino[1];
            numberOfPairs += count[val];
            count[val]++;
        }

        return numberOfPairs;

    }
}
