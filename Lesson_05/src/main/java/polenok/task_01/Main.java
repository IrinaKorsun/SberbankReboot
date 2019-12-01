package polenok.task_01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        ArrayList<SberUser> collection1 = new ArrayList<SberUser>();
        ArrayList<SberUser> collection2 = new ArrayList<SberUser>();

        SberUser test1 = new SberUser();
        test1.setAll("Иванов","Иван","Иванович","ivanov@ivanov.ru");
        collection1.add(test1);
        collection2.add(test1);

        SberUser test2 = new SberUser();
        test2.setAll("Петров","Петр","Петрович","petrovich@moget.ru");
        collection1.add(test2);
        collection2.add(test2);

        for (int i = 0; i < 100_000; i++){
            SberUser user = new SberUser();
            user.genAll();
            collection1.add(user);

            SberUser user2 = new SberUser();
            user2.genAll();
            collection2.add(user2);
        }

        ArrayList<SberUser> dup = (ArrayList<SberUser>) findDuplicates(collection1, collection2);

        for (SberUser user : dup){
            System.out.println(user.getUsername());
        }

    }
    public static List<SberUser> findDuplicates(Collection<SberUser> collection1, Collection<SberUser> collection2) {
        long start = System.currentTimeMillis();
        List<SberUser> dup = new ArrayList<>();

        HashSet<SberUser> hash_col1 = new HashSet<>(collection1);

        for (SberUser user : collection2){
            if (hash_col1.contains(user)){
                dup.add(user);
            }
        }

        long end = System.currentTimeMillis();
        System.out.println(end - start);
        return dup;
    }
}
