package radionov.task_04;

import java.util.Scanner;

public class Stack_LIFO {
    private String[] stackArray; //Массив = стек
    private int stackSize;       //Размерность стека
    private int countElem;       //Количество элементов в стеке


    public Stack_LIFO(int stackSize) {
        this.stackSize = stackSize;
        stackArray = new String[stackSize];
        countElem = 0;
    }

    //Добавление элемента в стек
    public void push(String x) {
            stackArray[countElem] = x;
            System.out.println("Добавили в стек элемент: " + x + " c индексом: " + countElem);
            countElem++;
    }

    //Извлечение элемента из стека
    public String  pop() {
        String  i = stackArray[--countElem];
        System.out.println("Извлекли из стека элемент: " + i + " c индексом: " + countElem);
        return i;
    }

    //Проверка работоспособности стека
    public static void main(String[] args) {
        //Задаем размерность стека
        System.out.print("Введите размерность стека: ");
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();
        Stack_LIFO stackLIFO = new Stack_LIFO(s);
        while (true) {
            System.out.print("Введите \"+\" для добавления элемента в стек или \"-\" - для удаления: ");
            Scanner scanner1 = new Scanner(System.in);
            char i = scanner1.next().charAt(0);

            if (i == '+') {
                System.out.print("Введите значение для записи в стек: ");
                Scanner scanner2 = new Scanner(System.in);
                String  a = scanner2.nextLine();
                stackLIFO.push(a);
            }
            if (i == '-') {
                stackLIFO.pop();
            }
        }
    }
}
