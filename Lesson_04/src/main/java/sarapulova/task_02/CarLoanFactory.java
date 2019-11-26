package sarapulova.task_02;

public class CarLoanFactory implements CreditDocFactory{
    private Contract craeteContract() {
        return new CarLoanContract();
    }

    private Guaranty createGuaranty() {
        return new CarLoanGuaranty();
    }

    public void createDoc (int docType) {
        switch (docType) {
            case '1':
                createGuaranty();
                break;
            case '2':
                craeteContract();
                break;
            default:
                System.out.print("Некорректный символ\n\n");
        }
    }
}
