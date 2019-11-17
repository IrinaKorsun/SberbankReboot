package kasyanov.task_02.factory;

import kasyanov.task_02.entities.Archer;
import kasyanov.task_02.entities.HumanArcher;
import kasyanov.task_02.entities.HumanMage;
import kasyanov.task_02.entities.HumanWarrior;
import kasyanov.task_02.entities.Mage;
import kasyanov.task_02.entities.Warrior;

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