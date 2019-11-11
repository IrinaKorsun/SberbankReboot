package sharoyko.Task_01;

public class Singleton {
    //приватная статическая ссылка класса на его объект
    private static Singleton mySingletonObject;

    //приватный конструктор
    private Singleton() {
    }

    //открытый статический метод используемый для получения объекта нашего класса
    public static Singleton getMySingletonObject() {
        if (mySingletonObject == null) {
            mySingletonObject = new Singleton();
        }
        return mySingletonObject;
    }
}
