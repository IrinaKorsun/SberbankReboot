package galliamov.Task_02;

public class Test_Factory {
    public static void main(String[] args) {
        Animals[] Farm = new Animals[6];

        Farm[0] = Factory.getAnimal(Select.КОШКА,"Вася");
        Farm[1] = Factory.getAnimal(Select.СОБАКА,"Мася");
        Farm[2] = Factory.getAnimal(Select.СВИНЬЯ,"Бася");
        Farm[3] = Factory.getAnimal(Select.СОБАКА,"Гася");
        Farm[4] = Factory.getAnimal(Select.СВИНЬЯ,"Пепа");
        Farm[5] = Factory.getAnimal(Select.КОШКА,"Пискля");

        for (int i = 0; i < 6; i++){
            Farm[i].vote();
        }
    }
}
