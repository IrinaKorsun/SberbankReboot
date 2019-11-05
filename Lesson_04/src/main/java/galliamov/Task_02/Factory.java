package galliamov.Task_02;

public class Factory {
    public static Animals getAnimal(String p_sAnimal, String p_sName){
        switch (p_sAnimal){
            case ("Собака"):
                return new Dog(p_sName);
            case ("Кошка"):
                return new Cat(p_sName);
            case ("Свинья"):
                return new Pig(p_sName);
        }
        return new Pig(p_sName);
    }
}
