import java.util.ArrayList;
import java.util.List;

public class TestFinal {
    public static void main(String[] args) {
        User user = new User("Shaxzod");
        User user1 = new User("Shaxzodd");
        User user2 = new User("Shaxzoddd");

        final List<User> list = new ArrayList<>();
        list.forEach(System.out::println);
//        System.out.println();
        list.add(user);
        list.add(user1);
        list.add(user2);
//        list.forEach(System.out::println);

        final User user3 = new User("123");
        System.out.println(user3.getName());
        user3.setName("1234");
        System.out.println(user3.getName());

    }
}
