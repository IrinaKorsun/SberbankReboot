package shevnin;

public class Singleton_shevnin{
    private static Singleton_shevnin static_obj;

    public static Singleton_shevnin getReference() {
        if (static_obj == null) static_obj = new Singleton_shevnin();
        return static_obj;
    }

    private Singleton_shevnin() {}
}
