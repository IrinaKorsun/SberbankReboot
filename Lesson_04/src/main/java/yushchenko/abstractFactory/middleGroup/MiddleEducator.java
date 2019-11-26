package yushchenko.abstractFactory.middleGroup;

import yushchenko.abstractFactory.Educator;

public class MiddleEducator implements Educator {
    @Override
    public void educate() {
        System.out.println("Educator of KidsGarden educates little children");
    }
}
