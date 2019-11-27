package nalimov;

import org.apache.commons.lang3.RandomStringUtils;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.*;

public class Task_01 {
    private static final int COLLECTION_LENGTH = 100_000;
    //Длина имени и email юзера. Чем меньше эта константа тем вероятнее всего появятся дубли
    private static final int RANDOM_STRING_LENGTH = 3;

    /**
     * Метод генерации рандомного списка юзеров
     *
     * @return список юзеров
     */
    private static Set<UserSber> getRandomUserList() {
        int length = RANDOM_STRING_LENGTH;

        Set<UserSber> user = new HashSet<>();
        for (int i = 0; i <= COLLECTION_LENGTH; i++) {
            String name = RandomStringUtils.random(length, true, false);
            String email = RandomStringUtils.random(length, true, false);
            user.add(new UserSber(name, email));
        }
        return user;


    }

    public static void main(String[] args) {
        Set<UserSber> randomUserList = getRandomUserList();
        System.out.println(randomUserList.size());
        Set<UserSber> randomUserList1 = getRandomUserList();
        System.out.println(randomUserList.size());

        List<UserSber> duplicates = findDuplicates(randomUserList, randomUserList1);


    }

    /**
     * Метод поиска дублей в двух коллекциях
     *
     * @param collA первая коллекция
     * @param collB вторая коллекция
     * @return список дублей
     */
    private static List<UserSber> findDuplicates(Collection<UserSber> collA, Collection<UserSber> collB) {
        List<UserSber> duplicates = new ArrayList<>();
        long start = System.currentTimeMillis();
        for (UserSber firstSber : collA) {
            if (collB.contains(firstSber)) {
                duplicates.add(firstSber);
                System.out.println(firstSber.getUsername());

            }

        }
        long end = System.currentTimeMillis();
        NumberFormat formatter = new DecimalFormat("#0.00000");
        System.out.println("Execution time is " + formatter.format((end - start) / 1000d) + " seconds");
        System.out.println(duplicates.size());

        return duplicates;
    }


}






