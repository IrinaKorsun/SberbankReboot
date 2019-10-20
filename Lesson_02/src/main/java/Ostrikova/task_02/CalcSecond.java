package main.java.Ostrikova.task_02;

import java.util.Scanner;

public class CalcSecond {
    public static void main(String[] args) {
        while (true) {
            Scanner scan = new Scanner(System.in); // подключаем сканнер
            System.out.print("Введите первое число: "); //просим ввести первое число
            double num1 = scan.nextDouble(); // считываем число, которое ввёл пользователь
            System.out.print("Введите второе число: "); //просим ввести второе число
            double num2 = scan.nextDouble(); // считываем число, которое ввёл пользователь

            Scanner op = new Scanner(System.in); // подключаем сканнер
            System.out.print("Введите номер операции, которую хотите произвести с числами: +, -, /, *, или \n% - "+ num1 + " процента от числа " + num2 + "; \n! - " + num2 + " процента от числа " + num1 + ";"); //просим ввести операцию
            char op1 = op.next().charAt(0); // считываем, какую операцию хочет произвести пользователь

            if (op1 == '+') {
                double sum = num1 + num2;
                System.out.println("Сумма чисел " + num1 + " и " + num2 + " будет равна: " + sum); //просим ввести операцию, производим вычисление и выводим результат на консоль
            }

            if (op1 == '-') {
                double dif = num1 - num2;
                System.out.println("Разность чисел " + num1 + " и " + num2 + " будет равна: " + dif); //просим ввести операцию, производим вычисление и выводим результат на консоль
            }

            if (op1 == '/') {
                double div = num1 / num2;
                System.out.println("Частное чисел " + num1 + " и " + num2 + " будет равна: " + div); //просим ввести операцию, производим вычисление и выводим результат на консоль
            }

            if (op1 == '*') {
                double mul = num1 * num2;
                System.out.println("Произведение чисел " + num1 + " и " + num2 + " будет равна: " + mul); //просим ввести операцию, производим вычисление и выводим результат на консоль
            }

            if (op1 == '%') {
                double per1 = (num1 * num2) / 100;
                System.out.println(num1 + " процентов от числа " + num2 + " будет равно: " + per1); //просим ввести операцию, производим вычисление и выводим результат на консоль
            }

            if (op1 == '!') {
                double per2 = (num2 * num1) / 100;
                System.out.println(num2 + " процентов от числа " + num1 + " будет равно: " + per2); //просим ввести операцию, производим вычисление и выводим результат на консоль
            }

        }

    }
}

