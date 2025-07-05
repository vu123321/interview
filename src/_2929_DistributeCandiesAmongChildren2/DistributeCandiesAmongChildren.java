package _2929_DistributeCandiesAmongChildren2;

public class DistributeCandiesAmongChildren {

    public static void main(String[] args) {


    }

    public long distributeCandiesV2(int sunCandies, int theNumberMaximumCandies) {



        return 1;

    }

    public long distributeCandies(int n, int limit) {


        long count = 0;
        for (int i = 0; i <= limit; i++) {
            for(int j = 0; j <= limit; j++ ) {
                for (int k  = 0; k <= limit; k++) {
                    if (i + j + k == n) {
                        count++;
                    }
                }
            }
        }
        return count;
    }
}
