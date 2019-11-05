package galliamov.Task_02;

public class Test_Factory {
    public static void main(String[] args) {
        Animals[] Farm = new Animals[6];

        Farm[0] = Factory.getAnimal("Кошка","Вася");
        Farm[1] = Factory.getAnimal("Собака","Мася");
        Farm[2] = Factory.getAnimal("Свинья","Бася");
        Farm[3] = Factory.getAnimal("Кошка","Гася");
        Farm[4] = Factory.getAnimal("ывавы","Гадя");
        Farm[5] = Factory.getAnimal("Собака","Пискля");

        for (int i = 0; i < 6; i++){
            Farm[i].vote();
        }
    }
}
