package sarapulova.task_01;

//import java.util.ArrayList;
//import java.util.HashMap;
import java.util.List;
//import java.util.TreeMap;

public class FindDupMain {

    public static void main(String[] args) {

        List arrayList3;
        int collSize = 100000;

        List<UserSber> List1 = Funcs.fillList(collSize);
        List<UserSber> List2 = Funcs.fillList(collSize);
        System.out.println("List1 = " + List1.size());
        System.out.println("List2 = " + List2.size());

        arrayList3 = Funcs.findDuplicatesList(List1,List2, 1);
        arrayList3.clear();
        arrayList3 = Funcs.findDuplicatesList(List1,List2, 2);
        arrayList3.clear();
        arrayList3 = Funcs.findDuplicatesList(List1,List2, 3);
        arrayList3.clear();
        arrayList3 = Funcs.findDuplicatesList(List1,List2, 4);
        arrayList3.clear();

//        timeStart= System.currentTimeMillis();
//        arrayList3 = Funcs.findDuplicatesListEq(List1,List2);
//        System.out.println("TimeFind_ArrList Equals = " + (System.currentTimeMillis() - timeStart) + " mls");
//        System.out.println("CountDubl_ArrList Equals = " + arrayList3.size());
//
//        arrayList3.clear();
//        HashMap hashMap1 = Funcs.fillMap(collSize);
//        HashMap hashMap2 = Funcs.fillMap(collSize);
//        timeStart = System.currentTimeMillis();
//        arrayList3 = Funcs.findDuplicatesHashMap (hashMap1,hashMap2);
//        System.out.println("TimeFind_HashMap = " + (System.currentTimeMillis() - timeStart) + " mls");
//        System.out.println("CountDubl_HashMap = " + arrayList3.size());
//
//        arrayList3.clear();
//        TreeMap treeMap1 = Funcs.fillTreeMap(collSize);
//        TreeMap treeMap2 = Funcs.fillTreeMap(collSize);
//        timeStart = System.currentTimeMillis();
//        arrayList3 = Funcs.findDuplicatesTreeMap (treeMap1,treeMap2);
//        System.out.println("TimeFind_TreeMap = " + (System.currentTimeMillis() - timeStart) + " mls");
//        System.out.println("CountDubl_TreeMap = " + arrayList3.size());
    }
}
