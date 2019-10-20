package main.java.sarapulova.task_01;

import java.io.*;

public class Task_02_ArrMinMaxAvr {

    public static void main(String[] args) {
        String strArrSize;

        Console console = System.console();
        if(console != null){
            // считываем данные с консоли
            strArrSize  = console.readLine("Введите размерность массива (от 10 до 100): ");
        }
        else {
            strArrSize = "10";
        }

        try {
            int intArrSize = Integer.valueOf(strArrSize);
            if (intArrSize > 100) {
                intArrSize = 100;
            }
            else if (intArrSize < 10) {
                intArrSize = 10;
            }

            int[] arrRand = initArr(intArrSize);

            int arrMin = arrRand[0];
            int arrMax = arrRand[0];
            double arrAvg = arrRand[0];

            for (int i = 1; i <= intArrSize-1; i++) {
                if (arrRand[i] <= arrMin) {
                    arrMin = arrRand[i];
                }
                if (arrRand[i] >= arrMax) {
                    arrMax = arrRand[i];
                }
                arrAvg = arrAvg + arrRand[i];
            }
            arrAvg = arrAvg/intArrSize;
            showArrRes(arrMin, arrMax, arrAvg);
        }
        catch (Exception e) {
            System.out.println("Введенный символ не является числом");
        }
    }

    private static int[] initArr (int arrSize) {
        int[] arr = new int[arrSize];
        int a = 0; // Начальное значение диапазона
        int b = 100; // Конечное значение диапазона
        for (int i = 0; i < arrSize; i++)
        {
            arr[i] = a + (int) (Math.random() * b);
            System.out.println(arr[i]);
        }
        return arr;
    }

    private static void showArrRes(int arrMin, int arrMax, double arrAvg) {
        System.out.println("Минимальное значение в массиве: " + arrMin);
        System.out.println("Максимальное значение в массиве: " + arrMax);
        System.out.println("Среднее значение: " + arrAvg);
    }
}
