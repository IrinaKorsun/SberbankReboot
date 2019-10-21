package main.java.kasyanov;

import java.util.Scanner;

public class Task_02_Calculator {
    public static void main(String[] args) {
        double result = 0;  // результат выполнения
        char zapusk = 'y'; // переменная, пока равна 'y' программа выполняется

        while (zapusk == 'y') {

            // ввод значений 1 и 2
            System.out.print("Введите первое число: ");
            Scanner k1 = new Scanner(System.in);
            double x = k1.nextDouble();
            System.out.print("Введите второе число: ");
            Scanner k2 = new Scanner(System.in);
            double y = k2.nextDouble();

            int pr = 1; // пока = 1 цикл выполняется, переменная станет равна 0, если будет введен корректный символ
            while (pr == 1) {
                System.out.print("Введите действие ( '+', '-', '*', '/'): ");
                Scanner k3 = new Scanner(System.in);
                char operator = k3.next().charAt(0);

                switch (operator) {
                    case '+':
                        result = x + y;
                        pr = 0;
                        break;
                    case '-':
                        result = x - y;
                        pr = 0;
                        break;
                    case '*':
                        result = x * y;
                        pr = 0;
                        break;
                    case '/':
                        result = x / y;
                        pr = 0;
                        break;
                    default:
                        System.out.println("Введен недопустимый символ. Повторите ввод:");
                } //end swich
            } // end while проверка корректности ввода знака

            System.out.println("Результат: " + result);
            System.out.print("Запустить калькулятор снова (y/n)?");
            Scanner k4 = new Scanner(System.in);
            zapusk = k4.next().charAt(0);

        } // while zapusk
    }
}
