package yushchenko.abstractFactory.nursey;
import yushchenko.abstractFactory.Nanny;

public class NurseyNanny implements Nanny{
    @Override
    public void helpEd() {
        System.out.println("Nanny helps with very little children");
    }
}
