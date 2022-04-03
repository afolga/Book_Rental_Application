import java.util.ArrayList;
import java.util.List;

public class UserDirectory {
    private static List<User> userDirectory = new ArrayList<User>();

    public List<User> getUserDirectory() {
        return userDirectory;
    }
}