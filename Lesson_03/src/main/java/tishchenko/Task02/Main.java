package tishchenko.Task02;

public class Main {
    public static void main(String[] args) {
        LIFO Lifo = new LIFO();
        System.out.println("\nРабота со Стеком!\n");
        System.out.println("Заполнение стека");
        Lifo.fillStack(5);
        Lifo.printStack();
        Lifo.push(10);
        System.out.println("Новый вид стека :");
        Lifo.printStack();
        Lifo.pop();
        System.out.println("Новый вид стека :");
        Lifo.printStack();
        System.out.println("\nРабота с очередью!\n");
        FIFO Fifo = new FIFO();
        System.out.println("Заполнение очереди");
        Fifo.fillQueue(7);
        System.out.println("Новый вид очереди:");
        Fifo.printQueue();
        Fifo.push(12);
        System.out.println("Новый вид очереди:");
        Fifo.printQueue();
        Fifo.pop();
        System.out.println("Новый вид очереди:");
        Fifo.printQueue();
    }
}

