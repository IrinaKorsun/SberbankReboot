package sarapulova.task_02;

public class Queue {
    private int arrSize;
    private int[] arrQueue;
    private int headQueue;
    private int tailQueue;

    private Queue(int cnt) {
        arrSize = cnt;
        arrQueue = new int[arrSize];
        headQueue = -1;
        tailQueue = -1;
    }

    private boolean isEmptyQueue() {
        return (headQueue == tailQueue);
    }

    private void Push(int value) {
        if (++tailQueue == arrSize) {
            tailQueue = 0;
        }
        arrQueue[tailQueue] = value;
    }

    private int Pop() {
        if (++headQueue == arrSize) {
            headQueue = 0;
        }
        return arrQueue[headQueue];
    }


    public static void main(String[] args) {
        int size = 5;
        Queue mQueue = new Queue(size);
        int value;

        System.out.print("Заполняем Очередь: \n");
        for (int i = 0; i < size; i++)
        {
            value = (int) (Math.random() * 100);
            System.out.print(value + "\n");
            mQueue.Push(value);
        }

        System.out.print("Читаем Очередь: \n");
        while (!mQueue.isEmptyQueue()) {
            value = mQueue.Pop();
            System.out.print(value + "\n");
        }

    }
}
