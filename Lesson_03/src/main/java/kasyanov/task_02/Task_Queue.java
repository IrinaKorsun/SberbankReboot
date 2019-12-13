package kasyanov.task_02;

// Не могу запустить этот код в идее так как выходит ошибка:
// Error:(67, 8) java: class Task_01 is public, should be declared in a file named Task_01.java
// и открывается файл package polenok.task_01;    это не мой файл.


// Изучить устройство односторонней очереди (FIFO) и реализовать ее. Понадобится массив с данными, 2 указателя (на голову и хвост). Хвост указывает на конец очереди, а голова на начало.

public class Task_Queue {
    private int[] queue;
    private int maxSize; // максимальное количество элементов в очереди
    private int nElem;  // текущее количество элементов в очереди
    private int front;
    private int rear;

    public Task_Queue(int maxSize) {
        this.maxSize = maxSize;
        queue = new int[maxSize];
        rear = -1;
        front = 0;
        nElem = 0;
    }


    public void add(int elem) {
        if (rear == maxSize - 1) {  // циклический перенос
            rear = -1;
        }
        queue[++rear] = elem;  //увеличение Rear и вставка
        nElem++;  // увеличение количества элементов в очереди
    }

    public int remove() {
        int temp = queue[front++]; // получаем первый элемент из очереди

        if (front == maxSize) { // циклический перенос
            front = 0;
        }
        nElem--; // уменьшаем количество элементов в очереди
        return temp;

    }

    public int getFirst() {
        return queue[front];
    }

    public int getLast() {
        return queue[rear];
    }

    public static void main(String[] args) {
        Task_Queue myqueue = new Task_Queue(10);   // создание очереди, LinkedList - чтобы использовать не только числовые значения
        for (int i = 0; i < 10; i++) {
            (myqueue).add(i);  // добавление элемента в очередь
            System.out.println("Очередь :" + myqueue + "     голова очереди : " + myqueue.getFirst() + "     хвост очереди : " + myqueue.getLast());
        }
        for (int i = 0; i < 9; i++) {
            myqueue.remove();  // удаление элемента из очереди
            System.out.println("Очередь :" + myqueue + "     голова очереди : " + myqueue.getFirst() + "     хвост очереди : " + myqueue.getLast());
        }
    }
}