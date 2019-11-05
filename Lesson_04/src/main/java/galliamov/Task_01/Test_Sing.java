package galliamov.Task_01;

import java.security.Signature;

public class Test_Sing {
    public static void main(String[] args) {
        Sing.setExcem(7);
        Sing.setExcem(5);
        Sing.setExcem(3);

        System.out.println("Значение паттерна = " + Sing.getExcem());
        System.out.println("Значение паттерна = " + Sing.getExcem());
        System.out.println("Значение паттерна = " + Sing.getExcem());
    }
}
