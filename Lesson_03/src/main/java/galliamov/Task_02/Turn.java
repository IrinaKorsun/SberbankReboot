package galliamov.Task_02;

public class Turn {
    int l_iBeg;
    int l_iEnd;
    private String[] l_sValue;
    private int l_iCount;

    Turn(int p_iCount) {
        l_iBeg = -1;
        l_iEnd = -1;
        l_iCount = p_iCount;
        l_sValue = new String[l_iCount];
    }

    Turn() {
        this(10);
    }

    public String pop() {
        if (l_iBeg == -1) {
            System.out.println("Очередь пуста");
            return null;
        }

        String sValue;
        sValue = l_sValue[l_iBeg];
        System.out.println("Прочитано [" + l_iBeg + "] ");

        if (l_iBeg == l_iEnd) {
            l_iBeg = -1;
            l_iEnd = -1;
        } else {
            l_iBeg = l_iBeg + 1;
            if (l_iBeg >= l_iCount) {
                l_iBeg = 0;
            }
        }

        return sValue;
    }

    public void push(String p_sValue) {
        l_iEnd = l_iEnd + 1;
        if (l_iBeg == -1) {
            l_iBeg = 0;
        }

        if (l_iEnd >= l_iCount) {
            if (l_iBeg > 0) {
                l_iEnd = 0;
            } else {
                l_iEnd = l_iEnd - 1;
                System.out.println("Очередь переполнена");
                return;
            }
        }
        if (l_iEnd == l_iBeg && l_iEnd != 0) {
            l_iEnd = l_iEnd - 1;
            System.out.println("Очередь переполнена");
            return;
        }

        System.out.println("Добавлено значение в очередь [" + l_iEnd + "] = '" + p_sValue + "'");
        l_sValue[l_iEnd] = p_sValue;
    }

    public static void main(String[] args) {
        Turn St = new Turn(8);

        for (int i = 0; i < 10; i++) {
            St.push(Integer.toString(i));
        }

        for (int i = 0; i < 10; i++) {
            String sValue = St.pop();
            if (sValue != null) {
                System.out.println("Значение из очереди получено '" + sValue + "'");
            }
        }

        for (int i = 0; i < 5; i++) {
            St.push(Integer.toString(i));
        }

        for (int i = 0; i < 3; i++) {
            String sValue = St.pop();
            if (sValue != null) {
                System.out.println("Значение из очереди получено '" + sValue + "'");
            }
        }

        for (int i = 0; i < 7; i++) {
            St.push(Integer.toString(i));
        }

        for (int i = 0; i < 10; i++) {
            String sValue = St.pop();
            if (sValue != null) {
                System.out.println("Значение из очереди получено '" + sValue + "'");
            }
        }

    }
}