package galliamov.Task_02;

public class Pig extends Animals{
    public Pig(String p_sName){
        super(p_sName);
    }

    @Override
    public void vote(){
        System.out.println("Хрю Хрю (Свинья " + getName() + ")");
    }
}
