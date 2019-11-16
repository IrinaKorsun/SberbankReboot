package yushchenko.abstractFactory.middleGroup;

import yushchenko.abstractFactory.AbstractKidsGroupFactory;
import yushchenko.abstractFactory.Children;
import yushchenko.abstractFactory.Educator;
import yushchenko.abstractFactory.Nanny;

public class MiddleGroup extends AbstractKidsGroupFactory {
    @Override
    public Educator createEducator() {
        return new MiddleEducator() {

        };
    }

    ;

    @Override
    public Nanny createNanny() {
        return new MiddleNanny() {

        };
    }

    ;

    @Override
    public Children createChildren() {
        return new MiddleChildren() {

        };
    }

    ;
}