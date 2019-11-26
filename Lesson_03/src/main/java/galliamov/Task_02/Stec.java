package galliamov.Task_02;

public class Stec {
    private int l_iIdx;
    private String[] l_sValue;
    private int l_iCount;

    Stec(int p_iCount) {
        l_iCount = p_iCount;
        l_sValue = new String[l_iCount];
        l_iIdx = -1;
    }

    public String pop() {
        if (l_iIdx < 0) {
            System.out.println("Стек пуст");
            l_iIdx = -1;
            return null;
        }

        String sValue;
        sValue = l_sValue[l_iIdx];

        l_iIdx = l_iIdx - 1;

        return sValue;
    }

    public void push(String p_sValue) {
        l_iIdx = l_iIdx + 1;
        if (l_iIdx >= l_iCount) {
            System.out.println("Стек переполнен");
            l_iIdx = l_iCount - 1;
            return;
        }
        System.out.println("Добавлено значение в стек = '" + p_sValue + "'");
        l_sValue[l_iIdx] = p_sValue;
    }

    public static void main(String[] args) {
        Stec St = new Stec(8);

        for (int i = 0; i < 10; i++) {
            St.push(Integer.toString(i));
        }

        for (int i = 0; i < 10; i++) {
            String sValue = St.pop();
            if (sValue != null) {
                System.out.println("Значение из стека получено '" + sValue + "'");
            }
        }
    }
}
