public class PalindromNumber {
    public static boolean isPalindrome(int x) {
        if(x >= 0) {
            int xona_soni = 0;
            int xx = x;
            while(xx / 10 != 0 || xx % 10 > 0) {
                xona_soni += 1;
                xx = xx /10;
            }
            int[] s = new int[xona_soni];
            int k = 0;
            while(x / 10 != 0 || x % 10 > 0) {
                s[k++] = x % 10;
                x = x / 10;
            }
            for(int i=0; i<xona_soni/2; i++) {
                if(s[i] == s[xona_soni-1-i]) {
                    continue;
                } else return false;
            }

            return true;
        } else return false;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(123421));
    }
}
