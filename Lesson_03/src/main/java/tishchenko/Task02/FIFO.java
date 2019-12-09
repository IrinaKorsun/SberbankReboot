package tishchenko.Task02;

public class FIFO {
    boolean status = false;
    int leng_queue = 0;
    int[] queue = new int[leng_queue];

    public void printQueue() {
        for (int i = 0; i < (this.queue.length); i++) {
            System.out.println(i + " элемент очереди = " + this.queue[i]);
        }
    }

    public void fillQueue(int leng_queue) {
        queue = new int[leng_queue];
        for (int i = 0; i < leng_queue; i++) {
            this.queue[i] = (int) (1 + Math.random() * 10);
        }
    }

    public void push(int x) {
        System.out.println("Добавление элемента в очередь! Элемент = " + x);
        int[] newQueue = new int[this.queue.length + 1];
        for (int i = 0; i < (this.queue.length); i++) {
            newQueue[i] = this.queue[i];
        }
        newQueue[queue.length] = x;
        this.queue = newQueue;
    }

    public void pop() {
        System.out.println("Извлечение!");
        System.out.println("Голова  - " + this.queue[0] + ", Хвост  - " + this.queue[this.queue.length - 1]);
        int[] newQueue = new int[this.queue.length - 1];
        for (int i = 0; i < (this.queue.length - 1); i++) {
            newQueue[i] = this.queue[i + 1];

        }
        this.queue = newQueue;
    }
}
