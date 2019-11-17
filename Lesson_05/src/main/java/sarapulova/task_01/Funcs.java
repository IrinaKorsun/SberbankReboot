package sarapulova.task_01;

import java.util.*;

public class Funcs {

    public static ArrayList< UserSber > fillArrayList(int collSize) {
        ArrayList retList = new ArrayList();

        int a = 0; // Начальное значение диапазона
        int b = 200000; // Конечное значение диапазона
        int ind;
        UserSber userList;
        byte[] arr;

        for (int i = 0; i < collSize; i++)
        {
            ind = a + (int) (Math.random() * b);
            userList = new UserSber();
            userList.setUsername("ivanov_" + ind);
            userList.setEmail("ivanov_" + ind  + "@sber.ru");
            arr = new byte[1];
            arr[0] = (byte)ind;
            userList.setPasswordHash(arr);
            retList.add(i, userList);
        }
        //System.out.println(retList);
        return retList;
    }


    public static HashMap<Integer, UserSber> fillHashMap(int collSize) {
        HashMap retList = new HashMap();
        int a = 0; // Начальное значение диапазона
        int b = 200000; // Конечное значение диапазона
        int cnt = 0;
        int ind;
        UserSber userList;
        byte[] arr;

        while (cnt < collSize)
        {
            ind = a + (int) (Math.random() * b);
            while (retList.containsKey(ind)) {
                ind = a + (int) (Math.random() * b);
            }
            userList = new UserSber();
            userList.setUsername("ivanov_" + ind);
            userList.setEmail("ivanov_" + ind  + "@sber.ru");
            arr = new byte[1];
            arr[0] = (byte)ind;
            userList.setPasswordHash(arr);
            retList.put(ind, userList);
            cnt++;
        }
        //System.out.println(retList);
        return retList;
    }

    public static TreeMap<Integer, UserSber> fillTreeMap(int collSize) {
        TreeMap retList = new TreeMap();
        int a = 0; // Начальное значение диапазона
        int b = 200000; // Конечное значение диапазона
        int cnt = 0;
        int ind;
        UserSber userList;
        byte[] arr;

        while (cnt < collSize)
        {
            ind = a + (int) (Math.random() * b);
            while (retList.containsKey(ind)) {
                ind = a + (int) (Math.random() * b);
            }
            userList = new UserSber();
            userList.setUsername("ivanov_" + ind);
            userList.setEmail("ivanov_" + ind  + "@sber.ru");
            arr = new byte[1];
            arr[0] = (byte)ind;
            userList.setPasswordHash(arr);
            retList.put(ind, userList);
            cnt++;
        }
        return retList;
    }


    public static ArrayList< UserSber > findDuplicatesArrList(ArrayList<UserSber> collA, ArrayList<UserSber> collB) {
        ArrayList retList = new ArrayList<UserSber>();
        int k = 0;

        for (int i = 0; i < collA.size(); i++)
        {
            for (int j = 0; j < collB.size(); j++)
            {
                if (collA.get(i).isEquals(collB.get(j))) {
                    retList.add(k, collA.get(i));
                    k = k++;
                }
            }
        }
        return retList;
    }


    public static ArrayList<UserSber > findDuplicatesHashMap(HashMap<Integer, UserSber> collA, HashMap<Integer, UserSber> collB) {
        ArrayList retList = new ArrayList<UserSber>();
        int k = 0;

        for (Map.Entry entry: collA.entrySet())
        {
            if (collB.containsKey(entry.getKey())) {
                retList.add(k, entry.getValue());
                k = k++;
            }
        }
        return retList;
    }

    public static ArrayList<UserSber > findDuplicatesTreeMap(TreeMap<Integer, UserSber> collA, TreeMap<Integer, UserSber> collB) {
        ArrayList retList = new ArrayList<UserSber>();
        int k = 0;

        for (Map.Entry entry: collA.entrySet())
        {
            if (collB.containsKey(entry.getKey())) {
                retList.add(k, entry.getValue());
                k = k++;
            }
        }
        return retList;
    }
}
