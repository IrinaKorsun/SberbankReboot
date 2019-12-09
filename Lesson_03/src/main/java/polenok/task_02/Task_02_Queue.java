package polenok.task_02;

import java.util.LinkedList;

class Queue{
    LinkedList queueItems = new LinkedList();

    //Добавляет элемент в очередь.
    public void push(Object i){
        queueItems.addFirst(i);
    }

    //Выводит всю очередь.
    public void printQueue(){
        for (Object i: queueItems) {
            System.out.print(i+";");
        }
        System.out.println();
    }

    //Удаляет элемент из очереди.
    public void pop(){
        if (queueItems.isEmpty()){
            System.out.println("Очередь пуста");
        }
        else{
            queueItems.removeLast();
        }
    }

    // Выводит верхний элемент стека
    public void peek(){
        if ( queueItems.isEmpty()){
            System.out.println("Очередь пуста");
        }
        System.out.println(queueItems.getLast());
    }
}

public class Task_02_Queue {
    public static void main(String[] args) {
        Queue queue = new Queue(); //создаем новый экземпляр
        queue.pop(); // попытка удалить элемент с вершины стека
        for(int i = 0; i < 10; i++){ // заполнение стека в цикле
            queue.push(i);
        }
        queue.printQueue(); // вывод всего стека
        queue.peek(); // вывод верхнего элемента
        queue.pop(); // попытка удалить элемент с вершины стека
        queue.printQueue(); // вывод всего стека
        queue.peek(); // вывод верхнего элемента
    }
}
