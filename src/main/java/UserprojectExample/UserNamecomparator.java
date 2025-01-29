package UserprojectExample;

import java.util.Comparator;

public class UserNamecomparator implements Comparator<User> {


    @Override
    public int compare(final User a, final User b) {
        return a.getName().compareTo(b.getName());
    }
}
