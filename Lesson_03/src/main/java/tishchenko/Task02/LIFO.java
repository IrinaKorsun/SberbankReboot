package tishchenko.Task02;

public class LIFO {

    int leng_stack = 0;
    int[] Stack = new int[leng_stack];

    public void PrintStack() {
        for (int i = 0; i < (this.Stack.length); i++) {
            System.out.println(i + " элемент Стека = " + this.Stack[i]);
        }
    }

    public void FillStack(int leng_stack) {
        Stack = new int[leng_stack];
        for (int i = 0; i < leng_stack; i++) {
            this.Stack[i] = (int) (1 + Math.random() * 10);
        }
    }

    public void Push(int x) {
        System.out.println("Добавление элемента в стека! Элемент = " + x);
        int[] newStack = new int[this.Stack.length + 1];
        for (int i = 0; i < (this.Stack.length); i++) {
            newStack[i] = this.Stack[i];
        }
        newStack[Stack.length] = x;
        this.Stack = newStack;
    }

    public void Pop() {
        System.out.println("Извлечение вершины стека!");
        System.out.println("Вершина стека - " + this.Stack[Stack.length - 1]);
        int[] newStack = new int[this.Stack.length - 1];
        for (int i = 0; i < (this.Stack.length - 1); i++) {
            newStack[i] = this.Stack[i];
        }
        this.Stack = newStack;
    }
}

