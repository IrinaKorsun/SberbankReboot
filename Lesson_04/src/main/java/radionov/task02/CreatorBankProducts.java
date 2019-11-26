package radionov.task02;

public class CreatorBankProducts {
    public static void main(String[] args) {
        BankFactory factory = new BankFactory();
        BankProducts credit = factory.getBank(TypesProducts.CREDIT);
        BankProducts deposit = factory.getBank(TypesProducts.DEPOSIT);
        BankProducts card = factory.getBank(TypesProducts.CARD);
        BankProducts safeDepositBox = factory.getBank(TypesProducts.SAFE_DEPOSIT_BOX);
        BankProducts rko = factory.getBank(TypesProducts.RKO);
        //Проверим, что все создано правильно
        credit.getProductName();
        deposit.getProductName();
        card.getProductName();
        safeDepositBox.getProductName();
        rko.getProductName();

    }
}
