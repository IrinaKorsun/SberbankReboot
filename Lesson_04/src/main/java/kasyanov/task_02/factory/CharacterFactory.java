package kasyanov.task_02.factory;


// **********************************************************************
// *                         АБСТРАКТНАЯ ФАБРИКА                        *
// **********************************************************************

// Персонажи (Characters): Маг (Mage), Лучник (Archer), Воин (Warrior)
// Раса (Race): Чельвек (Human), Эльф (Elf)

import kasyanov.task_02.entities.Archer;
import kasyanov.task_02.entities.Mage;
import kasyanov.task_02.entities.Warrior;

//              Абстрактный класс создапния персонажей
public abstract class CharacterFactory {
    public abstract Mage createMage();          // Маг
    public abstract Archer createArcher();      // Лучник
    public abstract Warrior createWarrior();    // Воин
}
