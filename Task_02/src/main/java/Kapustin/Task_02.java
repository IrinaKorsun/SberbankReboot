package main.java.Kapustin;

import java.util.Scanner;

public class Task_02 {

    public static String execCalc() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Select operations(or press q for exit): " + System.lineSeparator() +
                "+" + System.lineSeparator() +
                "-" + System.lineSeparator() +
                "*" + System.lineSeparator() +
                "/" + System.lineSeparator());

        String operatSelect = scanner.next();
        if (operatSelect.equals("q")) {
            System.out.println("GodBuy!");
            return "q";
        }

        System.out.print("Enter number one: ");
        double numberFirst = scanner.nextDouble();

        System.out.print("Enter number two: ");
        double numberTwo = scanner.nextDouble();

        switch (operatSelect) {
            case "+":
                return Double.toString(numberFirst + numberTwo);
            case "-":
                return Double.toString(numberTwo - numberFirst);
            case "*":
                return Double.toString(numberFirst * numberTwo);
            case "/":
                return Double.toString(numberTwo / numberFirst);
        }
        return "q";
    }

    public static void main(String[] args) {
        for (; ; ) {
            String result = execCalc();
            if (result.equals("q")) {
                System.exit(-1);
            }
            System.out.println("Result of computation is: " + result + System.lineSeparator());
        }
    }
}
