package melnikov;

public class Task_01 {
    public static void main(String[] args) {
        Singleton a = Singleton.INSTANСE;
        Singleton b = Singleton.INSTANСE;
        System.out.printf("a object named: %s\nb object named: %s\n", a.toString(), b.toString());
    }
}