package UserprojectExample;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class UserListTest {
    public static void main(final String[] args) {

        Comparator<User> pcomp = new UserprojectExample.UserNamecomparator().thenComparing(new UserAgeComparator());
        List<User> list = new ArrayList<>();
        list.add(new User("Arina", 4));
        list.add(new User("Arina", 4));
        list.add(new User("Arina", 2));
        list.add(new User("Arina", 1));
        list.add(new User("Barbi", 4));
        list.add(new User("Jack", 4));
        list.add(new User("Jack", 2));
        list.add(new User("Poll", 2));
        list.add(new User("Anna", 2));
        list.add(new User("Victor", 2));
        list.add(new User("Nikolay", 2));


        System.out.println(list);
        list.sort(pcomp);
        for (final User user : list) {
            System.out.println(user.getName() + "," + user.getAge());

        }

    }
}
