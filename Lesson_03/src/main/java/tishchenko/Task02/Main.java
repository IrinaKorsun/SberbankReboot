package tishchenko.Task02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LIFO Lifo = new LIFO();
        System.out.println("\nРабота со Стеком!\n");
        System.out.println("Заполнение стека");
        Lifo.FillStack(5);
        Lifo.PrintStack();
        Lifo.Push(10);
        System.out.println("Новый вид стека :");
        Lifo.PrintStack();
        Lifo.Pop();
        System.out.println("Новый вид стека :");
        Lifo.PrintStack();
        System.out.println("\nРабота с очередью!\n");
        FIFO Fifo = new FIFO();
        System.out.println("Заполнение очереди");
        Fifo.FillQueue(7);
        System.out.println("Новый вид очереди:");
        Fifo.PrintQueue();
        Fifo.Push(12);
        System.out.println("Новый вид очереди:");
        Fifo.PrintQueue();
        Fifo.Pop();
        System.out.println("Новый вид очереди:");
        Fifo.PrintQueue();


    }

}

