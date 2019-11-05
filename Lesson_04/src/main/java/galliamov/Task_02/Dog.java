package galliamov.Task_02;

public class Dog extends Animals {
    public Dog(String p_sName){
        super(p_sName);
    }

    public void vote(){
        System.out.println("Гав Гав Гав (Собака " + getName() + ")");
    }
}
