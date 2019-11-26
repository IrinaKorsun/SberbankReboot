package kurkin.task_02;

public class task_02 {
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.push(5);
        queue.push(15);
        queue.push(25);
        queue.print();
        queue.pop();
        queue.print();
        queue.push(55);
        queue.print();
        queue.pop();
        queue.print();
        queue.pop();
        queue.print();
        queue.pop();
        queue.print();
        queue.pop();

        Stack stack = new Stack();
        stack.push(5);
        stack.push(15);
        stack.push(25);
        stack.print();
        stack.pop();
        stack.print();
        stack.push(55);
        stack.print();
        stack.pop();
        stack.print();
        stack.pop();
        stack.print();
        stack.pop();
        stack.print();
        stack.pop();

    }

}
