package tishchenko.task_01;

import java.util.*;

public class FindDublicates {
    static String letters = "ABC";
    static java.util.Random rand = new java.util.Random();
    static Set<String> identifiers = new HashSet<>();

    public static String NameGenerate() {
        StringBuilder builder = new StringBuilder();
        while (builder.toString().length() == 0) {
            int length = rand.nextInt(5);
            for (int i = 0; i < length; i++) {
                builder.append(letters.charAt(rand.nextInt(letters.length())));
            }
            if (identifiers.contains(builder.toString())) {
                builder = new StringBuilder();
            }
        }
        return builder.toString();
    }

    public static String EmailGenerate() {
        StringBuilder builder = new StringBuilder();
        while (builder.toString().length() == 0) {
            int length = rand.nextInt(5);
            for (int i = 0; i < length; i++) {
                builder.append(letters.charAt(rand.nextInt(letters.length())));
            }
            if (identifiers.contains(builder.toString())) {
                builder = new StringBuilder();
            }
        }
        return builder.toString() + "@sberbank.ru";
    }

    public static byte[] PassGenerate() {
        StringBuilder builder = new StringBuilder();
        while (builder.toString().length() == 0) {
            int length = rand.nextInt(5);
            for (int i = 0; i < length; i++) {
                builder.append(letters.charAt(rand.nextInt(letters.length())));
            }
            if (identifiers.contains(builder.toString())) {
                builder = new StringBuilder();
            }
        }
        return builder.toString().getBytes();
    }

    public static List<UserSber> findDuplicates(Collection<UserSber> collA, Collection<UserSber> collB) {
        long start = System.currentTimeMillis();
        System.out.println("Начал сравнение - " + start);
        ArrayList<UserSber> duble_users = new ArrayList<>();
        HashSet hashCollA = new HashSet(collA);
        HashSet hashCollB = new HashSet(collB);
        for (UserSber element : collB) {
            if (hashCollA.contains(element)) {
                duble_users.add(element);
            }
        }
        long finish = System.currentTimeMillis();
        System.out.println("Закончил сравнение - " + finish);
        System.out.println("Выполнил сравнение за " + ((finish-start))+" миллисекунд");
        if (duble_users.isEmpty() == true){
            System.out.println("Найдено 0 одинаковых пользователей");
        }
        else {
            System.out.println("Найдено "+ duble_users.size() + " одинаковых пользователей");
        }
        return duble_users;
    }

    public static void main(String[] args) {
        List<UserSber> collA = new ArrayList<>();
        List<UserSber> collB = new ArrayList<>();

        for (int i = 0; i < 100000; i++) {
            UserSber a = new UserSber();
            a.setUsername(NameGenerate());
            a.setEmail(EmailGenerate());
            a.setPasswordHash(PassGenerate());
            collA.add(a);

            UserSber b = new UserSber();
            b.setUsername(NameGenerate());
            b.setEmail(EmailGenerate());
            b.setPasswordHash(PassGenerate());
            collB.add(b);
        }
//        System.out.println("CollA - " +collA);
//        System.out.println("CollB - " +collB);
        findDuplicates(collA,collB);
    }
}