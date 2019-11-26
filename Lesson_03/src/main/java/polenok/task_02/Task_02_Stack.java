package polenok.task_02;

import java.util.LinkedList;

class Stack{
    LinkedList stackItems = new LinkedList();

    //Добавляет элемент на вершину стека.
    public void push(Object i){
        stackItems.addLast(i);
    }

    //Выводит все элементы стека.
    public void printStack(){
        for (Object i: stackItems) {
            System.out.print(i+";");
        }
        System.out.println();
    }

    //Удаляет элемент с вершины стека.
    public void pop(){
        if (stackItems.isEmpty()){
            System.out.println("Стек пуст");
        }
        else{
            stackItems.removeLast();
        }
    }

    // Выводит верхний элемент стека
    public void peek(){
        if (stackItems.isEmpty()){
            System.out.println("Стек пуст");
        }
        System.out.println(stackItems.getLast());
    }
}

public class Task_02_Stack {
    public static void main(String[] args) {
        Stack stack = new Stack(); //создаем новый экземпляр
        stack.pop(); // попытка удалить элемент с вершины стека
        for (int i = 0; i < 10; i++){ // заполнение стека в цикле
            stack.push(i);
        }
        stack.printStack(); // вывод всего стека
        stack.peek(); // вывод верхнего элемента
        stack.pop(); // попытка удалить элемент с вершины стека
        stack.printStack(); // вывод всего стека
        stack.peek(); // вывод верхнего элемента
    }
}
