package shevnin;

import java.sql.Time;
import java.util.*;

public class ShevninFindDuplicates {

    //Поиск дубликатов
    public static List<ShevninUserSber> findDuplicates(Collection<ShevninUserSber> collA, Collection<ShevninUserSber> collB) {
        List<ShevninUserSber> res = new ArrayList();
        HashSet<String> set = new HashSet<>();
        for (ShevninUserSber instance : collA) set.add(instance.getHash());
        for (ShevninUserSber instance : collB) {
            if (!set.add(instance.getHash())) res.add(instance);
        }
         return res;
    }

    //Генерация случайных имён из len символов из прописных латинских букв
    private static String genString(int len) {
        String res = new String();
        //от 65 до 90, 26 символов
        for (int i = 0; i < len; i++) res += (char) (Math.random() * 26 + 65);
        return res;
    }

    //Генерация случайных byte-массивов длиной len
    private static byte[] genByteArr(int len) {
        byte[] res = new byte[len];
        for (int i = 0; i < len; i++) res[i] = (byte) (Math.random() * 256 - 128);
        return res;
    }

    public static void main(String[] args) {
        int counter = 0;
         System.out.println("FindDuplicates");

        Long lostTime = System.currentTimeMillis();
        Collection<ShevninUserSber> collA = new ArrayList<>();
        for (int i = 0; i < 100_000; i++) collA.add(new ShevninUserSber(genString(3), genByteArr(2)));
        System.out.println("Generate collA size = " + collA.size() + "; " + (System.currentTimeMillis() - lostTime) + " milisec.");

        Collection<ShevninUserSber> collB = new ArrayList<>();
        for (int i = 0; i < 100_000; i++) collB.add(new ShevninUserSber(genString(3), genByteArr(2)));
        System.out.println("Generate collB size = " + collB.size() + "; " + (System.currentTimeMillis() - lostTime) + " milisec.");
        lostTime = System.currentTimeMillis();
        List<ShevninUserSber> doubles = findDuplicates(collA, collB);
        lostTime = System.currentTimeMillis() - lostTime;
        System.out.println("Found doubles: ");
        for (ShevninUserSber instance : doubles)
            System.out.println(++counter + ": Username = " + instance.getUsername() + "; Email = " + instance.getEmail() + "; PasswordHash = " + instance.getHEXPasswordHash());
        System.out.println("Lost Time : " + lostTime + " milisec.");
    }
}
