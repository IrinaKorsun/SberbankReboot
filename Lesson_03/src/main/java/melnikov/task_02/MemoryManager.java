package main.java.melnikov.task_02;

import java.util.Arrays;

public class MemoryManager<T> {
    T[] list = (T[]) new Object[1];

    public int idx;
    public int length = 1;

    public void enlarge() {
        if (idx > length) {
            length <<= 1;
            list = Arrays.copyOf(list, length);
        }
    }
}
