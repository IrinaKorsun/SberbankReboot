package sorokina.task_01;

import java.util.Arrays;
import java.util.Scanner;

public class Task_02_Array {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Укажите длину массива");
        int size = sc.nextInt();
        double[] array = new double[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = ((double)(Math.random()));

        }
        System.out.println(Arrays.toString(array));
        System.out.println("Min is :" + getMin(array));
        System.out.println("Max is :" + getMax(array));
        System.out.println("Average is: " + getAverage(array));

    }
    public static double getMin(double array[]) {
        double min = 1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min)
                min = array[i];
        }
        return min;
    }
    public static double getMax(double array[]) {
        double max = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max)
                max = array[i];
        }
        return max;
    }
    public static double getAverage(double array[]) {
        double average = 0;
        for (int i = 0; i < array.length; i++) {
            average += array[i];
        }
        return (average / array.length);
        }

    }
