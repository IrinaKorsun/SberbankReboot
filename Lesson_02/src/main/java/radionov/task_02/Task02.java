package main.java.radionov.task_02;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        while (true){
            //Считываем первове число
            System.out.println("Введите первое число: ");
            Scanner scannerValue1 = new Scanner(System.in);
            double value1 = scannerValue1.nextDouble();

            //Считываем математическую операцию
            System.out.println("Введите арифметическое действие(+,-,*,/,%)");
            Scanner scanOperation = new Scanner(System.in);
            char operation = scanOperation.next().charAt(0);

            //Считываем второе число
            System.out.println("Введите первое число: ");
            Scanner scannerValue2 = new Scanner(System.in);
            double value2 = scannerValue1.nextDouble();

            //Вычисляем результат
            if(operation == '+'){
                System.out.println("Сумма чисел = " + (value1 + value2));
            }
            if(operation == '-'){
                System.out.println("Разность чисел = " + (value1 - value2));
            }
            if(operation == '*'){
                System.out.println("Произведение чисел = " + (value1 * value2));
            }
            if(operation == '/'){
                System.out.println("Частное чисел = " + (value1 / value2));
            }
            if(operation == '%'){
                System.out.println(value1 + " процент от " + value2 + " = " + (value1 * 100 / value2));
            }
        }
    }
}
