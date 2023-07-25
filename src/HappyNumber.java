import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HappyNumber {

    public static int helper(int n) {
        int sum = 0;
        n *= 10;
        while (n / 10 != 0) {
            n /= 10;
            sum += (n % 10) * (n % 10);
        }

        return sum;
    }

    public static boolean isHave(List<Integer> list, int val) {
        for (Integer i: list) {
            if(i == val) return true;
        }
        return false;
    }

    public static boolean isHappy(int n) {

        List<Integer> list = new ArrayList<>();
        while (helper(n) != 1) {
            if (isHave(list, helper(n))) {
                return false;
            }
            list.add(helper(n));
            n = helper(n);
        }

        return true;
//        int summ = 0;



//        while (summ != 1) {
//            summ = 0;
//            int[] arr = helper(n);
//            for (int ii: arr) {
//                if(ii == 5) return false;
//                summ += ii*ii;
//            }
//            n = summ;
//        }
//        return true;
    }

    public static void main(String[] args) {
        System.out.println(isHappy(536));
    }
}
