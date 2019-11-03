package shevnin;

public class main_shevnin {

    public static void main(String[] args) {
        //pattern Singleton
        Singleton_shevnin mySingleton1 = Singleton_shevnin.getReference();  //достаём ссылку1
        System.out.println("mySingleton1 " + mySingleton1);
        Singleton_shevnin mySingleton2 = Singleton_shevnin.getReference();  //достаём ссылку2
        System.out.println("mySingleton2 " + mySingleton2);
        if (mySingleton1 == mySingleton2)
            System.out.println("Class Singleton_shevnin is really Singleton!");  //провреряется равенство ссылок
        //Singleton_shevnin mySingleton3 = new Singleton_shevnin(); //вызов конструктора невозможен

        //pattern Factory
        Food[] food = {Food.PIZZA, Food.LOSANIA, Food.RAVIOLI, Food.SMALL_PIZZA, Food.PELMENI};
        Dish[] dish = Factory_shevnin.cook(food);   //готовим блюда согласно заявленному списку
        for (int i = 0; i < dish.length; i++)
            System.out.println("Dish is " + dish[i].getClass().getName() + ", weight = " + dish[i].getWeight() + "g.");
    }
}
