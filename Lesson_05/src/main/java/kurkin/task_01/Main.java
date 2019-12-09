package kurkin.task_01;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.HashSet;
import java.util.Set;

public class Main {
    private static UserSber createUser(int i) {
        UserSber newUser = new UserSber();
        newUser.setUsername("username" + i);
        newUser.setEmail("email" + i);
        newUser.setPasswordHash(("Password" + i).getBytes());
        return newUser;
    }

    private static void fillUserList(Set<UserSber> userList, int start, int end) {
        for (int i = start; i < end; i++) {
            userList.add(createUser(i));
        }
    }

    static void print(HashSet<UserSber> users) {
        for (UserSber user : users) {
            System.out.println(user.getUsername() + "||" + user.getEmail() + "||" + user.getStrPasswordHash() + ";");
        }
    }

    public static void main(String[] args) {
        HashSet<UserSber> userlist1 = new HashSet<>();
        HashSet<UserSber> userlist2 = new HashSet<>();
        long start = System.currentTimeMillis();
        fillUserList(userlist1, 0, 150000);
        fillUserList(userlist2, 149998, 300000);
        NumberFormat formatter = new DecimalFormat("#0.00000");
        System.out.println("Заполнили массивы за " + formatter.format((System.currentTimeMillis() - start) / 1000d) + " секунд");
        start = System.currentTimeMillis();
        //print(userlist1);
        //print(userlist2);
        //print(userlistIntersect);
        HashSet<UserSber> userlistIntersect = new HashSet<>(userlist1);
        System.out.println("Заполнили дубль 1 списка за " + formatter.format((System.currentTimeMillis() - start) / 1000d) + " секунд");
        start = System.currentTimeMillis();
        userlistIntersect.retainAll(userlist2);
        System.out.println("Нашли дубли за " + formatter.format((System.currentTimeMillis() - start) / 1000d) + " секунд");
        print(userlistIntersect);
    }
}
