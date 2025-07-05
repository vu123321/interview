package createSubsequenceFromArr;

import java.util.Arrays;

public class ArrayCopyExample {

    public static void main(String[] args) {

        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7};

        int[] arrCopy = new int[arr.length - 3];
        int i = 0;
        System.arraycopy(arr, i, arrCopy, 0, 2);
        Arrays.sort(arrCopy);

        Arrays.stream(arrCopy).forEach(s -> System.out.print(s + " "));

    }

}
