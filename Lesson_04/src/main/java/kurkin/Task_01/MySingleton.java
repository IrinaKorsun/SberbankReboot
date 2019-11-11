package kurkin.Task_01;

public class MySingleton {
    private MySingleton() {
    }

    private static MySingleton instance;

    public static MySingleton get_instance() {
        if (instance == null) {
            instance = new MySingleton();
        }
        return instance;
    }

    public void put_log(String text) {
        System.out.println(text);
    }
}
