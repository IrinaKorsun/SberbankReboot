package main.java.polenok.task_02;

import java.util.Scanner;

/**
 *
 * Класс SuperCalc имеет всего один метод - main.
 * В методе main стартует бесконечный цикл в котором идет считывание двух чисел double (first, second)
 * и действия String (action) с консоли. Если action эквивалентен "exit", бесконечный цикл прерывается,
 * программа завершает свою работу. Если action не эквивалентен "exit", считанные значения передаются
 * в оператор выбора switch, где и происходят необходимые вычисления.
 *
 * ЗЫ если в switch попадет неизвестный action, то выполнится вариант default,
 * который сообщит пользователю о неверно введенном действии.
 *
 **/

public class SuperCalc {
    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Input first num: ");
            double first = scanner.nextDouble();

            System.out.print("Input action (+,-,/,*,%,exit): ");
            String action = scanner.next();

            if (action.equals("exit")){
                break;
            }

            System.out.print("Input second num: ");
            double second = scanner.nextDouble();

            switch (action) {
                case ("+"):
                    System.out.println(first + "+" + second + "=" + (first + second));
                    break;
                case ("-"):
                    System.out.println(first + "-" + second + "=" + (first - second));
                    break;
                case ("*"):
                    System.out.println(first + "*" + second + "=" + (first * second));
                    break;
                case ("/"):
                    System.out.println(first + "/" + second + "=" + (first / second));
                    break;
                case ("%"):
                    System.out.println(first + "%" + second + "=" + (first % second));
                    break;
                default:
                    System.out.println("Unknoun action");
                    break;
            }
        }
    }
}
