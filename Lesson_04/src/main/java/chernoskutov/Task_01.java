package chernoskutov;

public class Task_01 {
    public static void main(String[] args) {
        MySingleton mySingleton = MySingleton.getInstance();
        System.out.println(mySingleton);
        MySingleton mySingleton2 = MySingleton.getInstance();
        System.out.println(mySingleton2);
        System.out.println(mySingleton.equals(mySingleton2));
        System.out.println(mySingleton == mySingleton2);
    }
}
