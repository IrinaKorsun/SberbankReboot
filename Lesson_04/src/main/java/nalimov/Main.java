package nalimov;

public class Main {
    public static void main(String[] args) {
        if (Singleton.getIns() == Singleton.getIns()){
            System.out.println(Singleton.getIns());
        }
    }
}
