import java.util.*;

public class ClimbStairsFor3 {

    public static void setMax(Set<Integer> set_max, int abc, int max) {
        for(int i=max+1; i<=abc; i++) {
            set_max.add(i);
        }
    }

    public static void setHelper(Set<Integer> ss, int s) {
        for (int i=1; i<=s; i++) {
            ss.add(i);
        }
    }

    public static int factorialHelper(int a, int b, int c) throws InterruptedException {

        Set<Integer> abc = new HashSet<>();
        Set<Integer> aa = new HashSet<>();
        Set<Integer> bb = new HashSet<>();
        Set<Integer> cc = new HashSet<>();

        int max = -1;
        if(a >= b && a >= c) {
            max = a;
            setMax(abc, a+b+c, a);
            setHelper(bb, b);
            setHelper(cc, c);
        }
        else if (b >= a && b >= c) {
            max = b;
            setMax(abc, a+b+c, b);
            setHelper(aa, a);
            setHelper(cc, c);
        }
        else  {
            max = c;
            setMax(abc, a+b+c, c);
            setHelper(aa, a);
            setHelper(bb, b);
        }

        System.out.println("aa");
        aa.forEach(System.out::println);
        Thread.sleep(100);
        System.out.println("bb");
        bb.forEach(System.out::println);
        Thread.sleep(100);
        System.out.println("cc");
        cc.forEach(System.out::println);
        Thread.sleep(100);
        System.out.println("abc");
        abc.forEach(System.out::println);

        return 1;
    }

    public static int climbStair(int n) throws InterruptedException {

        int count_one = 0;
        int count_two = 0;
        int count_three = 0;

        if(n == 1) return 1;

        for (int i=3; i!=0; i--) {
            if(n % 3 == 0) {
                count_three = 1;
                count_two = 0;
                count_one = 0;
                factorialHelper(count_one, count_two, count_three);
            }
        }
        System.out.println();
        return 1;
    }

    public static void main(String[] args) throws InterruptedException {
        factorialHelper(5,6,7);
    }
}
