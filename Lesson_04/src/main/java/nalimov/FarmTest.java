package nalimov;

class Farm {
    public Animal getAnimal(AnimalType in) {
        Animal out = null;

        switch (in) {
            case COW:
                out = new Cow();
                break;
            case PIG:
                out = new Pig();
                break;
            case DUCK:
                out = new Duck();
                break;

        }
        return out;

    }

}

interface Animal {
    void getAnimal();

}

class Cow implements Animal {
    public void getAnimal() {
        System.out.println("мууу");
    }
}

class Pig implements Animal {
    public void getAnimal() {
        System.out.println("хрююю");
    }
}

class Duck implements Animal {
    public void getAnimal() {
        System.out.println("кряяяя");
    }
}

enum AnimalType {COW, PIG, DUCK}

public class FarmTest {
    public static void main(String[] args) {
        Farm factory = new Farm();
        Animal cow = factory.getAnimal(AnimalType.COW);
        cow.getAnimal();
        Animal pig = factory.getAnimal(AnimalType.PIG);
        pig.getAnimal();
        Animal duck = factory.getAnimal(AnimalType.DUCK);
        duck.getAnimal();

    }
}
