import java.math.BigInteger;
import java.util.Arrays;

public class PlusOne {

    public static int[] plusOne(int[] digits) {
        boolean b = Arrays.stream(digits).allMatch(i -> i == 9);
        if(b) {
            int[] arr = new int[digits.length+1];
            arr[0] = 1;
            return arr;
        } else {
            int k = 1;
            while (digits[digits.length-k] == 9) {
                k += 1;
            }
            for(int i=1; i<k; i++) {
                digits[digits.length-i] = 0;
            }
            digits[digits.length-k] += 1;
            return digits;
        }
    }
    public static void main(String[] args) {
//        int[] digits = {6,1,4,5,3,9,0,1,9,5,1,8,6,7,0,5,5,4,3};
        int[] digits = {8,9,9,9};
        Arrays.stream(plusOne(digits)).forEach(System.out::println);
    }
}
