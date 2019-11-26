package yushchenko;

public class Task_01 {

    public static void main(String[] args) {
        Singleton_yush new1 = Singleton_yush.getSingleton_yush();
        Singleton_yush new2 = Singleton_yush.getSingleton_yush();
        if (new1 == new2) {
            System.out.println("all right");
        }
    }
}
