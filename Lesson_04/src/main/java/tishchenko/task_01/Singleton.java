package tishchenko.task_01;

public class Singleton {
    //Создаем конструктор
    private Singleton() {
    }
    //Создаем переменную
    private static Singleton value;

    //Создаем метод, возвращающий ссылку
    public static Singleton getvalue() {
        if (value == null) {
            value = new Singleton();
        }
        return value;
    }

}
