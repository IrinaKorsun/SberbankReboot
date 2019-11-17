package kasyanov.task_02.factory;

import kasyanov.task_02.entities.Archer;
import kasyanov.task_02.entities.ElfArcher;
import kasyanov.task_02.entities.ElfMage;
import kasyanov.task_02.entities.ElfWarrior;
import kasyanov.task_02.entities.Mage;
import kasyanov.task_02.entities.Warrior;

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