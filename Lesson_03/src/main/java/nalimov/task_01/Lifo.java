package nalimov.task_01;

import java.util.Arrays;

public class Lifo {
    //Массив для стека
    int[] stackArray = new int[4];
    //Вершина стека
    int stackPointer = 0;

    //Забираем последний элемент
    public int stackPop() {
        int x;
        x = this.stackArray[--this.stackPointer];
        this.stackArray[this.stackPointer] = 0;
        return x;
    }

    //Добавляем элемент в стек
    public int stackPush(int x) {
        return this.stackArray[this.stackPointer++] = x;
    }

    //Переполнение стека
    public boolean stackOverflow(Lifo lifo) {
        return this.stackPointer < lifo.stackArray.length;
    }

    //Пустой стек, + атрибут i для указания сколько элементов оставить в стеке
    public boolean stackUnderflow(int i, Lifo lifo) {
        return this.stackPointer != i;
    }

    public static void main(String[] args) {

        int i = 0;

        Lifo lifo = new Lifo();

        while (lifo.stackOverflow(lifo)) {

            //System.out.println(i++);
            //System.out.println("stackPointer " + lifo.stackPointer);
            System.out.println("stackPush " + lifo.stackPush(i++));
            //System.out.println("stackPointer " + lifo.stackPointer+"\n");

        }

        System.out.println("stackArray " + Arrays.toString(lifo.stackArray));
        System.out.println("------------------------------------------------------------");

        while (lifo.stackUnderflow(0, lifo)) {

            System.out.println("stackPop " + lifo.stackPop());
            //System.out.println("stackPointer " + lifo.stackPointer);
            //System.out.println("stackArray " + Arrays.toString(lifo.stackArray));

        }

        System.out.println("stackArray " + Arrays.toString(lifo.stackArray));


    }

}
