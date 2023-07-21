package saralash;


import java.util.Arrays;
import java.util.Locale;

/**
 * Full Name : Shaxzod Murtozaqulov Shuxrat o'g'li
 * telegram username : @saralashadmin
 */

public class Solution {
    /**
     * 1-problem
     *
     * @param s :String
     * @param t :String
     * @return : Boolean
     */
    public static boolean isAnagram(String s, String t) {

        if(s.length() != t.length()) {
            return false;
        } else {

            s = s.toLowerCase(Locale.ROOT);
            t = t.toLowerCase(Locale.ROOT);

            char[] s_array = s.toCharArray();
            char[] t_array = t.toCharArray();

            Arrays.sort(s_array);
            Arrays.sort(t_array);

            return Arrays.equals(s_array, t_array);
        }
    }


    /**
     * 2-problem
     *
     * @param n:Int
     * @return : Int
     */
    public static int countWay(int n) {

        /*
        * Uzir vaqtim yetmadi ishlashga
        * */

    return -1;
    }


    /**
     * 3-problem
     *
     * @param n:int
     * @param arr:array
     * @return : int
     */
    public static int maxProfit(int n, int[] arr) {

        return Arrays.stream(arr).sum();
    }

    /**
     * 4-problem
     *
     * @param nums1:array
     * @param nums2:array
     * @return :int
     */
    public static int commonMinElement(int[] nums1, int[] nums2) {

        int min = -1;
        int j = 0;
        if (nums1[0] < nums2[0]) {
            min = nums1[j++];
            for(int i=0; i<nums2.length; i++) {
                if (nums2[i] > min && j != nums1.length) {
                    min = nums1[j++];
                    i = -1;
                } else if (nums2[i] == min) {
                    break;
                }
            }
            return min;
        }
        else {
            min = nums2[j++];
            for(int i=0; i<nums1.length; i++) {
                if (nums1[i] > min && j != nums2.length) {
                    min = nums2[j++];
                    i = -1;
                } else if (nums1[i] == min) break;
            }
            return min;
        }
    }

    public static void main(String[] args) {
        System.out.println(countWay(4));
    }

}

