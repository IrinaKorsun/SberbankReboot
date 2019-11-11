package radionov;

public class TestSingletone {
    public static void main(String[] args) {
        Sun sun1 = Sun.getInstance();
        Sun sun2 = Sun.getInstance();
        System.out.println(sun1 == sun2);
        System.out.println(sun1.equals(sun2));
    }
}
