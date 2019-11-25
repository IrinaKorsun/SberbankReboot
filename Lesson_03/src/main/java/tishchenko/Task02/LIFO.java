package tishchenko.Task02;

public class LIFO {

    int leng_stack = 0;
    int[] stack = new int[leng_stack];

    public void printStack() {
        for (int i = 0; i < (this.stack.length); i++) {
            System.out.println(i + " элемент Стека = " + this.stack[i]);
        }
    }

    public void fillStack(int leng_stack) {
        stack = new int[leng_stack];
        for (int i = 0; i < leng_stack; i++) {
            this.stack[i] = (int) (1 + Math.random() * 10);
        }
    }

    public void push(int x) {
        System.out.println("Добавление элемента в стека! Элемент = " + x);
        int[] newStack = new int[this.stack.length + 1];
        for (int i = 0; i < (this.stack.length); i++) {
            newStack[i] = this.stack[i];
        }
        newStack[stack.length] = x;
        this.stack = newStack;
    }

    public void pop() {
        System.out.println("Извлечение вершины стека!");
        System.out.println("Вершина стека - " + this.stack[stack.length - 1]);
        int[] newStack = new int[this.stack.length - 1];
        for (int i = 0; i < (this.stack.length - 1); i++) {
            newStack[i] = this.stack[i];
        }
        this.stack = newStack;
    }
}

