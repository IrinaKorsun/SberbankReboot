package shevnin;

public class Pizza extends Dish {
    private Pizza(int weight) {
        super(weight);
    }

    public static Pizza cook(int weight) {
        System.out.println("Please, your Pizza");
        return new Pizza(weight);
    }
}
