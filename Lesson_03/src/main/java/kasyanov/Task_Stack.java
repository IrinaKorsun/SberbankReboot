package kasyanov;
// Изучить еще раз что такое стек (LIFO) и реализовать его используя примитивные типы данных + массивы. Понадобится массив, указатель на вершину стека.
// Стек должен поддерживать 2 операции: push(x) – добавить x в стек, и pop() – извлечь верхушку из стека

import java.util.Stack;
public class Task_Stack {
    public static void main(String[] args) {
        String top; // Верхушка стека
        Stack mystack  = new Stack();
        for (int i=0; i<10; i++) {
            mystack.push(i);
            top = mystack.peek().toString();
            System.out.println("Стек : " + mystack + " верхушка стека : " + top);
        }
        for (int i=0; i<9; i++) {
            mystack.pop();
            top = mystack.peek().toString();
            System.out.println("Стек : " + mystack + " верхушка стека : " + top);
        }
    }
}
