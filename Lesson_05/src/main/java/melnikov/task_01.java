package melnikov;
import java.util.*;

public class task_01 {

    private static final int COUNT_OF_COLLECTION = 100000;

    private static String randomName() {
        int length = (int)(Math.random() * 8);
        char consonents[] = {'b','c','d','f','g','h','j','k','l','m','n','p','q','r','s','t','v','w','x','z'};
        char vowels[] = {'a','e','i','o','u','y'};
        StringBuilder name = new StringBuilder();
        int random = (int)(Math.random() * 26) % 2;
        int count = 0;

        for(int i = 0; i < length; i++) {
            if(random < 2 && count < 2) {
                name.append(consonents[(int)(Math.random() * 26) % 19]);
                count++;
            } else {
                name.append(vowels[(int)(Math.random() * 26) % 5]);
                count = 0;
            }
            random = (int)(Math.random() * 26) % 2;
        }
        return name.toString();
    }

    private static String randomEmail() {
        StringBuilder email = new StringBuilder(randomName());
        email.append("@sberbank.ru");
        return email.toString();
    }

    private static byte[] randomPasswordHash() {
        return randomName().getBytes();
    }

    public static void main(String[] args) {
        List<UserSber> collA = new ArrayList<>();
        List<UserSber> collB = new ArrayList<>();

        for (int i = 0; i < COUNT_OF_COLLECTION; i++ )
        {
            UserSber a = new UserSber();
            a.setUsername(randomName());
            a.setEmail(randomEmail());
            a.setPasswordHash(randomPasswordHash());
            collA.add(a);

            UserSber b = new UserSber();
            b.setUsername(randomName());
            b.setEmail(randomEmail());
            b.setPasswordHash(randomPasswordHash());
            collB.add(b);
        }
        long startTime = System.currentTimeMillis();
        List<UserSber> dublicate = findDuplicates(collA, collB);
        long stopTime = System.currentTimeMillis();
        System.out.printf("Время поиска дубликтов составило: %f секунд, совпало: %d элементов\n", (float)(stopTime-startTime) / 1000.0, dublicate.size());
    }

    public static List< UserSber > findDuplicates(Collection< UserSber > collA, Collection< UserSber > collB)
    {
        HashSet<UserSber> s = new HashSet<>();
        for(int i = 0; i < collA.size(); i++) {
            s.add(((List<UserSber>)collA).get(i));
        }
        List<UserSber> ret = new ArrayList<>();
        for(int i = 0; i < collB.size(); i++) {
            UserSber v = ((List<UserSber>)collB).get(i);
            if (s.contains(v)) {
                ret.add(v);
            }
        }
        return ret;
    }
}
