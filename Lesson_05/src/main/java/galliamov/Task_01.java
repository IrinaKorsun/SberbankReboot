package galliamov;

import java.util.*;

public class Task_01 {

    private static String GetRand(int p_iLeng){
        int rand;
        String sStr = "";
        for (int iIdx = 0; iIdx < p_iLeng; iIdx ++){
            rand = (int)(Math.random() * 128);
            sStr = sStr + (char)rand;
        }
        return sStr;
    }

    private static UserSber GeyNewUser(){
        UserSber rUser = new UserSber();

        rUser.setUsername(GetRand(5));
        rUser.setEmail(GetRand(5));
        rUser.setPasswordHash(GetRand(5).getBytes());

        return rUser;
    }

    private static List<UserSber> findDuplicates(Collection<UserSber> collA, Collection<UserSber> collB) {
        long start = System.currentTimeMillis();
        List<UserSber> collDupl = new ArrayList<>();

        HashSet hashA = new HashSet(collA);

        for (UserSber rUser : collB) {
            if (hashA.contains(rUser)) {
                collDupl.add(rUser);
            }
        }

        System.out.println("Время работы: " + (System.currentTimeMillis() - start) + " мс." + " Повторов " + collDupl.size());
        return collDupl;
    }

    public static void main(String[] args) {
        List<UserSber> collA = new ArrayList<>();
        List<UserSber> collB = new ArrayList<>();
        List<UserSber> collC = new ArrayList<>();

        UserSber rUser = GeyNewUser();
        collA.add(rUser);
        collB.add(rUser);

        for (int iIdx = 0; iIdx < 100000 - 1; iIdx ++){
            collA.add(GeyNewUser());
            collB.add(GeyNewUser());
        }

        collC = findDuplicates(collA, collB);
    }
}
