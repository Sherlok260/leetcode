import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.Arrays.sort;

public class RemoveElement {

    public static int removeElement(int[] nums, int val) {

        int counter = nums.length;
        int lastindex = nums.length-1;

        for(int i=0; i<nums.length; i++) {
            for(int j=0; j<i; j++) {
                if(nums[i] < nums[j]) {
                    nums[i] = nums[i] + nums[j];
                    nums[j] = nums[i] - nums[j];
                    nums[i] = nums[i] - nums[j];
                }
            }
        }

        for(int i=0; i<nums.length; i++) {
            if(nums[i] == val) {
                if(i == nums.length-1) {
                    counter -= 1;
                } else {
                    nums[i] = nums[lastindex];
                    lastindex -=1;
                    counter -= 1;
                }
            } else {
                continue;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
//        int[] nums = {2,2,2,2,2,0,1,2,2,3,0,4,2,2,2,2}; // Input array
        int[] nums = {2,2};
        int val = 2; // Value to remove
        int[] expectedNums = {0,1,4,0,3}; // The expected answer with correct length.
        // It is sorted with no values equaling val.

        int k = removeElement(nums, val); // Calls your implementation

        assert k == expectedNums.length;
        sort(nums, 0, k); // Sort the first k elements of nums
        for (int i = 0; i < k; i++) {
            assert nums[i] == expectedNums[i];
            System.out.println(nums[i]);
        }

    }
}
