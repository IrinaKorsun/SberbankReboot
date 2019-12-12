package ostrikova.task_02;

public class Queue {
    int size = 10; // размер очереди
    int[] queue = new int[size];
    int front = -1;  //первый элемент в очереди
    int rear = -1;   // последний элемент в очереди

    public boolean empty() { //проверяем пуста ли очередь
        if (rear == front) {
            return true;
        } else {
            return false;
        }
    }

    public boolean full() { // проверяем заполнена ли очередь
        if (rear == (size - 1)) {
            return true;
        } else {
            return false;
        }
    }

    public void enQueue(int nNext) { //добавляем элемент в очередь
        if (full() == true) {
            System.out.println("Очередь заполнена. Добавить новый элемент невозможно");
        } else {
            rear++;
            queue[rear] = nNext;
            System.out.println("Элемент добавлен в очередь.");
        }
    }

    public void deQueue() { // удаляем элемент из очереди
        if (empty() == true) {
            System.out.println("Очередь пуста. Удаление элемента невозможно");
        } else {
            front++;
            queue[front] = 0;
            System.out.println("Элемент удален из очереди.");
        }
    }

    public void remove() {  //вывести очередь на консоль
        System.out.println("Получена очередь: ");
        for (int i = 0; i <= (queue.length - 1); i++) {
            System.out.print(queue[i] + " ");
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.remove();
        System.out.println("Добавляем элементы в очередь:");
        for (int i = 11; i < 21; i++) {
            q.enQueue(i);
            q.remove();
        }

        System.out.println("Удаляем элементы из очереди:");
        for (int j = 0; j < 10; j++) {
            q.deQueue();
            q.remove();
        }

    }
}