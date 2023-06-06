public class LengthOfLastWord {
    public static int lengthOfLastWord(String s) {
        String[] s1 = s.split(" ");
        return s1[s1.length-1].length();
    }

    public static void main(String[] args) {
        String s = "   fly me   to   the moon  ";
        System.out.println(lengthOfLastWord(s));
    }
}
