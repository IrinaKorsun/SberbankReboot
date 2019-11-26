package Okan.task_02;

import java.util.Scanner;

public class CalcScaner {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Введите 1 число:");
        while (!sc.hasNextFloat()) {
            System.out.println("Повторите ввод");
            sc.nextLine();
        }
        float firstz = sc.nextFloat();
        System.out.println("Введите 2 число:");
        while (!sc.hasNextFloat()) {
            System.out.println("Повторите ввод");
            sc.nextLine();
        }
        float secondz = sc.nextFloat();
        System.out.println("Введите знак операции: + - * /");
        String arg = sc.next();
        System.out.println(firstz + arg + secondz + "=" + ressult(firstz,secondz,arg));
        System.out.println("Произвести еще одно вычисление (Да - 1;Нет - 0):");
        byte que = sc.nextByte();
        if (que == 1) {
            System.out.flush();
            main(args);
        }
        else {
            System.out.println("Удачного дня");
            System.exit(0);
        }
    }
    private static float ressult (float f1, float f2, String oper){
        float ressult = 0;
        switch (oper) {
            case "+":
                ressult = f1 + f2;
                break;
            case "-":
                ressult = f1 - f2;
                break;
            case "/":
                ressult = f1 / f2;
                break;
            case "*":
                ressult = f1 * f2;
                break;
        }
        return ressult;
    }
}
