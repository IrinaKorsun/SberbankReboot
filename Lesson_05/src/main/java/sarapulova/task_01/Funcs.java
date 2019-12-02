package sarapulova.task_01;

import java.util.*;

public class Funcs {

    public static List<UserSber> fillList(int collSize) {
        List<UserSber> retList = new ArrayList();

        int randStart = 0; // Начальное значение диапазона
        int randEnd = 200000; // Конечное значение диапазона
        int indKey;
        UserSber userList;
        byte[] arr;

        for (int i = 0; i < collSize; i++)
        {
            indKey = randStart + (int) (Math.random() * randEnd);
            userList = new UserSber();
            userList.setUsername("ivanov_" + indKey);
            userList.setEmail("ivanov_" + indKey  + "@sber.ru");
            arr = new byte[1];
            arr[0] = (byte)indKey;
            userList.setPasswordHash(arr);
            retList.add(userList);
        }
        //System.out.println(retList);
        return retList;
    }



    public static List<UserSber> findDuplicatesList(List<UserSber> collA, List<UserSber> collB, int typeEq) {
        List<UserSber> retList = new ArrayList();
        List<UserSber> tmpList = new ArrayList();
        HashMap tmpMap = new HashMap();
        int tmpHashCode;

        String typeEquals = "";
        long timeStart;
        timeStart= System.currentTimeMillis();

        switch (typeEq) {
            case 1: //сранение поэлементно с циклом по двум спискам
                typeEquals = "ArrayList - 2 For/elements";
                retList.clear();
                for (int i = 0; i < collA.size(); i++) {
                    for (int j = 0; j < collB.size(); j++) {
                        if (collA.get(i).isEquals(collB.get(j))) {
                            retList.add(collA.get(i));
                        }
                    }
                }
                break;
            case 2: //сравнение по hashCode с циклом по двум спискам
                typeEquals = "ArrayList - 2 For/hashCode";
                retList.clear();
                for (int i = 0; i < collA.size(); i++)
                {
                    for (int j = 0; j < collB.size(); j++)
                    {
                        if (collA.get(i).equals(collB.get(j))) {
                            retList.add(collA.get(i));
                        }
                    }
                }
                break;

            case 3: //сравнение через 3й список с использованием contains
                typeEquals = "ArrayList - use 3 List and contains";
                retList.clear();
                tmpList.clear();
                //записываем в 3й список все значения из первого
                for (int i = 0; i < collA.size(); i++) {
                    tmpList.add(collA.get(i));
                }

                //далее пробуем записывать значения из второго списка с проверкой, нет ли уже такого значения в 3м
                for (int j = 0; j < collB.size(); j++) {
                    if (tmpList.contains(collB.get(j))) {
                            retList.add(collB.get(j));
                        }
//                    else {
//                        tmpList.add(collB.get(j));
//                    }
                }
                break;

            case 4: //сравним с использованием HashMap
                typeEquals = "HashMap - use containsKey";
                retList.clear();
                //записываем в HashMap список все значения из первого списка - в ключ пишем HashCode
                for (int i = 0; i < collA.size(); i++) {
                    tmpHashCode = collA.get(i).hashCode();
                    if (tmpMap.containsKey(tmpHashCode) != true) {
                        tmpMap.put(tmpHashCode, collA.get(i));
                    }
                }

                //далее пробуем записывать значения из второго списка с проверкой, нет ли уже такого значения по ключу
                for (int j = 0; j < collB.size(); j++) {
                    tmpHashCode = collB.get(j).hashCode();
                    if (tmpMap.containsKey(tmpHashCode)) {
                        retList.add(collB.get(j));
                    }
//                    else {
//                        tmpMap.put(tmpHashCode, collB.get(j));
//                    }
                }
                break;
        }

        System.out.println("TypeEquals = " + typeEq + "  " + typeEquals);
        System.out.println("TimeFind = " + (System.currentTimeMillis() - timeStart) + " mls");
        System.out.println("CountDouble = " + retList.size());
        return retList;
    }


//    public static HashMap<Integer, UserSber> fillMap(int collSize) {
//        HashMap retMap = new HashMap();
//        int randStart = 0; // Начальное значение диапазона
//        int randEnd = 200000; // Конечное значение диапазона
//        int cnt = 0;
//        int indKey;
//        UserSber userList;
//        byte[] arr;
//
//        while (cnt < collSize)
//        {
//            indKey = randStart + (int) (Math.random() * randEnd);
//            while (retMap.containsKey(indKey)) {
//                indKey = randStart + (int) (Math.random() * randEnd);
//            }
//            userList = new UserSber();
//            userList.setUsername("ivanov_" + indKey);
//            userList.setEmail("ivanov_" + indKey  + "@sber.ru");
//            arr = new byte[1];
//            arr[0] = (byte)indKey;
//            userList.setPasswordHash(arr);
//            retMap.put(indKey, userList);
//            cnt++;
//        }
//        //System.out.println(retList);
//        return retMap;
//    }
//
//    public static TreeMap<Integer, UserSber> fillTreeMap(int collSize) {
//        TreeMap retList = new TreeMap();
//        int randStart = 0; // Начальное значение диапазона
//        int randEnd = 200000; // Конечное значение диапазона
//        int cnt = 0;
//        int indKey;
//        UserSber userList;
//        byte[] arr;
//
//        while (cnt < collSize)
//        {
//            indKey = randStart + (int) (Math.random() * randEnd);
//            while (retList.containsKey(indKey)) {
//                indKey = randStart + (int) (Math.random() * randEnd);
//            }
//            userList = new UserSber();
//            userList.setUsername("ivanov_" + indKey);
//            userList.setEmail("ivanov_" + indKey  + "@sber.ru");
//            arr = new byte[1];
//            arr[0] = (byte)indKey;
//            userList.setPasswordHash(arr);
//            retList.put(indKey, userList);
//            cnt++;
//        }
//        return retList;
//    }

//    public static List<UserSber> findDuplicatesHashMap(HashMap<Integer, UserSber> collA, HashMap<Integer, UserSber> collB) {
//        ArrayList retList = new ArrayList();
//        for (Map.Entry entry: collA.entrySet())
//        {
//            if (collB.containsKey(entry.getKey())) {
//                retList.add(entry.getValue());
//            }
//        }
//        return retList;
//    }
//
//    public static List<UserSber> findDuplicatesTreeMap(TreeMap<Integer, UserSber> collA, TreeMap<Integer, UserSber> collB) {
//        //List<UserSber> retList = new ArrayList();
//        ArrayList retList = new ArrayList();
//        for (Map.Entry entry: collA.entrySet())
//        {
//            if (collB.containsKey(entry.getKey())) {
//                retList.add(entry.getValue());
//            }
//        }
//        return retList;
//    }
}