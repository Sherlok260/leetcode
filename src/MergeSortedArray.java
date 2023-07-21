import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int l = 0;
        for(int i=m; i<m+n; i++) {
            nums1[i] = nums2[l++];
        }
        Arrays.sort(nums1);
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};

        int m = 3, n = 3;

        merge(nums1, m, nums2, n);

        Arrays.stream(nums1).forEach(System.out::println);

    }
}
