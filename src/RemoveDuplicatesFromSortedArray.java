import java.util.*;
import java.util.stream.Collectors;

public class RemoveDuplicatesFromSortedArray {

    public static int removeDuplicates(int[] nums) {
        Set<Integer> set = new TreeSet<>();
        for(int i=0; i<nums.length; i++) {
            set.add(nums[i]);
        }
        int set_size = set.size();

//        Set<Integer> sortedSet = new TreeSet<>(set);

        System.out.println("set");
        System.out.println(set);

        for(int j=0; j<set_size; j++) {
            int first = set.stream().findFirst().get();
            nums[j] = first;
            set.remove(first);
        }

        return set.size();
    }

    public static void main(String[] args) {
//        int[] nums = {0,0,1,1,1,2,2,3,3,4}; // Input array
        int[] nums = {-3,-1,0,0,0,3,3}; // Input array
        int[] expectedNums = {-3,-1,0,3}; // The expected answer with correct length
//        int[] expectedNums = {0,1,2,3,4}; // The expected answer with correct length

        int k = removeDuplicates(nums); // Calls your implementation

        assert k == expectedNums.length;
        for (int i = 0; i < k; i++) {
            assert nums[i] == expectedNums[i];
        }

        System.out.println("nums");
        Arrays.stream(nums).forEach(System.out::println);
    }
}
