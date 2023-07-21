import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {
    public static List<String> summaryRanges(int[] nums) {

        List<String> result = new ArrayList<>();
        if(nums.length == 1) {
            result.add(String.valueOf(nums[0]));
            return result;
        }
        if(nums.length == 0) {
            return result;
        }
        int begin = nums[0];
        for(int i = 0; i < nums.length-1; i++) {

            if(nums[i] + 1 == nums[i + 1]) {
                continue;
            } else {
                if(begin == nums[i]) {
                    result.add(String.valueOf(begin));
                } else {
                    result.add(begin + "->" + nums[i]);
                }
                begin = nums[i+1];
            }

        }
        if(nums[nums.length-1]-1 == nums[nums.length-2]) {
            result.add(begin + "->" + nums[nums.length-1]);
        } else {
            result.add(String.valueOf(nums[nums.length-1]));
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {};
//        int[] nums = {0,1,2,4,5,7};
//        int[] nums = {0,2,3,4,6,8,9};
        System.out.println(summaryRanges(nums));
    }
}