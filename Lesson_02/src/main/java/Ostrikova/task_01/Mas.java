package main.java.Ostrikova.task_01;

public class Mas {
    public static void main(String[] args) {
        double array[] = new double[3]; // создаём массив из трёх элементов
        array[0] = Math.random() + 1;
        array[1] = Math.random() + 1;
        array[2] = Math.random() + 1;

        System.out.println("Создан массив из случайных чисел:");// выводим массив на консоль
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);

        double mx = Math.max(array[0], array[1]); // сравниваем первые два элемента и находим больший из них
        double mx1 = Math.max(mx, array[2]); // сравниваем наибольший из первых двух элементов с третим и находим максимум
        System.out.println("Наибольшее число массива: " + mx1);

        double mn = Math.min(array[0], array[1]); // сравниваем первые два элемента и находим меньший из них
        double mn1 = Math.min(mx, array[2]); // сравниваем меньший из первых двух элементов с третим и находим минимум
        System.out.println("Наименьшее число массива: " + mn);
    }
}

