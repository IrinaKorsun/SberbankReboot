package radionov;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Collection<UserSber> userSberList1 = creator(-50_000, 50_000);
        Collection<UserSber> userSberList2 = creator(0, 100_000);
        Collection<UserSber> unical = findDuplicatesArrayList(userSberList1, userSberList2);
    }

    public static Collection<UserSber> creator(int countStart, int countEnd) {
        Collection<UserSber> userSber = new ArrayList<>();
        for (int i = countStart; i < countEnd; i++) {
            String userName = "userName" + i;
            String email = "email" + i;
            byte j = (byte) i;
            byte[] passwordHash = {j};
            UserSber ub = new UserSber(userName, email);
            ub.setPasswordHash(passwordHash);
            userSber.add(ub);
        }
        return userSber;
    }

    private static Collection<UserSber> findDuplicatesArrayList(Collection<UserSber> collA, Collection<UserSber> collB) {
        Collection<UserSber> duplicates = new ArrayList<>();
        HashSet<UserSber> hs = new HashSet<>();
        for (int i = 0; i < collA.size(); i++) {
            hs.add(((List<UserSber>) collA).get(i));
        }
        long start = System.currentTimeMillis();
        for (int i = 0; i < collB.size(); i++) {
            UserSber ub = ((List<UserSber>) collB).get(i);
            if (hs.contains(ub)) {
                duplicates.add(ub);
            }
        }
        long end = System.currentTimeMillis();
        NumberFormat formatter = new DecimalFormat("#0.0000");
        System.out.println("ArrayList time is " + formatter.format((end - start) / 1000d) + " seconds");
        return duplicates;
    }
}


