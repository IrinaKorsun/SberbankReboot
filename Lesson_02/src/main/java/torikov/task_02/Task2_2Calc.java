package torikov.task_02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task2_2Calc {

    public static void main(String[] args) {

        String action = "again";
        Scanner in = new Scanner(System.in);
        System.out.println("Поддерживаются следующие виды операций: \n '+' - сумма \n '-' - разность \n '*' - умножение \n '/' - деление");
        System.out.println(" '%' - остаток от деления");
        while (action.equals("again")) {

            System.out.println("Введите первое число:");
            double number1 = in.nextDouble();
            System.out.println("Введите операцию:");
            String sign = in.next();
            System.out.println("Введите второе число:");
            double number2 = in.nextDouble();

            if (sign.equals("+")) {
                System.out.println("Результат выполнения данной операции:");
                System.out.println(number1 + number2);
            } else if (sign.equals("-")) {
                System.out.println("Результат выполнения данной операции:");
                System.out.println(number1 - number2);
            } else if (sign.equals("*")) {
                System.out.println("Результат выполнения данной операции:");
                System.out.println(number1 * number2);
            } else if (sign.equals("/")) {
                System.out.println("Результат выполнения данной операции:");
                System.out.println(number1 / number2);
            } else if (sign.equals("%")) {
                System.out.println("Результат выполнения данной операции:");
                System.out.println(number1 % number2);
            } else {
                System.out.println("Задана некорректная операция!!!");
                System.out.println("Поддерживаются следующие виды операций: \n '+' - сумма \n '-' - разность \n '*' - умножение \n '/' - деление");
                System.out.println(" '%' - остаток от деления");
            }
            System.out.println("Введите 'again' чтобы продолжить и любой символ чтобы завершить:");
            action = in.next();
        }
        in.close();
    }
}
