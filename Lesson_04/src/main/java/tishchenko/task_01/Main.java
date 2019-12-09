package tishchenko.task_01;

public class Main {
    public static void main(String[] args) {
        Singleton singOne = Singleton.getvalue();
        System.out.println("Link one - "+ singOne);
        Singleton singTwo = Singleton.getvalue();
        System.out.println("Link two - "+ singTwo);
    }
}
