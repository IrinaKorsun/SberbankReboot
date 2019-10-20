package main.java.galliamov;

import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        while(true)
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите выражение в формате 'Число1 Знак Число2' (Знак может быть один из '+', '-', '*', '/', '%'):");
            double dNember1 = Double.valueOf(sc.next());
            String sZnak = sc.next();
            double dNember2 = Double.valueOf(sc.next());

            double dItog = 0;

            switch(sZnak)
            {
                case "+":
                    dItog = dNember1 + dNember2;
                    break;
                case "-":
                    dItog = dNember1 - dNember2;
                    break;
                case "*":
                    dItog = dNember1 * dNember2;
                    break;
                case "/":
                    dItog = dNember1 / dNember2;
                    break;
                case "%":
                    dItog = dNember1 * dNember2 / 100;
                    break;
            }

            System.out.println("Выражение " + dNember1 + " " + sZnak + " " + dNember2 + " = " + dItog);
        }
    }
}
