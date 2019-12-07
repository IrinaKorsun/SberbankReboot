package yushchenko.abstractFactory.middleGroup;
import yushchenko.abstractFactory.Nanny;

public class MiddleNanny implements Nanny{
    @Override
    public void helpEd() {
        System.out.println("Nanny helps with little children");
    }
}