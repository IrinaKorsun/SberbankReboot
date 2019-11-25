package radionov.task02;

public class BankFactory {
    public BankProducts getBank(TypesProducts type) {
        BankProducts bankProductsProduct = null;
        switch (type) {
            case CREDIT:
                bankProductsProduct = new Credit();
                break;
            case CARD:
                bankProductsProduct = new Card();
                break;
            case DEPOSIT:
                bankProductsProduct = new Deposit();
                break;
            case RKO:
                bankProductsProduct = new Rko();
                break;
            case SAFE_DEPOSIT_BOX:
                bankProductsProduct = new SafeDepositBox();
                break;
            default:
                throw new IllegalArgumentException("Невозможно создать новый банковский продукт типа: " + type);
        }
        return bankProductsProduct;
    }
}
