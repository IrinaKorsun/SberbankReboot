package polenok.task_02;

public class Task_02 {
    public static void main(String[] args) {
        ToysFactory factory;
        ToysFactory factory2;
        factory = new Google();
        factory2 = new Yandex();

        factory.createBear();
        factory.createDoll();
        factory2.createBear();
        factory2.createDoll();
    }
}
