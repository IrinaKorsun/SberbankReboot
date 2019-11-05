package galliamov.Task_01;

public class Sing {
    private static Sing rExemp;
    protected int iValue;

    private Sing (int p_iNem) {
        iValue = p_iNem;
    }

    private int getValue(){
        return iValue;
    }

    public static Sing setExcem(int p_iExem) {
        if (rExemp == null) {
            rExemp = new Sing(p_iExem);
        }

        return rExemp;
    }

    public static int getExcem() {
        return rExemp.getValue();
    }

}
