package melnikov.task_02;

public class Lifo<T> extends MemoryManager<T> {

    public void push(T val) {
        idx++;
        enlarge();
        list[idx - 1] = val;
    }

    public T pop() {
        if (--idx < 0) {
            System.out.println("Lifo overflow");
            return null;
        }
        return list[idx];
    }
}
