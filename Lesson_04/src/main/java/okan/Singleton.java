package okan;

public class Singleton {
    private static Singleton inst = new Singleton();

    private Singleton(){
        int numberround = 4;
        int numberdors = 5;

    }

    private static Singleton getins(){
        return inst;
    }

    public static void main(String[] args) {
        System.out.println(Singleton.inst.getClass());
        System.out.println(Singleton.getins());
    }
}
