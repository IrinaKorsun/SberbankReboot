package chernoskutov.task_02;

public class Task_02 {
    public static void main(String[] args) {
        //-->Stack start
        MyStack myStack = new MyStack(10);
        for (int i = 0; i < 14; i++) {
            if (!myStack.isFull()) {
                myStack.push(i);
            }
        }
        for (int i = 0; i < 20; i++) {
            if (!myStack.isEmpty()) {
                myStack.pop();
            }
        }
        for (int i = 0; i < 5; i++) {
            myStack.push(i + 20);
        }
        System.out.println(myStack.toString());
        //<--Stack end

        //-->Queue start
        MyQueue myQueue = new MyQueue(10);
        for (int i = 0; i < 12; i++) {
            if (!myQueue.isFull()) {
                myQueue.push(i);
            }
        }
        System.out.println(myQueue.toString());
        for (int i = 0; i < 5; i++) {
            if (!myQueue.isEmpty()) {
                System.out.println("pop #" + i + ": " + myQueue.pop());
            }
        }
        System.out.println(myQueue.toString());
        for (int i = 0; i < 5; i++) {
            if (!myQueue.isFull()) {
                myQueue.push(i + 30);
            }
        }
        System.out.println(myQueue.toString());
        System.out.println(myQueue.pop());
        System.out.println(myQueue.toString());
        //<--Queue end
    }
}
