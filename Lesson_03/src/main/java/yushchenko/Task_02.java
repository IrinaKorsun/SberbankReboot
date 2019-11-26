package yushchenko;

class Stek {
    int ind;
    int[] arr;

    Stek(int n) {
        arr = new int[n];
    }

    public void push(int x) {
        if (ind < arr.length) {
            arr[ind++] = x;
        } else {
            System.out.println("Невозможно добавить новый элемент. Массив полон.");
        }
    }

    public void pop() {
        System.out.println("Извлечен элемент, равный " + arr[ind - 1]);
        arr[--ind] = 0;
    }

    public void printStek() {
        StringBuilder forPrint = new StringBuilder("Массив: (");
        for (int i = 0; i < (arr.length - 1); i++) {
            forPrint.append(arr[i]);
            forPrint.append(",");
        }
        forPrint.append(arr[arr.length - 1]);
        forPrint.append(")");
        System.out.println(forPrint);
    }
}


class Fifo {
    int head;
    int tail;
    int[] arr;

    Fifo() {
        arr = new int[10];
    }

    public void push(int x) {
        if (tail < arr.length) {
            arr[tail++] = x;
        } else {
            System.out.println("ошибка переполнения");
        }
    }

    public void pop() {
        System.out.println("Извлечен элемент, равный " + arr[head]);
        arr[head] = 0;
        if (head < tail) {
            head++;
        }
    }

    public void printStek() {
        String forPrint = new String("Массив: (");
        for (int i = 0; i < (arr.length - 1); i++) {
            forPrint += arr[i] + ",";
        }
        forPrint += arr[arr.length - 1] + ")";
        System.out.println(forPrint);
    }
}

public class Task_02 {
    public static void main(String[] args) {
        int size = 3;
        Stek s = new Stek(size);
        System.out.println("Stek");
        for (int i = 0; i <= size; i++) {
            s.push(i + 1);
            s.printStek();
        }
        s.pop();
        s.printStek();

        System.out.println("FIFO");
        Fifo f = new Fifo();
        for (int i = 0; i <= size; i++) {
            f.push(i + 1);
            f.printStek();
        }
        f.pop();
        f.printStek();
    }
}

