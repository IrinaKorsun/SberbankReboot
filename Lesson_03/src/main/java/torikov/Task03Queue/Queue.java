package torikov.Task03Queue;

public class Queue {
    private int[] array;
    private int top;
    private int both;
    private int n;

    public Queue(int n) {
        this.n = n;
        array = new int[n];
        top = -1;
        both = 0;
    }

    public int pop() {
        return array[both++];
    }

    public void push(int elements) {
        array[++top] = elements;

    }

    public boolean isEmpty() {
        return (top == both - 1);
    }

    public boolean isFull() {
        return (top == n - 1);
    }

    public int readTop() {
        return array[top];
    }

    public int readBoth() {
        return array[both];
    }
}
