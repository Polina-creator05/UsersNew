package UserprojectExample;

import java.util.Comparator;

public class UserAgeComparator implements Comparator<User> {


    @Override
    public int compare(final User a, final User b) {
        return -(Integer.compare(a.getAge(), b.getAge()));
    }
}
