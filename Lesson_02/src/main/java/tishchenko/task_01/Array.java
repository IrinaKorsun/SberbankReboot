package main.java.tishchenko.task_01;
import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        double[] array = new double[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random();
            System.out.println(array[i]);
        }
        Arrays.sort(array);
        System.out.println("min " + array[0]);
        System.out.println("max " + array[array.length - 1]);
        if (array.length % 2 == 0) {
            System.out.println("median " + array[array.length / 2] + " or " + array[(array.length / 2) - 1]);
        } else {
            System.out.println("median " + array[array.length / 2]);
        }
    }
}

