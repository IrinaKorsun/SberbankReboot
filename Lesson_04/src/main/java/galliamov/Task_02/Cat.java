package galliamov.Task_02;

public class Cat extends Animals {
    public Cat(String p_sName){
        super(p_sName);
    }

    @Override
    public void vote(){
        System.out.println("Мяу Мяу Мяу (Кошка " + getName() + ")");
    }
}
