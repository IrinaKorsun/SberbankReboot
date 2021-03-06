package sharoyko.Task_02;


class Stack {

    //размер массива "Стека"
    int N = 5;

    //атрибут означающий хранящий индекс массива означающий верхушку стека
    int top = 0;

    //атрибут хранящий количество занятых ячеек стека
    int kolYacheek = 0;

    //массив "Стека"
    int[] arrStack = new int[N];

    //вносим новое значение в стек
    //для этого проверяем пуст ли он
    //если стек ПОЛНОСТЬЮ пуст, то вносим значение в верхушку и увеличиваем количество занятых ячеек (атрибут kolYacheek) на +1
    //если стек уже не полностью пуст, проделываем те же операции, но помимо этого, перед внесением значения в стек сдвигаем ячейку верхушки на +1
    //если стек полон - выведется сообщение о том что стек заполнен

    public void Push(int x) {
        if (isEmpty() == true) {
            arrStack[top] = x;
            kolYacheek++;
        } else if (isEmpty() == false) {
            if (isFull() == true) {
                System.out.println("Стек заполнен, ввод невозможен");
            } else {
                top++;
                kolYacheek++;
                arrStack[top] = x;
            }
        }
    }

    //возвращаем верхушку стека
    //операция обратная внесению нового значения
    //проверяем чтобы количество занятых ячеек было больше 1
    //тогда берем значение из верхушки стека (выводим его на экран) и уменьшаем значение индекса верхушки и количества занятых ячеек на -1
    //в случае если занятая ячейка осталась одна проделываем те же действия, только в этот раз не уменьшаем значение индекса верхушки
    public void Pop() {
        if (kolYacheek > 1) {
            System.out.println("Верхушка " + arrStack[top] + " извелечена");
            arrStack[top] = 0;
            top--;
            kolYacheek--;
        } else if (kolYacheek == 1) {
            System.out.println("Верхушка " + arrStack[top] + " извелечена");
            arrStack[top] = 0;
            kolYacheek--;
        } else {
            System.out.println("Стек пуст, извлекать нечего");
        }
    }

    //проверяем пуст ли стек, если пуст - возвращаем True
    public boolean isEmpty() {
        if (kolYacheek == 0) {
            return true;
        } else {
            return false;
        }
    }

    //проверяем полон ли стек, если полон - возвращаем True
    public boolean isFull() {
        if (top + 1 == arrStack.length) {
            return true;
        } else {
            return false;
        }
    }

    //выводим весь стек чтобы убедиться что все работает
    public void getStack() {
        for (int i = 0; i < arrStack.length; i++) {
            System.out.println(arrStack[i]);
        }
    }

}

public class Task_02_1 {
    public static void main(String[] args) {
        //создаем новый объект Стека
        Stack a = new Stack();

        //тестовые операции для проверки
        a.Push(1); //добавляем в стек 1
        a.Push(2); //добавляем в стек 2
        a.Push(3); //добавляем в стек 3
        a.Push(4); //добавляем в стек 4
        a.Push(5); //добавляем в стек 5
        a.Push(6); //добавляем в стек 6, так же, здесь покажет что стек полон, ввод невозможен
        a.getStack(); //выводим стек на экран

        a.Pop(); //извлекаем верхушку стека
        a.Pop(); //извлекаем верхушку стека
        a.Pop(); //извлекаем верхушку стека
        a.Pop(); //извлекаем верхушку стека
        a.Pop(); //извлекаем верхушку стека
        a.Pop(); //извлекаем верхушку стека, так же, здесь покажет что стек пуст

        a.Push(10); //добавляем в стек 10
        a.getStack(); //выводим стек на экран
    }

}