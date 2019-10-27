package kurkin.task_02;

import kurkin.TRecord;

//1. Изучить еще раз что такое стек (LIFO) и реализовать его используя примитивные типы данных + массивы. Понадобится массив, указатель на вершину стека. Стек должен поддерживать 2 операции: push(x) – добавить x в стек, и pop() – извлечь верхушку из стека
public class Stack {

    public TRecord tail;

    Stack(){
            tail = new TRecord();
        }


        public void push(int value) {
            TRecord rec = tail;
            tail = new TRecord();
            tail.prev = rec;
            tail.value = value;
            rec.next = tail;
        }

        public void pop() {
            if (tail.prev == null) {
                return;
            }
            System.out.println("Элемент: " + tail.value);
            TRecord rec = tail;
            tail = tail.prev;
            tail.next = null;
            rec.delete();
        }

        public void print() {
            TRecord rec = new TRecord(tail);
            while (rec.prev != null) {
                rec = rec.prev;
            }
            rec = rec.next;
            while (rec != null) {
                System.out.print(rec.value + "   ");
                rec = rec.next;
            }
            System.out.print("\n");
        }

    }