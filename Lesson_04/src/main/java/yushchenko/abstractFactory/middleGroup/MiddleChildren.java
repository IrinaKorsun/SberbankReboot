package yushchenko.abstractFactory.middleGroup;

import yushchenko.abstractFactory.Children;

public class MiddleChildren  implements Children {
    @Override
    public void play() {
        System.out.println("Little children play");
    }
}
