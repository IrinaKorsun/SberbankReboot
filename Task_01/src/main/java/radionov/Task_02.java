package main.java.radionov;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task_02 {
    //Метод для определение минимального значения массива
    public int minValue(int[] mas){
        int min = mas[0];
        for (int num : mas) {
            if (num < min) {
                min = num;
            }
        }
        System.out.println("minValue = " + min);
        return min;
    }
    //Метод для определения максимального значения массива
    public int maxValue(int[] mas){
        int max = mas[0];
        for (int num : mas) {
            if (num > max) {
                max = num;
            }
        }
        System.out.println("minValue = " + max);
        return max;
    }
    //Метод для определения среднего значения массива
    public int middleValue(int[]mas){
        int sum = 0;
        for(int i = 0; i < mas.length; i ++){
            sum += mas[i];
        }
        int middle = sum / mas.length;
        System.out.println("Среднее арифметическое значение массива = " + middle);
        return middle;
    }
    //Метод для заполнения массива
    public int[] initAndWriteMas() throws IOException {
        System.out.println("Введите размерность одномерного массива:");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int lengthMas = Integer.parseInt(br.readLine());
        int[] mas = new int[lengthMas];
        for(int i =0; i < lengthMas; i++){
            mas[i] = (int)(Math.random()*100);
            //System.out.println(mas[i]);
        }
        return mas;
    }
    //Вывести значения массива в консоль
    public void printMas(int[] mass){
        for(int i =0; i < mass.length; i++){
            System.out.println(mass[i]);
        }
    }
    public static void main(String[] args) throws IOException {
        Task_02 t = new Task_02();
        int[] mass = t.initAndWriteMas();
        t.printMas(mass);
        t.minValue(mass);
        t.maxValue(mass);
        t.middleValue(mass);
    }

}
