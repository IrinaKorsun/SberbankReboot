package sarapulova.task_02;

public class MortgageFactory implements CreditDocFactory {
    private Contract craeteContract() {
        return new MortgageContract();
    }

    private Guaranty createGuaranty() {
        return new MortgageGuaranty();
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
