package radionov;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/*
ArrayList time is 59,23100 seconds
HashSet time is 52,379 seconds
TreeSet time is 51,781 seconds
 */

public class Main {
    public static List<UserSber> creator(int countStart, int countEnd){
        List<UserSber> userSber = new ArrayList<>();
        for (int i = countStart; i < countEnd; i ++){
            String userName = "userName" + i;
            String email = "email" + i;
            byte j = (byte)i;
            byte[] passwordHash = {j};
            UserSber ub = new UserSber(userName, email);
            ub.setPasswordHash(passwordHash);
            userSber.add(ub);
        }
        return userSber;
    }
    private static List<UserSber> findDuplicatesArrayList(Collection<UserSber> collA, Collection<UserSber> collB) {
        List<UserSber> duplicates = new ArrayList<>();
        long start = System.currentTimeMillis();
        for (UserSber firstSber : collA) {
            for (UserSber secondSber : collB) {
                if (firstSber.equals(secondSber)) {
                    duplicates.add(firstSber);
                }
            }
        }
        long end = System.currentTimeMillis();
        NumberFormat formatter = new DecimalFormat("#0.0000");
        System.out.println("ArrayList time is " + formatter.format((end - start) / 1000d) + " seconds");
        //Execution time is 222,74000 seconds
        return duplicates;
    }
    private static List<UserSber> findDuplicatesHashSet(Collection<UserSber> collA, Collection<UserSber> collB) {
        List<UserSber> duplicates = new ArrayList<>();
        long start = System.currentTimeMillis();
        for (UserSber firstSber : collA) {
            for (UserSber secondSber : collB) {
                if (firstSber.equals(secondSber)) {
                    duplicates.add(firstSber);
                }
            }
        }
        long end = System.currentTimeMillis();
        NumberFormat formatter = new DecimalFormat("#0.000");
        System.out.println("HashSet time is " + formatter.format((end - start) / 1000d) + " seconds");
        //Execution time is 222,74000 seconds
        return duplicates;
    }
    private static List<UserSber> findDuplicatesTreeSet(Collection<UserSber> collA, Collection<UserSber> collB) {
        List<UserSber> duplicates = new ArrayList<>();
        long start = System.currentTimeMillis();
        for (UserSber firstSber : collA) {
            for (UserSber secondSber : collB) {
                if (firstSber.equals(secondSber)) {
                    duplicates.add(firstSber);
                }
            }
        }
        long end = System.currentTimeMillis();
        NumberFormat formatter = new DecimalFormat("#0.000");
        System.out.println("TreeSet time is " + formatter.format((end - start) / 1000d) + " seconds");
        return duplicates;
    }
    public static void main(String[] args) {
        List<UserSber> userSberList1 = creator(-25_000,25_000);
        List<UserSber> userSberList2 = creator(0,50_000);
        findDuplicatesArrayList(userSberList1, userSberList2);
        findDuplicatesHashSet(userSberList1, userSberList2);
        findDuplicatesTreeSet(userSberList1, userSberList2);
        }

    }


