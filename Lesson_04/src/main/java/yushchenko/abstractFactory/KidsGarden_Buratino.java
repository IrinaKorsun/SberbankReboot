package yushchenko.abstractFactory;

import yushchenko.abstractFactory.middleGroup.MiddleGroup;
import yushchenko.abstractFactory.nursey.NurseyEducator;
import yushchenko.abstractFactory.nursey.NurseyGroup;

public class KidsGarden_Buratino {
    public static void main(String[] args){
        System.out.println("KidsGarden 'Buratino'");
        NurseyGroup nurseyGroup = new NurseyGroup();
        Educator educator = nurseyGroup.createEducator();
        Nanny nanny = nurseyGroup.createNanny();
        Children children = nurseyGroup.createChildren();
        System.out.println("Nursey-group of Buratino:");
        educator.educate();
        nanny.helpEd();
        children.play();

        MiddleGroup middleGroup = new MiddleGroup();
        Educator educator1 = middleGroup.createEducator();
        Nanny nanny1 = middleGroup.createNanny();
        Children children1 = middleGroup.createChildren();
        System.out.println("Middle-group of Buratino:");
        educator1.educate();
        nanny1.helpEd();
        children1.play();
    }
}
