package kuzmina.task_01;

import org.apache.commons.lang3.RandomStringUtils;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Task_01 {

    private static final int COLLECTION_LENGTH = 100_000;
    //Длина имени и email юзера. Чем меньше эта константа тем вероятнее всего появятся дубли
    private static final int RANDOM_STRING_LENGTH = 10;

    /**
     * Метод генерации рандомного списка юзеров
     *
     * @return список юзеров
     */
    private static Collection<UserSber> getRandomUserList() {
        int length = RANDOM_STRING_LENGTH;
        Collection<UserSber> user = new ArrayList<>();
        for (int i = 0; i <= COLLECTION_LENGTH; i++) {
            String name = RandomStringUtils.random(length, true, false);
            String email = RandomStringUtils.random(length, true, false);
            user.add(new UserSber(name, email));
        }
        return user;
    }

    public static void main(String[] args) {
        Collection<UserSber> randomUserList = getRandomUserList();
        Collection<UserSber> randomUserList1 = getRandomUserList();
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
            for (UserSber secondSber : collB) {
                if (firstSber.equals(secondSber)) {
                    duplicates.add(firstSber);
                }
            }
        }
        long end = System.currentTimeMillis();
        NumberFormat formatter = new DecimalFormat("#0.00000");
        System.out.print("Execution time is " + formatter.format((end - start) / 1000d) + " seconds");
        //Execution time is 222,74000 seconds
        return duplicates;
    }
}
