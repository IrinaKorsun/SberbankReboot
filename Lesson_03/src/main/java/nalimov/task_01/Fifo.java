package nalimov.task_01;

import java.util.Arrays;

public class Fifo {
    //Массив для очереди
    int[] queArray = new int[4];
    //Конец очереди
    int queTail = 0;
    //Начало очереди
    int queHear = 0;

    //Забираем из очереди
    public int queGet() {
        return this.queArray[this.queHear++] = 0;
    }

    //Добавляем в очередь
    public int quePut(int x) {
        return this.queArray[this.queTail++] = x;
    }

    //Проверка конца массива
    public boolean getQueArrayLength() {
        return this.queTail == this.queArray.length;
    }

    public void setQueTail(int quePointer) {
        this.queTail = quePointer;
    }

    public void setQueHear(int queHear) {
        this.queHear = queHear;
    }

    //Добавляем, в очередь из 4х ячеек, 110 элементов, при заполнении вычитываем
    public static void main(String[] args) {
        Fifo fifo = new Fifo();
        for (int i = 0; i <= 5; i++) {
            fifo.quePut(i);
            System.out.println("quePut " + Arrays.toString(fifo.queArray));
            if (fifo.getQueArrayLength()) {
                for (int a = 0; a < fifo.queTail; a++) {
                    fifo.queGet();
                    System.out.println("queGet " + Arrays.toString(fifo.queArray));
                }
                System.out.println("----------------------------------");
                fifo.setQueHear(0);
                fifo.setQueTail(0);
            }
        }
        for (int a = 0; a < fifo.queTail; a++) {
            fifo.queGet();
            System.out.println("queGet " + Arrays.toString(fifo.queArray));
        }

    }

}
