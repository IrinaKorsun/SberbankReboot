package okan.MyFactory;

import sun.invoke.empty.Empty;

public class MainF {
    public static void main(String[] args) {
        MilkFactory factory = new MilkFactory();
        MilkProduct milk = factory.create("milk");
        MilkProduct cheese = factory.create("cheese");
        MilkProduct curd = factory.create("curd");
        milk.Prod ();
        cheese.Prod ();
        curd.Prod ();
    }
}


interface MilkProduct {
    void Prod();
}


class Milk implements MilkProduct {
    @Override
    public void Prod() {
        System.out.println("take Milk");
    }
}
class Cheese implements  MilkProduct{
    @Override
    public void Prod() {
        System.out.println("take Cheese");
    }
}
class Curd implements  MilkProduct{
    @Override
    public void Prod() {
        System.out.println("take Curd");
    }
}

class MilkFactory {
        public MilkProduct create (String TypeMilkProduct) {
            switch (TypeMilkProduct) {
                case "milk" : return new Milk ();
                case "cheese" : return new Cheese ();
                case "curd" : return new Curd ();
                default: return null;
            }
        }
  }



