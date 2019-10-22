package yushchenko.task_01;

import java.util.Scanner;

public class l2_task01_yushchenko {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int lenArray = in.nextInt();
        double[] myArray = new double[lenArray];
        double minMyArray = 1;
        double maxMyArray = 0;
        double sum = 0;
        double avvMyArray = 0;
        System.out.println("Массив: ");
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = Math.random();
            System.out.println(myArray[i]);
            if (myArray[i] < minMyArray) {
                minMyArray = myArray[i];
            }
            if (myArray[i] > maxMyArray) {
                maxMyArray = myArray[i];
            }
            sum += myArray[i];
        }
        avvMyArray = sum / myArray.length;
        System.out.println("Минимум: " + minMyArray);
        System.out.println("Максимум: " + maxMyArray);
        System.out.println("Среднее: " + avvMyArray);
    }
}
