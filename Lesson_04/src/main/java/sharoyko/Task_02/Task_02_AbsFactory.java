package sharoyko.Task_02;


//создаем абстрактный класс Юнитов содержащий атрибуты здоровья, урона, имена
abstract class Units {
    int hp;
    int damage;
    String name;
}

//создаем интерфейс для Юнита-лучника
interface ArcherUnit {
    void getInfo();
}

//создаем интерфейс для Юнита-волшебника
interface WizardUnit {
    void getInfo();
}

//создаем интерфейс фабрики
interface InterUnitFactory {
    ArcherUnit getArcher();

    WizardUnit getWizard();
}

//создаем класс лучника, расширяем его за счет абстрактного класса Юниты и интерфейса Юнит-лучник
//переопределяем стандартный конструктор
//переопределяем метод getInfo
class Archer extends Units implements ArcherUnit {
    Archer() {
        this.hp = 10;
        this.damage = 5;
        this.name = "Лучник";
    }

    public void getInfo() {
        System.out.println("Здоровье: " + hp + " Урон: " + damage + " Имя: " + name);
    }
}

//создаем класс волшебника, расширяем его за счет абстрактного класса Юниты и интерфейса Юнит-волшебник
//переопределяем стандартный конструктор
//переопределяем метод getInfo
class Wizard extends Units implements WizardUnit {
    Wizard() {
        this.hp = 15;
        this.damage = 8;
        this.name = "Волшебник";
    }

    public void getInfo() {
        System.out.println("Здоровье: " + hp + " Урон: " + damage + " Имя: " + name);
    }
}

//создаем Класс фабрики, расширяем за счет интерфейса фабрики
//переопределяем методы полученные от интерфейса, возвращаем необходимые нам данные
class UnitsFactory implements InterUnitFactory {

    public ArcherUnit getArcher() {
        return new Archer();
    }

    public WizardUnit getWizard() {
        return new Wizard();
    }
}

public class Task_02_AbsFactory {
    public static void main(String[] args) {
        //создаем переменную от интерфейса фабрики
        InterUnitFactory factory;
        //погружаем в такую переменную новый объект фабрики
        factory = new UnitsFactory();
        //создаем объект - лучник
        ArcherUnit archer = factory.getArcher();
        //вызываем метод лучника
        archer.getInfo();
        //создаем объект - волшебник
        WizardUnit wizard = factory.getWizard();
        //вызываем метод волшебника
        wizard.getInfo();
    }
}
