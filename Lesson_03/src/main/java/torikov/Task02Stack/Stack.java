package torikov.Task02Stack;

public class Stack {
    private int[] array;
    private int top;
    private int n;

    public Stack(int n) {
        this.n = n;
        array = new int[n];
        top = -1;
    }

    public int pop() {
        return array[top--];
    }

    public void push(int elements) {
        array[++top] = elements;

    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == n - 1);
    }

    public int readTop() {
        return array[top];
    }
}
