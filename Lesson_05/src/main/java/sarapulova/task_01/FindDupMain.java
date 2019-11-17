package sarapulova.task_01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeMap;

public class FindDupMain {

    public static void main(String[] args) {
        long timeStart;
        ArrayList arrayList3;
        int collSize = 100000;

        ArrayList arrayList1 = Funcs.fillArrayList(collSize);
        ArrayList arrayList2 = Funcs.fillArrayList(collSize);

        timeStart= System.currentTimeMillis();
        arrayList3 = Funcs.findDuplicatesArrList(arrayList1,arrayList2);
        System.out.println("TimeFind_ArrList = " + (System.currentTimeMillis() - timeStart) + " mls");
        System.out.println("CountDubl_ArrList = " + arrayList3.size());

        arrayList3.clear();
        HashMap hashMap1 = Funcs.fillHashMap(collSize);
        HashMap hashMap2 = Funcs.fillHashMap(collSize);
        timeStart = System.currentTimeMillis();
        arrayList3 = Funcs.findDuplicatesHashMap (hashMap1,hashMap2);
        System.out.println("TimeFind_HashMap = " + (System.currentTimeMillis() - timeStart) + " mls");
        System.out.println("CountDubl_HashMap = " + arrayList3.size());

        arrayList3.clear();
        TreeMap treeMap1 = Funcs.fillTreeMap(collSize);
        TreeMap treeMap2 = Funcs.fillTreeMap(collSize);
        timeStart = System.currentTimeMillis();
        arrayList3 = Funcs.findDuplicatesTreeMap (treeMap1,treeMap2);
        System.out.println("TimeFind_TreeMap = " + (System.currentTimeMillis() - timeStart) + " mls");
        System.out.println("CountDubl_TreeMap = " + arrayList3.size());
    }
}
