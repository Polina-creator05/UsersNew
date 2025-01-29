package UserprojectExample;

import java.util.ArrayList;
import java.util.List;

public class UserListTest2 {
    public static void main(final String[] args) {

        List<UserprojectExample.User> list = new ArrayList<>();
        list.add(new UserprojectExample.User("Arina", 4));
        list.add(new UserprojectExample.User("Arina", 4));
        list.add(new UserprojectExample.User("Arina", 2));
        list.add(new UserprojectExample.User("Arina", 1));
        list.add(new UserprojectExample.User("Barbi", 4));
        list.add(new UserprojectExample.User("Jack", 4));
        list.add(new UserprojectExample.User("Jack", 2));
        System.out.println(list);

        UserprojectExample.UserNamecomparator userNamecomparator = new UserprojectExample.UserNamecomparator();
        list.sort(userNamecomparator);
        System.out.println(list);

        UserprojectExample.UserAgeComparator userAgeComparator = new UserprojectExample.UserAgeComparator();
        list.sort(userAgeComparator);
        System.out.println(list);


        list.sort(userNamecomparator.thenComparing(userAgeComparator));
        System.out.println(list);


    }
}
