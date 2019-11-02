package ostrikova;

class Stack {
    int size = 10; //максимальный размер очереди
    int[] array = new int[size];
    int top = 0;
    int n = 0; //текущее количество элементов в стеке

    public boolean empty() { //проверка есть ли в стеке элементы
        if (n == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean full() { //проверка заполнен ли стек
        if (n == size) {
            return true;
        } else {
            return false;
        }
    }

    public void Push(int nNext) { //добавляем элемент в стек
        if (empty() == true) {
            n++;
            array[top] = nNext;
            top++;
        } else if (full() == true) {
            System.out.println("Стек заполнен. Чтобы добавить новый элемента необходимо удалить существующий элемент из стека");
        } else {
            array[top] = nNext;
            n++;
            top++;

            System.out.println("Элемент в стек добавлен");
        }
    }

    public void Pop() { //удаляем элемент из стека
        if (empty() == true) {
            System.out.println("Стек не содержит элементов");
        } else {
            top--;
            n--;
            array[top] = 0;
            System.out.println("Элемент удалён из стека");
        }
    }

    public void remove() { //вывод стека на консоль
        System.out.println("Получаем стек: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }


    public static void main(String[] args) {
        Stack st = new Stack();

        System.out.println("Добавляем элемент в стек");
        for (int i = 12; i <= 21; i++) {
            st.Push(i);
            st.remove();
        }

        System.out.println("Удаляем элемент из стека");
        st.Pop();
        st.remove();
        st.Pop();
        st.remove();
        st.Pop();
        st.remove();
        st.Pop();
        st.remove();
        st.Pop();
        st.remove();
        st.Pop();
        st.remove();
        st.Pop();
        st.remove();
        st.Pop();
        st.remove();
        st.Pop();
        st.remove();
        st.Pop();
        st.remove();
        st.Pop();
        st.remove();
    }
}
