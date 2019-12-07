package yushchenko;

public class Singleton_yush {
    private static Singleton_yush needle;

    private Singleton_yush() {
    }

    public static Singleton_yush getSingleton_yush() {
        if (needle == null) {
            needle = new Singleton_yush();
        } else {
            System.out.println("Уже существует один объект  класса! Новый объект не будет создан!");
        }
        return needle;
    }
}
