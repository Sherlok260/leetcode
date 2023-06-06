import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static boolean halvesAreAlike(String s) {

        List<String> list = Arrays.asList("a", "e", "o", "u", "i", "A", "E", "O", "U", "I");

        String s1 = s.substring(0, s.length()/2);
        String s2 = s.substring(s.length()/2);

        Matcher matcher = Pattern.compile(list.toString()).matcher(s1);
        Matcher matcher2 = Pattern.compile(list.toString()).matcher(s2);

        return matcher.results().count() == matcher2.results().count() ? true : false;
    }

    public static void main(String[] args) {
        String str = "abqooipk";

        System.out.println(halvesAreAlike(str));

    }
}