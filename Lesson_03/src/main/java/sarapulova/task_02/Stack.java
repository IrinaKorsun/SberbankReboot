package sarapulova.task_02;

public class Stack {
    private int arrSize;
    private int[] arrStack;
    private int topStack;

    private Stack(int cnt) {
        arrSize = cnt;
        arrStack = new int[arrSize];
        topStack = -1;
    }

    private boolean isEmptyStack() {
        return (topStack == -1);
    }

    private boolean isFullStack() {
        return (topStack == arrSize - 1);
    }

    private void Push(int element) {
        arrStack[++topStack] = element;
    }

    private int Pop() {
        return arrStack[topStack--];
    }


    public static void main(String[] args) {
        Stack mStack = new Stack(5);
        int value;

        System.out.print("Заполняем Стек: \n");
        while (!mStack.isFullStack()) {
            value = (int) (Math.random() * 100);
            System.out.print(value + "\n");
            mStack.Push(value);
        }

        System.out.print("Читаем Стек: \n");
        while (!mStack.isEmptyStack()) {
            value = mStack.Pop();
            System.out.print(value + "\n");
        }

    }


}
