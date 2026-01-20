import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {

    public static void main(String[] args) {

        // LinkedHashSet maintains insertion order and does not allow duplicates
        Set<String> userLogins = new LinkedHashSet<>();

        // Adding user login names
        userLogins.add("sanika");
        userLogins.add("rahul");
        userLogins.add("pooja");
        userLogins.add("amit");

        // Duplicate entry (will be ignored)
        userLogins.add("rahul");

        // Displaying users in the order they logged in
        System.out.println("User login order:");
        for (String user : userLogins) {
            System.out.println(user);
        }
    }
}