package tishchenko.task_02;

import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        String exit = "";
        int firstNumb = 0;
        int secondNumb = 0;
        String action = "";
        double secondNumbDouble = 0.0;
        while (!exit.equals("n")) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("----===FirstCalc!===----");
            System.out.print("Enter FirstNumber: ");
            firstNumb = scanner.nextInt();
            System.out.print("Enter Action(+,-,*,/)");
            action = scanner.next();
            if (action.equals("exit")) {
                break;
            }
            ;
            System.out.print("Enter SecondNumber: ");
            secondNumb = scanner.nextInt();
            secondNumbDouble = (double) secondNumb;
            if (action.equals("+")) {
                System.out.println("Result : " + (firstNumb + secondNumb));
            } else if (action.equals("-")) {
                System.out.println("Result : " + (firstNumb - secondNumb));
            } else if (action.equals("*")) {
                System.out.println("Result : " + (firstNumb * secondNumb));
            } else if (action.equals("/")) {
                System.out.println("Result : " + (firstNumb / secondNumbDouble));
            } else {
                System.out.println("Error - Enter Incorrect action! Please enter the correct action");
            }
            System.out.println("Сontinue?(Enter 'y' to continue, 'n' to Exit");
            exit = scanner.next();
        }
    }
}
