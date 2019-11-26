package radionov.task_04;

import java.util.Scanner;

public class Stack_FIFO {
    private String[] stackArray; //Массив = стек
    private int stackSize;       //Размерность стека
    private int countElem;       //Количество элементов в стеке
    private int firstElem;       //Индекс первого элемента стека

    public Stack_FIFO(int stackSize) {
        this.stackSize = stackSize;
        stackArray = new String[stackSize];
        countElem = 0;
        firstElem = 0;
    }

    //Добавление элемента в стек
    public void push(String x) {
        if (countElem <= (stackSize - 1)) {
            stackArray[countElem] = x;
            System.out.println("Добавили в стек элемент: " + x + " c индексом: " + countElem);
            countElem++;
        } else {
            System.out.println("Превышена размерность стека! Запись НЕ добавлена!!!");
        }
    }

    //Извлечение элемента из стека
    public String pop() {
        String s = stackArray[firstElem];
        System.out.println("Извлекли из стека элемент: " + s + " c индексом: " + firstElem);
        firstElem++;
        return s;
    }

    //Проверка работоспособности стека
    public static void main(String[] args) {
        //Задаем размерность стека
        System.out.print("Введите размерность стека: ");
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();
        Stack_FIFO stackFIFO = new Stack_FIFO(s);
        while (true) {
            System.out.print("Введите \"+\" для добавления элемента в стек или \"-\" - для удаления: ");
            Scanner scanner1 = new Scanner(System.in);
            char i = scanner1.next().charAt(0);

            if (i == '+') {
                System.out.print("Введите значение для записи в стек: ");
                Scanner scanner2 = new Scanner(System.in);
                String a = scanner2.nextLine();
                stackFIFO.push(a);
            }
            if (i == '-') {
                stackFIFO.pop();
            }
        }
    }
}

