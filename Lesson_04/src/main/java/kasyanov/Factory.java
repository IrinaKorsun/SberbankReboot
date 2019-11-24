package kasyanov;

public class Factory {


    // **********************************************************************
    // *                         АБСТРАКТНАЯ ФАБРИКА                        *
    // **********************************************************************

    // Персонажи (Characters): Маг (Mage), Лучник (Archer), Воин (Warrior)
    // Раса (Race): Чельвек (Human), Эльф (Elf)

    //              Абстрактный класс создапния персонажей
    public abstract class CharacterFactory {
        public abstract Mage createMage();          // Маг
        public abstract Archer createArcher();      // Лучник
        public abstract Warrior createWarrior();    // Воин
    }


    //                  Интерфейсы дествий персонажей (не зависит от расы)
    public interface Mage {
        public void cast();             // Интерфейс  Лучника - Стрелять
    }
    public interface Archer {
        public void shoot();            // Интерфейс  Лучника - Стрелять
    }
    public interface Warrior {
        public void attack();           // Интерфейс  Воина - Атаковать
    }

    //          Фабрика создания персонажей - людей
    // Класс созданя людей (мага, лучника, воина) на основе абстрактного класса CharacterFactory
    // и классов мага (HumanMage), лучника (HumanArcher) и эльфа-воина (HumanWarrior)
    public class HumanCharacterFactory extends CharacterFactory {
        public Mage createMage() {
            System.out.println("Создан человек маг");
            return new HumanMage();       // Создание человека - мага
        }
        public Archer createArcher() {
            System.out.println("Создан человек лучник");
            return new HumanArcher();     // Создание человека - лучника
        }
        public Warrior createWarrior() {
            System.out.println("Создан человек воин");
            return new HumanWarrior();    // Создание человека - воина
        }
    }

    //          Фабрика создания персонажей - эльфов
    // Класс созданя альфов (мага, лучника, воина) на основе абстрактного класса CharacterFactory
    // и классов эльфа-мага (ElfMage), эльфа-лучника (ElfArcher) и эльфа-воина (ElfWarrior)
    public class ElfCharacterFactory extends CharacterFactory {
        public Mage createMage() {
            System.out.println("Создан эльф-маг");
            return new ElfMage();       // Создание эльфа - мага
        }
        public Archer createArcher() {
            System.out.println("Создан эльф-лучник");
            return new ElfArcher();     // Создание эльфа - лучника
        }
        public Warrior createWarrior() {
            System.out.println("Создан эльф-воин");
            return new ElfWarrior();    // Создание эльфа - воина
        }
    }

    //                   * * *  Классы персонажей  * * *

    // Классы людей : Маг (HumanMage), лучик (HumanArcher) и воин (HumanWarrior)

    public class HumanMage implements Mage {
        public void cast() {             // метод: использовать магию (Human)
        }
    }
    public class HumanArcher implements Archer {
        public void shoot() {            // метод: использовать лук (Human)
        }
    }
    public class HumanWarrior implements Warrior {
        public void attack() {           // метод: использовать меч (Human)
        }
    }

    // Классы эльфов : эльф-Маг (ElfMage), эльф-лучик (ElfArcher) и эльф-воин (ElfWarrior)

    public class ElfMage implements Mage {
        public void cast() {             // метод: использовать магию (Elf)
        }
    }
    public class ElfArcher implements Archer {
        public void shoot() {            // метод: использовать лук (Elf)
        }
    }
    public class ElfWarrior implements Warrior {
        public void attack() {           // метод: использовать меч (Elf)
        }
    }

        //      Метод создания персонажей
    public static void createCharacter (CharacterFactory myfactory) {
            Mage mage = myfactory.createMage();
            Archer archer = myfactory.createArcher();
            Warrior warrior = myfactory.createWarrior();
            }

    // ************************************************************************
    public static void main(String[] args) {
      //  createCharacter(ElfCharacterFactory);

    }
    // ************************************************************************
}

