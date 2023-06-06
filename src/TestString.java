public class TestString {

    public static int test(String A, String b) {
        String[] s = A.split(" ");
        for(int j=s.length-1; j>=0; j--) {
            if(s[j].equals(b)) {
                return j;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String a = "nima oldinga qannaysan sherldnjs sjdnsk oldinga sjds sjdnsj";
        String b = "oldinga";
        System.out.println(test(a, b));
    }
}
