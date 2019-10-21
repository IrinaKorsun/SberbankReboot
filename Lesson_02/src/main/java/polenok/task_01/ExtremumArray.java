package main.java.polenok.task_01;

import static java.lang.Math.random;

public class ExtremumArray {

    private static final int DIM = 5;
    public static void main(String[] args) {
        double max=0.0,min=1.0,summ=0.0;
        double[] array = new double[DIM];

        System.out.print("Array = [");
        for (int i = 0; i < array.length; i++) {
            array[i] = random();
            summ += array[i];
            if (array[i] >= max){
                max = array[i];
            }
            if (array[i] <= min){
                min = array[i];
            }
            System.out.print(array[i]+",");
        }
        System.out.println("]");

        System.out.println("Max = "+max);
        System.out.println("Min = "+min);
        System.out.println("Summ = "+summ);
        System.out.println("Avg = "+(summ/DIM));
    }
}
