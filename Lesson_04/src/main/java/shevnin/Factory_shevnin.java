package shevnin;

public class Factory_shevnin {

    //фабрика по приготовлению еды
    public static Dish[] cook(Food[] food) {
        Dish[] dish = new Dish[food.length];
        for (int i=0; i < food.length; i++) {
            switch (food[i]) {
                case LOSANIA        :   dish[i] = Losania.cook(330);    break;  //готовим лозанью
                case RAVIOLI        :   dish[i] = Pelmeni.cook(150);    break;  //готовим равиоли
                case PELMENI        :   dish[i] = Pelmeni.cook(250);    break;  //готовим пельмени
                case PIZZA          :   dish[i] = Pizza.cook(400);      break;  //готовим пиццу
                case SMALL_PIZZA    :   dish[i] = Pizza.cook(300);      break;  //готовим мини-пиццу
            }
        }
        return dish;
    }

}
