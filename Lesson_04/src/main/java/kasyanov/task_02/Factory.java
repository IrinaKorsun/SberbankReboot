package kasyanov.task_02;

import kasyanov.task_02.entities.Archer;
import kasyanov.task_02.entities.Mage;
import kasyanov.task_02.entities.Warrior;
import kasyanov.task_02.factory.CharacterFactory;
import kasyanov.task_02.factory.ElfCharacterFactory;

public class Factory {

    //      Метод создания персонажей
    public static void createCharacter(CharacterFactory myfactory) {
        Mage mage = myfactory.createMage();
        Archer archer = myfactory.createArcher();
        Warrior warrior = myfactory.createWarrior();
    }

    public static void main(String[] args) {
        ElfCharacterFactory fact = new ElfCharacterFactory();
        createCharacter(fact);
    }
}

