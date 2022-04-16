package exercies;

public class Demo {

    public static void main(String[] args) {
        int cols = 4;
        int rows = 8;
        int max = 11;
        int index = max / cols;


        for (int i = 0; i < index; i++) {
            func(rows, i * index + 1, i * index + cols);
            System.out.println("======================");
        }
        func(rows, index * cols + 1, max);
    }

    private static void func(int rows, int start, int end) {

        if (start > end) return;

        for (int i = 1; i <= rows; i++) {
            for (int j = start; j <= end; j++) {
                System.out.format(" %2d x %2d = %3d \t \t", j, i, j * i);
            }
            System.out.println();
        }
        System.out.println();
    }
}
