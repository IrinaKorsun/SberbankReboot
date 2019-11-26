package yushchenko.abstractFactory.nursey;

import yushchenko.abstractFactory.*;

public class NurseyGroup extends AbstractKidsGroup {
    @Override
    public Educator createEducator() {
        return new NurseyEducator() {

        };
    }

    @Override
    public Nanny createNanny() {
        return new NurseyNanny() {

        };
    }

    ;

    @Override
    public Children createChildren() {
        return new NurseyChildren() {

        };
    }

    ;
}

