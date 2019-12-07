package yushchenko.abstractFactory.nursey;
import yushchenko.abstractFactory.Children;


public class NurseyChildren  implements Children{
    @Override
    public void play() {
        System.out.println("Very little children play");
    }
}
