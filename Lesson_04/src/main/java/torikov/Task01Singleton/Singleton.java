package torikov.Task01Singleton;

public class Singleton {
    private static Singleton instance; //добавить в класс приватное статическое поле, содержащее одиночный объект

    private Singleton() { //сделать конструктор класса (конструктор по-умолчанию) приватным
    }                     //(чтобы доступ к нему был закрыть за пределами класса, тогда он не сможет возвращать новые объекты)

    public static Singleton getInstance() { //объявить статический создающий метод, который будет использоваться для получения одиночки
        if (instance == null) {        //если объект еще не создан
            instance = new Singleton();    //создать новый объект
        }
        return instance;        // вернуть ранее созданный объект
    }
}
