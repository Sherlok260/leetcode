public class BasicCalculator {
    public static String calculate(String s) {
        s = s.replaceAll("()", "1");
        return s;
    }
    public static void main(String[] args) {
        String s = "(1+(4+5+2)-3)+(6+8)";
        System.out.println(calculate(s));
    }
}