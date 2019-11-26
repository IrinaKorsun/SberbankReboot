package kasyanov;
// Изучить еще раз что такое стек (LIFO) и реализовать его используя примитивные типы данных + массивы. Понадобится массив, указатель на вершину стека.
// Стек должен поддерживать 2 операции: push(x) – добавить x в стек, и pop() – извлечь верхушку из стека

<<<<<<< HEAD
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
=======
//import java.util.Stack;
class Stack {
    int size;
    int[] data;

    Stack(int capacity) {
        data = new int[capacity];
    }

    void push(int value) {
        data[size++] = value;
    }

    int pop() {
        return data[--size];
    }

    int peek() {
        return data[size];
    }
}

public class Task_Stack {
    public static void main(String[] args) {
        String top; // Верхушка стека
        Stack mystack = new Stack(10);
        for (int i = 0; i < 10; i++) {
            mystack.push(i);
            //top = mystack.peek().toString();
            // System.out.println("Стек : " + mystack + " верхушка стека : " + top);
            System.out.println("Стек : " + mystack + " верхушка стека : " + mystack.peek());
        }
        for (int i = 0; i < 9; i++) {
            mystack.pop();
            //top = mystack.peek().toString();
            //System.out.println("Стек : " + mystack + " верхушка стека : " + top);
            System.out.println("Стек : " + mystack + " верхушка стека : " + mystack.peek());
>>>>>>> origin/master
        }
    }
}
