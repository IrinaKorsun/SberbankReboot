package main.java.radionov.task_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task_01 {
    double[] mas;
    public static void main(String[] args) throws IOException {
        Task_01 t = new Task_01();
        t.initAndWriteMas();
        t.printMas();
        t.minValue();
        t.maxValue();
        t.middleValue();
    }
    //Метод для определения минимального значения массива
    public double minValue(){
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
    public double maxValue(){
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
    public double middleValue(){
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
        mas = new double[lengthMas];
        for(int i =0; i < lengthMas; i++){
            mas[i] = Math.random();
        }
        return mas;
    }
    //Вывод значения массива в консоль
    public void printMas(){
        for(int i =0; i < mas.length; i++){
            System.out.println(mas[i]);
        }
    }


}

