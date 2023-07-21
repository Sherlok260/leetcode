public class ClimbingStairs2 {
    public static int climbStairs(int n) {

        if(n == 1) return 1;
        if(n == 2) return 2;

        int n1 = 1;
        int n2 = 2;
        int n3 = 0;

        for(int i = 2; i < n; i++){
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }
        return n3;
    }

    public static void main(String[] args) {

        long startTime = System.nanoTime();

        System.out.println(climbStairs(45));

        System.out.println();

        long endTime   = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println(totalTime);
    }
}
