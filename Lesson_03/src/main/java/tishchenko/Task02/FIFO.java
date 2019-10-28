package tishchenko.Task02;

public class FIFO {
    boolean status = false;
    int leng_queue = 0;
    int[] Queue = new int[leng_queue];

    public void PrintQueue() {
        for (int i = 0; i < (this.Queue.length); i++) {
            System.out.println(i + " элемент очереди = " + this.Queue[i]);
        }
    }

    public void FillQueue(int leng_queue) {
        Queue = new int[leng_queue];
        for (int i = 0; i < leng_queue; i++) {
            this.Queue[i] = (int) (1 + Math.random() * 10);
        }
    }

    public void Push(int x) {
        System.out.println("Добавление элемента в очередь! Элемент = " + x);
        int[] newQueue = new int[this.Queue.length + 1];
        for (int i = 0; i < (this.Queue.length); i++) {
            newQueue[i] = this.Queue[i];
        }
        newQueue[Queue.length] = x;
        this.Queue = newQueue;
    }

    public void Pop() {
        System.out.println("Извлечение!");
        System.out.println("Голова  - " + this.Queue[0] + ", Хвост  - " + this.Queue[this.Queue.length - 1]);
        int[] newQueue = new int[this.Queue.length - 1];
        for (int i = 0; i < (this.Queue.length - 1); i++) {
            newQueue[i] = this.Queue[i + 1];
            this.Queue = newQueue;

        }
    }
}
