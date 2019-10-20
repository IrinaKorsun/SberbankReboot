package main.java.Ostrikova.task_01;

public class MasSecond {
    public static void main(String[] args) {
        double array[] = new double[8]; // создаём массив из восьми элементов
        System.out.println("Создан массив:");
        for (int i=0; i < array.length; i++) {
            array[i] = Math.random() + 1; // заполняем массив случайными числами
            System.out.println(array[i]); //выводим массив на консоль
        }

        double max = 0;
        for (int i=0; i < array.length; i++) {
            if (array[i]>max){  //сравниваем каждый элемент массива с 0 как с наименьшим значением (массив сформирован из чисел [0,1], ищем какой элемент больше
                max=array[i];
            }
        }
        System.out.println("Максимальный элемент массива: "+max);

        double min = 2;
        for (int i=0; i < array.length; i++) {
            if (array[i]<min){ //сравниваем каждый элемент массива с 2 как с элементом выходящим за пределы массива (массив сформирован из чисел [0,1], ищем какой элемент меньше
                min=array[i];
            }
        }
        System.out.println("Минимальный элемент массива: "+min);
    }
}
