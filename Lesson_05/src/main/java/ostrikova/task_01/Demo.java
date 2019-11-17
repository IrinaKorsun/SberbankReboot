package ostrikova.task_01;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.*;

//моё сочинение
public class Demo {
// я не знала, что можно рандомом текст создавать)) теперь буду знать)) оставила свой вариант

    public static ArrayList<UserSber> createCollection() {  //создаём коллекцию
        //  создаём коллекцию 1
        ArrayList<UserSber> user = new ArrayList<>();

        for (int i = 1; i <= 100_000; i++) {
            UserSber UserSber = new UserSber();

            Integer x = 7000 + (int) (Math.random() * 100000);
            UserSber.setUsername(x.toString());
            String n = x.toString();

            Integer e = 10000 + (int) (Math.random() * 10000000);
            UserSber.setEmail(e.toString());

            int[] p = new int[5];
            for (int j = 0; j < 5; j++) {
                p[j] = (int) (Math.random() * 9);
                String p1 = String.valueOf(p[j]);

            }
            user.add(UserSber);
        }
        return user;
    }

    public static void main(String[] args) {
        ArrayList<UserSber> createColl1 = createCollection();
        ArrayList<UserSber> createColl2 = createCollection();
        List<UserSber> duplicates = findDuplicates(createColl1, createColl2);
        List<UserSber> duplicates2 = findDuplicates(createColl1, createColl2);
    }
    //пишем метод для поиска дублей - это ваш вариант
    public static List<UserSber> findDuplicates(ArrayList<UserSber> collA, ArrayList<UserSber> collB) {
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
        NumberFormat formatter = new DecimalFormat("#0.00000");
        System.out.println("Время выполнения " + formatter.format((end - start) / 1000d) + " секунд");
        //Execution time is 222,74000 seconds
        return duplicates;
    }

    //мой метод =метод 2
    public static List<UserSber> findDuplicates2 (ArrayList <UserSber> coll1, ArrayList <UserSber> coll2){
        List<UserSber> duplicates2=new ArrayList<>();           //коллекция для дублей
        ArrayList <UserSber> allElem=new ArrayList<>();     //создаём новую коллекцию, где будут объеденены две коллекции
        long start = System.currentTimeMillis();
        for (int i = 0; i <= 20; i++) {
            allElem.add(coll1.get(i)); // добавляем элементы из коллекции 1
        }
        for (int k = 0; k <= 20; k++) {
            allElem.add(coll2.get(k)); // добавляем элементы из коллекции 1
        }

        Set<UserSber> set = new HashSet<UserSber>() {
            @Override
            public boolean add(UserSber e) {
                if (contains(e)) {
                    duplicates2.add(e);
                }
                return super.add(e);
            }
        };
        for (UserSber t : allElem) {
            set.add(t);
        }
        long end = System.currentTimeMillis();
        NumberFormat formatter = new DecimalFormat("#0.00000");
        System.out.print("Время выполнения " + formatter.format((end - start) / 1000d) + " секунд");
        return duplicates2;
    }

}


