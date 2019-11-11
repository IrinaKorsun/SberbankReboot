package kasyanov.task_01;

import java.util.Scanner;

//Заполните массив случайным числами и выведете максимальное, минимальное и среднее значение.
//Для генерации случайного числа используйте метод Math.random(), который возвращает значение в промежутке [0, 1].


public class Task_01_Array {
    public static void main(String[] args) {

        // Запрашиваем длину массива
        System.out.print("Введите количество элементов массива: ");
        Scanner k = new Scanner(System.in);
        int dlina = k.nextInt();
        if (dlina < 1) dlina = 1; // чтобы был хотя бы один элемент массива

        // создаем массив
        // так как Math.random() в диапазоне 0-1, ипользуем double.
        double[] myarray = new double[dlina];

        // заполняем массив случайными данными
        for (int i = 0; i < (dlina); i++) {      //заполняем от 0 до 9
            myarray[i] = Math.random();     //присваиваем случайное значение
            //System.out.println(myarray[i]);
        }
        // объявляем переменные для максимального, минимального и среднего значений
        // для максиального и минимального присваиваем значения первого элемента массива
        double max_element = myarray[0], min_element = myarray[0], avg_element = 0;

        for (int i = 0; i < (dlina); i++) {
            if (max_element < myarray[i])
                max_element = myarray[i];
            if (min_element > myarray[i])
                min_element = myarray[i];
            avg_element += myarray[i];
        }

        // вычисление среднего значения
        avg_element = avg_element / dlina;

        System.out.println("max value = " + max_element);
        System.out.println("min value = " + min_element);
        System.out.println("avg = " + avg_element);
    }
}