package polenok.task_01;

public class Task_01 {
    public static void main(String[] args){
        Singleton singleton = Singleton.getInstance();
        Singleton anotherSingleton = Singleton.getInstance();

        System.out.println(singleton);
        System.out.println(anotherSingleton);
    }
}
