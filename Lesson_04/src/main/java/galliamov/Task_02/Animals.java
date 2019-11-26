package galliamov.Task_02;

public abstract class Animals {
    private String vName;
    private int iAge;

    public Animals(String p_sName){
        vName = p_sName;
        iAge = 0;
    }

    public String getName(){
        return vName;
    }

    public int getAge() {
        return iAge;
    }

    public abstract void vote();
}
