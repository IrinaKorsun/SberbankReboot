package sarapulova.task_02;

public class MortgageFactory implements CreditDocFactory {
    public Dogovor craeteDogovor() {
        return new MortgageDogovor();
    }

    public Zalog createZalog() {
        return new MortgageZalog();
    }
}
