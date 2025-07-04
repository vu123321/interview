import java.util.Arrays;

public class _88_Merge_Sorted_Array {

    public static void main(String[] args) {

        int[] nums1 = {1, 2, 3, 0, 0, 0};

        int m = 3, n = 3;
//        int[] newNums2 = new int[n];

        int[] nums2 = {3};


        merge(nums1, m, nums2, n);

        Arrays.stream(nums1).forEach(System.out::println);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        int indexNums1 = m - 1;
        int indexNums2 = n - 1;

        int newSize = n;
        int[] newArray = new int[newSize];

        for (int i = 0; i < nums2.length; i++) {
            newArray[i] = nums2[i];
        }

//        for (int num : newArray) {
//            System.out.print(num + " ");
//        }

        int mergedIndex = m + n - 1;

        while(indexNums2 >= 0) {
            if(indexNums1 >= 0 && nums1[indexNums1] >= newArray[indexNums2]) {
                nums1[mergedIndex] = nums1[indexNums1];
                indexNums1--;

            }
            else {
                nums1[mergedIndex] = newArray[indexNums2];
                indexNums2--;
            }

            mergedIndex--;
        }
        Arrays.sort(nums1);
    }
}
