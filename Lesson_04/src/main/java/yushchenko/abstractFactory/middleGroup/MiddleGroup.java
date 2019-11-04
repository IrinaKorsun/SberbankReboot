package yushchenko.abstractFactory.middleGroup;

import yushchenko.abstractFactory.AbstractKidsGroup;
import yushchenko.abstractFactory.Children;
import yushchenko.abstractFactory.Educator;
import yushchenko.abstractFactory.Nanny;

public class MiddleGroup  extends AbstractKidsGroup {
    @Override
    public Educator createEducator() {
        return new MiddleEducator() {

        };
    }

    @Override
    public Nanny createNanny() {
        return new MiddleNanny(){

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