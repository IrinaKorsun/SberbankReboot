package yushchenko;

import java.util.*;
import java.text.NumberFormat;
import java.text.DecimalFormat;

public class Task1 {


    public static UserSber setUserSber() {
        Random rand = new Random();
        Integer emailInt = rand.nextInt();
        String emailStr = emailInt.toString();
        Double n3 = Math.random();
        String name = n3.toString() + "@email";
        byte[] pass = emailStr.getBytes();
int s = pass.length;
        UserSber elem = new UserSber(n3.toString(), emailStr, pass);
        return elem;
    }

    public static void main(String[] arg) {
        Collection<UserSber> userArr = new ArrayList<>();
        Collection<UserSber> userLink = new LinkedList<>();

        UserSber q0 = setUserSber();
        userArr.add(q0);
        userLink.add(q0);
        // Collection < UserSber > userTree = new TreeSet<>();
        //userTree.add(q0); - Не понимаю, почему тут ошибка возникает, если раском-ть

        for (int i = 0; i < 100_000; i++) {
            UserSber q = setUserSber();
            userArr.add(setUserSber());
            userLink.add(q);
        }

        findDuplicates(userArr, userLink); // 582,360
        findDuplicatesSet(userArr, userLink); // 0,11100 seconds
    }

    public static Collection<UserSber> findDuplicates(Collection<UserSber> collA, Collection<UserSber> collB) {

        Collection<UserSber> userDupl = new ArrayList<>();
        long start = System.currentTimeMillis();
        for (UserSber collA1 : collA) {
            for (UserSber collB1 : collB) {
                if (collA1.equals(collB1)) {
                    userDupl.add(collA1);
                }
            }
        }
        long end = System.currentTimeMillis();
        NumberFormat formatter = new DecimalFormat("#0.00000");
        System.out.print("findDuplicates. Execution time is " + formatter.format((end - start) / 1000d) + " seconds");
        System.out.println(userDupl);
        return userDupl;

    }

    ;

    public static Collection<UserSber> findDuplicatesSet(Collection<UserSber> collA, Collection<UserSber> collB) {
        long start, end;
        Collection<UserSber> userDupl = new HashSet<>();
        HashSet<UserSber> a = new HashSet<>();

        start = System.currentTimeMillis();
        for (UserSber s : collA) {
            a.add(s);
        }

        for (UserSber needle : collB) {
            if (a.contains(needle)) {
                userDupl.add(needle);
            }
        }
        end = System.currentTimeMillis();

        NumberFormat formatter = new DecimalFormat("#0.00000");
        System.out.print("findDuplicatesSet. Execution time is " + formatter.format((end - start) / 1000d) + " seconds");
        System.out.println(userDupl);
        return userDupl;

    }

}
