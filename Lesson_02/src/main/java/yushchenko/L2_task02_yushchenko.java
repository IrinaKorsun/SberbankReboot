package main.java.yushchenko;
import main.java.tishchenko.task_01.Array;

import java.util.Arrays;
import java.util.Scanner;

public class L2_task02_yushchenko {
    public static void main(String[] args) {
        String[] operArray = new String[]{"+", "-", "*", "/"};
        Scanner in = new Scanner(System.in);
        int w = 0;
        System.out.println("Введите данные для вычисления. Для выхода из рассчета введите 'exit' вместо операции.");

        while (w != 1) {
            System.out.print("Введите число: ");
            double x = in.nextDouble();
            System.out.print("Введите операцию: ");
            String oper = in.next();
            int err = 1;
            while (err != 0) {
                if (oper.equals("exit")) {
                    System.exit(0);
                } else if (!Arrays.asList(operArray).contains(oper)) {
                    System.out.print("Неверно указана операция! Введите корректную операцию: ");
                    oper = in.next();
                } else {
                    err = 0;
                }
            }
            System.out.print("Введите число: ");
            double y = in.nextInt();
            double z;
            z = 0;
            if (oper.equals("+")) {
                z = x + y;
            } else if (oper.equals("-")) {
                z = x - y;
            } else if (oper.equals("*")) {
                z = x * y;
            } else if (oper.equals("/")) {
                z = x / y;
            }
            System.out.println("Результат: " + z);
        }
    }

}
