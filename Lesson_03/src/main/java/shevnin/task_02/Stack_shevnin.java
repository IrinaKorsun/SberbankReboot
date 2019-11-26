package shevnin.task_02;

public class Stack_shevnin {

    public static class MyStack {
        protected int[] content;
        protected int position;

        public MyStack(int size) {
            content     = new int[size];
            position    = 0;
        }

        // Добавление элемента в очередь
        void push (int value) {
            content[position] = value;
            position++;
            System.out.print(">" + value+ " ");
        }

        // Извлечение элемента из очереди
        int pop() {
            position--;
            return content[position];
        }
    }

    public static class MyQueue extends MyStack {
        private int head;

        public MyQueue(int size) {
            super(size);
            head    = 0;
        }

        @Override
        //Извлечение элемента из очереди
        int pop() {
            head++;
            return content[head-1];
        }
    }

    public static void main(String[] args) {
        MyStack lifo = new MyStack(5);
        System.out.println("LIFO:");
        lifo.push(3);   //3
        lifo.push(5);   //3,5
        lifo.push(8);   //3,5,8
        System.out.println(" >> " + lifo.pop()); //3,5 >> 8
        lifo.push(9);   //3,5,9
        System.out.println(" >> " + lifo.pop()); //3,5 >> 9
        lifo.push(4);   //3,5,4
        System.out.println(" >> " + lifo.pop()); //3,5 >> 4
        System.out.println(" >> " + lifo.pop()); //3 >> 5
        System.out.println(" >> " + lifo.pop()); //>> 3

        System.out.println("FIFO:");
        MyQueue fifo = new MyQueue(5);
        fifo.push(3);   //3
        fifo.push(5);   //3,5
        fifo.push(8);   //3,5,8
        System.out.println(" >> " + fifo.pop()); //5,8 >> 3
        fifo.push(9);   //5,8,9
        System.out.println(" >> " + fifo.pop()); //8,9 >> 5
        fifo.push(4);   //8,9,4
        System.out.println(" >> " + fifo.pop()); //9,4 >> 8
        System.out.println(" >> " + fifo.pop()); //4 >> 9
        System.out.println(" >> " + fifo.pop()); //>> 4
    }

}
