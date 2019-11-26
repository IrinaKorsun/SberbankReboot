package sarapulova.task_01;

public class UseSingleton {
    public static void main(String[] args) {
        MySingleton mySing1 = MySingleton.getMySingleton();
        MySingleton mySing2 = MySingleton.getMySingleton();
        System.out.println(mySing1.toString());
        System.out.println(mySing2.toString());
        if (mySing1.equals(mySing2)) {
            System.out.println("Объекты равны - Singleton работает!");
        }
        else {
            System.out.println("Объекты НЕ равны - Singleton реализован некорректно");
        }
    }
}
