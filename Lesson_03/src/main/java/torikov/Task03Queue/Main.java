package torikov.Task03Queue;

import torikov.Task03Queue.Queue;

import java.util.Scanner;

import static java.lang.Math.random;
import static java.lang.Math.toIntExact;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите максимальный размер очереди:");

        int n = in.nextInt();
        Queue queue = new Queue(n);
        while (!queue.isFull()) {
            int t = (int) (Math.random() * 9 + 1);
            System.out.println("Кладем в очередь: " + t);
            queue.push(t);
        }
        System.out.println("Последний добавленный элемент в очередь: " + queue.readTop());
        System.out.println("Элемент который выйдет из очереди первый: " + queue.readBoth());
        System.out.print("Вся очередь от нижнего элемента к верхнему (смотрим и очищаем): ");
        while (!queue.isEmpty()) {
            System.out.print(queue.pop() + " ");
        }
        in.close();
    }
}
