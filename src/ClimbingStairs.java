import java.math.BigInteger;
import java.util.*;

public class ClimbingStairs {
    public static int climbStairs(int n) {

        int count = 0;
        int result = 0;
        if(n % 2 == 1) {
            int item_2 = n / 2;
            int item_1 = 1;
            for(int i=n/2; i>=1; i--) {
                if(item_2 > item_1) {
                    result = (int) factorial(item_1, item_2, item_1 + item_2);
                    count += result;
                } else {
                    result = (int) factorial(item_2, item_1, item_1 + item_2);
                    count += result;
                }
                item_2 = item_2 - 1;
                item_1 = item_1 + 2;
            }
            count += 1;
        } else {
            int item_2 = (n / 2) - 1;
            int item_1 = 2;
            for(int i=(n/2)-1; i>=1; i--) {
                if(item_2 > item_1) {
                    result = (int) factorial(item_1, item_2, item_1 + item_2);
                    count += result;
                } else {
                    result = (int) factorial(item_2, item_1, item_1 + item_2);
                    count += result;
                }
                item_2 = item_2 - 1;
                item_1 = item_1 + 2;
            }
            count += 2;
        }

        return count;
    }

    public static long factorial(int a, int b, int c) {

        long r = 1;
        Set<Integer> aa = new HashSet<>();
        Set<Integer> cc = new HashSet<>();
        for(int i=1; i<=a; i++) {
            aa.add(i);
        }
        for (int i=b+1; i<=c; i++) {
            cc.add(i);
        }

        Iterator<Integer> i = cc.iterator();
        Iterator<Integer> j = aa.iterator();
        List<Integer> toAdd = new ArrayList<>();
        while (i.hasNext()) {
            while (j.hasNext()) {
                int ii = i.next();
                int jj = j.next();
                if(ii % jj == 0) {
                    i.remove();
                    toAdd.add(ii/jj);
                    j.remove();
                    continue;
                }
            }

        }

        cc.addAll(toAdd);

        for(Integer iii: cc) {
            r *= iii;
        }

        for(Integer iii: aa) {
            r /= iii;
        }

        return r;

    }
    public static void main(String[] args) {
        int n = 45;
        System.out.println(climbStairs(n));

//        System.out.println(factorial(17, 30));
//        System.out.println((int) (factorial(17, 30) / factorial(1, 14)));

//        int l = 1134903170;
//        System.out.println(l);
//        System.out.println(factorial(18,26));

//        System.out.println(factorial(14, 16, 30));

    }
}
//9223372036854775808
//5769043765476591616
