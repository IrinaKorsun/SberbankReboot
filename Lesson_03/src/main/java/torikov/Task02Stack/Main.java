package torikov.Task02Stack;

import java.util.Scanner;

import static java.lang.Math.random;
import static java.lang.Math.toIntExact;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите максимальный размер стека:");
        int n = in.nextInt();
        Stack stack = new Stack(n);
        System.out.println("Стек полон(до заполнения)? " + stack.isFull());
        for (int i = 0; i < n; i++) {
            int t = (int) (Math.random() * 9 + 1);
            stack.push(t);
        }
        System.out.println("Стек полон(после заполнения)? " + stack.isFull());
        System.out.println("Верхний элемент стека: " + stack.readTop());

        System.out.print("Весь стек от верхнего элемента к нижниму(смотрим и очищаем): ");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
        in.close();
    }
}
