package kurkin;

import java.util.Arrays;
import java.util.Random;

public class Array {

    private static void print(int[] p_numbers) {
        for(int i = 0; i < p_numbers.length; i++){
            System.out.print(p_numbers[i]);
            if (i < p_numbers.length - 1) {
                System.out.print(", ");
            } else {
                System.out.print("\n");
            };
        }
    }
    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = new int[10]; //array_int_numbers

        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(31);
        }

        Arrays.sort(numbers);
        int min = numbers[0];
        int max = numbers[numbers.length-1];
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        float avg = (float)sum/numbers.length;
        System.out.println("Элементы массива:");
        print(numbers);
        System.out.println("Минимум: " + min);
        System.out.println("Максимум: " + max);
        System.out.println("Среднее: " + avg + " (сумма элемнтов массива = " + sum + ")");
    }
}
