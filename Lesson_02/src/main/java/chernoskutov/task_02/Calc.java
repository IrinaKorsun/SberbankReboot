package main.java.chernoskutov.task_02;

import java.util.Scanner;
/**
 * Class <b>the Calculate</b>.
 * @autor Chernoskutov Eugene
 * @version 1.0
 */

public class Calc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== The program calculate ===");
        while (true) {
            double p1;
            double p2;
            String s;
            System.out.println("To text 2 mun and select mathematics operation( + , -, / or *): ");
            System.out.println("type first num:");
            s = sc.nextLine();

            if(isNumber(s)){
                p1 = Double.parseDouble(s);
            } else {
                System.out.println("expect double.");
                continue;
            }
            System.out.println("type second num:");
            s = sc.nextLine();
            if(isNumber(s)){
                p2 = Double.parseDouble(s);
            } else {
                System.out.println("expect double.");
                continue;
            }
            System.out.println("select operation( + , -, / or *):");
            String oper = sc.next();
            System.out.println("Result: ");
            /**
             * calculator method
             * @param p1 - first argument
             * @param p2 - second argument
             * @param oper - operator
             */
            Double result = calcExecutor(p1, p2, oper);
            if (result != null) {
                System.out.println(result + "\n----------NEXT---------------");
            }
        }
    }

    private static boolean isNumber(String s){
        return s.matches("-?\\d+(\\.\\d+)?");
    }

    /**
     * calculator method
     * @return result of operation
     */
    private static Double calcExecutor(double p1, double p2, String oper) {
        if (oper.equals("+")) {
            return p1 + p2;
        } else if (oper.equals("-")) {
            return p1 - p2;
        } else if (oper.equals("/")) {
            if (p2 == 0) {
                System.out.println("division by zero! ");
                return null;
            }
            return p1 / p2;
        } else if (oper.equals("*")) {
            return p1 * p2;
        } else {
            System.out.println("check you input");
        }
        return null;
    }
}
