package galliamov.Task_02;

public class Test_Factory {
    public static void main(String[] args) {
        Animals[] Farm = new Animals[6];

        Farm[0] = Factory.GetAnimal("Кошка","Вася");
        Farm[1] = Factory.GetAnimal("Собака","Мася");
        Farm[2] = Factory.GetAnimal("Свинья","Бася");
        Farm[3] = Factory.GetAnimal("Кошка","Гася");
        Farm[4] = Factory.GetAnimal("ывавы","Гадя");
        Farm[5] = Factory.GetAnimal("Собака","Пискля");

        for (int i = 0; i < 6; i++){
            Farm[i].vote();
        }
    }
}
