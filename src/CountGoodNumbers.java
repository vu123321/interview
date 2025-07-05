public class CountGoodNumbers {

    private static long MODULO = (long) Math.pow(10, 9) + 7;

    public static void main(String[] args) {

        System.out.println("result: "+ countGoodNumbers(50, ""));

    }

    public static long countGoodNumbers(long n, String s) {

        int evenDigits = (int) (n + 1) / 2;
        int oddDigits = (int) n / 2;
        long modulo = MODULO;
        long countEven = fastExponentiation(5, evenDigits, modulo, "");

        long countOdd = fastExponentiation(4, oddDigits, modulo, "");
        return (countEven * countOdd) % modulo;

    }

    public static long fastExponentiation(long base, long exponent, long modulo, String s) {

        long result = 1;
        base = (int) (base % modulo);

        while (exponent > 0) {

            if (exponent % 2 == 1) {
                result = (result * base) % modulo;
            }

            exponent = exponent / 2;
            base = (int) ((base * base) % modulo);
        }

        return result;

    }
}
