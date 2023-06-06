public class ValidParentheses {
    public static boolean isValid(String s) {

        while(s.indexOf("()")>-1 || s.indexOf("{}")>-1 || s.indexOf("[]")>-1) {
            s = s.replaceAll("\\(\\)", "");
            s = s.replaceAll("\\[\\]", "");
            s = s.replaceAll("\\{\\}", "");
        }

        return s.length() == 0 ? true : false;

    }

    public static void main(String[] args) {
//        String s = "(){}[]";
        String s = "(]";
        System.out.println(isValid(s));
    }
}
