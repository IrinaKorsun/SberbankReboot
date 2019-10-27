package kasyanov;
// Изучить устройство односторонней очереди (FIFO) и реализовать ее. Понадобится массив с данными, 2 указателя (на голову и хвост). Хвост указывает на конец очереди, а голова на начало.

import java.util.Queue;
import java.util.LinkedList;

public class Task_Queue {

    public static void main(String[] args) {
        Queue myqueue = new LinkedList();   // создание очереди, LinkedList - чтобы использовать не только числовые значения
        for (int i = 0; i < 10; i++) {
            ((LinkedList) myqueue).add(i);  // добавление элемента в очередь
            System.out.println("Очередь :" + myqueue + "     голова очереди : " + ((LinkedList) myqueue).getFirst() + "     хвост очереди : " + ((LinkedList) myqueue).getLast());
        }
        for (int i = 0; i < 9; i++) {
            ((LinkedList) myqueue).remove();  // удаление элемента из очереди
            System.out.println("Очередь :" + myqueue + "     голова очереди : " + ((LinkedList) myqueue).getFirst() + "     хвост очереди : " + ((LinkedList) myqueue).getLast());
        }
    }
}