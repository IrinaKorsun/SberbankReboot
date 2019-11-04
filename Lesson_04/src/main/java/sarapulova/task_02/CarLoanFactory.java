package sarapulova.task_02;

public class CarLoanFactory implements CreditDocFactory{
    public Dogovor craeteDogovor() {
        return new CarLoanDogovor();
    }

    public Zalog createZalog() {
        return new CarLoanZalog();
    }
}
