package torikov.Task01Singleton;

public class Main {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        System.out.println("Объект: " + singleton);
        Singleton anotherSingleton = Singleton.getInstance();
        System.out.println("Вроде как создали новый, но новый вернул первый созданный, та дам: " + anotherSingleton);
    }
}
