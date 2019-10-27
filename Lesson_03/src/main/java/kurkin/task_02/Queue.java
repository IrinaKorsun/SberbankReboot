package kurkin.task_02;

import kurkin.TRecord;

public class Queue {
    //2. Изучить устройство односторонней очереди (FIFO) и реализовать ее. Понадобится массив с данными, 2 указателя (на голову и хвост). Хвост указывает на конец очереди, а голова на начало.

    private TRecord head, tail;

    Queue(){
        head = new TRecord();
        tail = new TRecord();
    }


    public void push(int value) {
        TRecord rec = head;
        head = new TRecord();
        head.next = rec;
        head.value = value;
        rec.prev = head;
        if (tail.prev == null) tail = rec;

    }

    private void delElem() {
        if (tail.prev == null) return;
        TRecord rec = tail;
        tail = tail.prev;
        tail.next = null;
        rec.delete();
    }

    public void pop() {
        if (tail.prev == null) return;
        System.out.println("Элемент: " + tail.prev.value);
        this.delElem();
    }

    public void print() {
        TRecord rec = new TRecord(head);
        System.out.print("Текущая очередь: ");
        while (rec.next != null) {
            System.out.print(rec.value + "   ");
            rec = rec.next;
        }
        System.out.print("\n");
    }

}
