package ostrikova.task_01;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.*;

//моё сочинение
public class Demo {


    private static List<UserSber> createCollection() {
        //  создаём коллекцию 1
        List<UserSber> user = new ArrayList<>();

        for (int i = 1; i <= 100_000; i++) {
            UserSber UserSber = new UserSber();

            Integer x = 7000 + (int) (Math.random() * 100000);
            UserSber.setUsername(x.toString());

            Integer e = 10000 + (int) (Math.random() * 10000000);
            UserSber.setEmail(e.toString());

            int[] p = new int[5];
            for (int j = 0; j < 5; j++) {
                p[j] = (int) (Math.random() * 9);
                String p1 = String.valueOf(p[j]);
               // UserSber.setPasswordHash(p1);
            }
            user.add(UserSber);
        }
        return user;
    }

    public static void main(String[] args) {
        List<UserSber> createColl1 = createCollection();
        List<UserSber> createColl2 = createCollection();
        List<UserSber> duplicates = findDuplicates(createColl1, createColl2);
        List<UserSber> duplicates2 = findDuplicates(createColl1, createColl2);
    }

    //пишем метод для поиска дублей
    private static List<UserSber> findDuplicates(List<UserSber> collA, List<UserSber> collB) {
        List<UserSber> duplicates = new ArrayList<>();
        long start = System.currentTimeMillis();
        for (UserSber firstSber : collA) {
            for (UserSber secondSber : collB) {
                if (firstSber.equals(secondSber)) {
                    duplicates.add(firstSber);
                    System.out.println(firstSber);
                }
            }
        }
        long end = System.currentTimeMillis();
        NumberFormat formatter = new DecimalFormat("#0.00000");
        System.out.println("Время выполнения " + formatter.format((end - start) / 1000d) + " секунд");
        //Execution time is 222,74000 seconds
        return duplicates;
    }

    //мой метод =метод 2
    private static List<UserSber> findDuplicates2 (ArrayList <UserSber> coll1, ArrayList <UserSber> coll2){
        List<UserSber> duplicates2=new ArrayList<>();           //коллекция для дублей
        ArrayList <UserSber> allElem=new ArrayList<>();     //создаём новую коллекцию, где будут объеденены две коллекции
        long start = System.currentTimeMillis();
        for (int i = 0; i <= 100_000; i++) {
            allElem.add(coll1.get(i)); // добавляем элементы из коллекции 1
        }
        for (int k = 0; k <= 20; k++) {
            allElem.add(coll2.get(k)); // добавляем элементы из коллекции 1
        }

        Set<UserSber> set = new HashSet<UserSber>();

        for (UserSber t : allElem) {
            //здесь пошли изменения
            if (allElem.contains(t)) {
                set.add(t);}
            System.out.println(t);
        }
        long end = System.currentTimeMillis();
        NumberFormat formatter = new DecimalFormat("#0.00000");
        System.out.print("Время выполнения " + formatter.format((end - start) / 1000d) + " секунд");
        return duplicates2;
    }

}