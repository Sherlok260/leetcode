import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LongestPrefix {
    public static String longestCommonPrefix(String[] strs) {
        int min = strs[0].length();

        for(String s: strs) {
            if(s.length() < min) {
                min = s.length();
            }
        }

        List<String> collect = new ArrayList<>();

        for(int i=1; i<=min; i++) {
            String s = strs[0].substring(0, i);
            int finalI = i;
            boolean b = Arrays.stream(strs)
                    .allMatch(s1 -> s1.substring(0, finalI).equals(s));
            if (b) {
                collect.add(s);
            };
        }
        return collect.size() == 0 ? "" : collect.get(collect.size()-1);
    }

    public static void main(String[] args) {
//        String[] strs = {"c","acc","ccc"};
//        String[] strs = {"flower","flow","flight"};
//        String[] strs = {"dog","racecar","car"};
        String[] strs = {"a"};
        System.out.println(longestCommonPrefix(strs));
    }
}
