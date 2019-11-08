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

    public static void setExcem(int p_iExem) {
        if (rExemp == null) {
            rExemp = new Sing(p_iExem);
        }else{
            rExemp.iValue = p_iExem;
        }

        return;
    }

    public static int getExcem() {
        return rExemp.getValue();
    }

}
