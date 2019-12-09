package shevnin;

public class Losania extends Dish {
    private Losania(int weight) {
        super(weight);
    }

    public static Losania cook(int weight) {
        System.out.println("Please, your Losania");
        return new Losania(weight);
    }
}
