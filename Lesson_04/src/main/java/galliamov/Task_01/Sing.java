package galliamov.Task_01;

public class Sing {
    private static Sing rExemp;
    protected int Value;

    private Sing (int p_iNem) {
        Value = p_iNem;
    }

    private int getValue(){
        return Value;
    }

    public static synchronized Sing setExcem(int p_iExem) {
        if (rExemp == null) {
            rExemp = new Sing(p_iExem);
        }

        return rExemp;
    }

    public static synchronized int getExcem() {
         return rExemp.getValue();
    }

}
