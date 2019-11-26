package nalimov;

public class Singleton {
    private static Singleton ins = new Singleton();

    private Singleton() {

    }

    public static Singleton getIns() {
        return Singleton.ins;
    }
}
