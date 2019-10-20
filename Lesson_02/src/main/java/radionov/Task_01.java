package main.java.radionov;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task_01 {
    public static void main(String[] args) throws IOException {
        Task_01 t = new Task_01();
        double[] mass = t.initAndWriteMas();
        t.printMas(mass);
        t.minValue(mass);
        t.maxValue(mass);
        t.middleValue(mass);
    }
    //Метод для определения минимального значения массива
    public double minValue(double[] mas){
        double min = mas[0];
        for (double num : mas) {
            if (num < min) {
                min = num;
            }
        }
        System.out.println("Минимальное значение массива = " + min);
        return min;
    }
    //Метод для определения максимального значения массива
    public double maxValue(double[] mas){
        double max = mas[0];
        for (double num : mas) {
            if (num > max) {
                max = num;
            }
        }
        System.out.println("Максимальное значение массива = " + max);
        return max;
    }
    //Метод для определения среднего арифметического значения массива
    public double middleValue(double[]mas){
        double sum = 0;
        for(int i = 0; i < mas.length; i ++){
            sum += mas[i];
        }
        double middle = sum / mas.length;
        System.out.println("Среднее арифметическое значение массива = " + middle);
        return middle;
    }
    //Метод для заполнения массива
    public double[] initAndWriteMas() throws IOException {
        System.out.println("Введите размерность одномерного массива:");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int lengthMas = Integer.parseInt(br.readLine());
        double[] mas = new double[lengthMas];
        for(int i =0; i < lengthMas; i++){
            mas[i] = Math.random();
        }
        return mas;
    }
    //Вывод значения массива в консоль
    public void printMas(double[] mass){
        for(int i =0; i < mass.length; i++){
            System.out.println(mass[i]);
        }
    }


}

