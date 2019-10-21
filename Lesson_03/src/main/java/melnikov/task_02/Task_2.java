package main.java.melnikov.task_02;

public class Task_2 {
    public static void main(String[] args) {

        Lifo lfo = new Lifo<Integer>();
        Fifo fifo = new Fifo<Integer>();

        System.out.println("Push to LIFO = 0");
        lfo.push(0);
        System.out.println("Push to LIFO = 1");
        lfo.push(1);
        System.out.printf("Pop from LIFO = %d\n", lfo.pop());
        System.out.printf("Pop from LIFO = %d\n", lfo.pop());

        System.out.println("Push to FIFO = 0");
        fifo.push(0);
        System.out.println("Push to FIFO = 1");
        fifo.push(1);
        System.out.printf("Pop from FIFO = %d\n", fifo.pop());
        System.out.printf("Pop from FIFO = %d\n", fifo.pop());
    }
}
