package galliamov.Task_02;

public class Factory {
    public static Animals getAnimal(Select p_sAnimal, String p_sName){
        switch (p_sAnimal){
            case СОБАКА:
                return new Dog(p_sName);
            case КОШКА:
                return new Cat(p_sName);
            case СВИНЬЯ:
                return new Pig(p_sName);
         }
        return new Pig(p_sName);
    }
}
