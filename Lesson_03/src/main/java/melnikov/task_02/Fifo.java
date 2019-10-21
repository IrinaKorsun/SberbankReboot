package main.java.melnikov.task_02;

public class Fifo<T> extends MemoryManager<T> {

    private int last;

    public void push(T val) {
        idx++;
        enlarge();
        list[idx - 1] = val;
    }

    public T pop() {
        if (last >= idx) {
            System.out.println("Fifo overflow");
            return null;
        }
        return list[last++];
    }
}
