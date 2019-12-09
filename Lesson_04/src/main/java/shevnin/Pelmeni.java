package shevnin;

public class Pelmeni extends Dish {
    private Pelmeni(int weight) {
        super(weight);
    }

    public static Pelmeni cook(int weight) {
        System.out.println("Please, your Pelmeni");
        return new Pelmeni(weight);
    }
}
