package yushchenko.abstractFactory.nursey;

import yushchenko.abstractFactory.Educator;

public class NurseyEducator implements Educator {
    @Override
    public void educate() {
        System.out.println("Educator of KidsGarden educates very little children");
    }
}
