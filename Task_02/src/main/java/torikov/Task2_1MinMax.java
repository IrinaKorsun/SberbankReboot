package main.java.torikov;

public class Task2_1MinMax {

    public static void main(String[] args) {

        double[] numbers = new double[10];
        double min = 1;
        double max = 0;
        double middle_number = 0;
        double min_middle = 1;

        for (int i = 0; i < 10; i++) {
            numbers[i] = Math.random();
            System.out.println(numbers[i]);
            if (numbers[i] < min) {
                min = numbers[i];
            }
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        double middle = ((max - min) / 2) + min;

        for (int i = 0; i < 10; i++) {
            if (Math.abs(numbers[i] - middle) < min_middle) {
                min_middle = Math.abs(numbers[i] - middle);
                middle_number = numbers[i];
            }

        }

        System.out.println("Минимальное число:" + min);
        System.out.println("Среднее значение:" + middle);
        System.out.println("Ближайшее к среднему значению число:" + middle_number);
        System.out.println("Максимальное число:" + max);
    }
}
