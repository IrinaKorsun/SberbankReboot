package sarapulova.task_02;

import java.util.Scanner;

public class UseAbstractFactory {
    public static void main(String[] args) {
        CreditDocFactory factory;
        char selVariant;
        Scanner scan = new Scanner(System.in);

        System.out.print("Выберите тип кредита, для которого нужны документы\n");
        System.out.print("1 = Ипотека\n");
        System.out.print("2 = Автомобильный кредит\n");
        System.out.print("Введите номер: ");
        selVariant = scan.next().charAt(0);

        switch (selVariant) {
            case '1':
                factory = new MortgageFactory();
                AskZalog(factory, scan);
                break;
            case '2':
                factory = new CarLoanFactory();
                AskZalog(factory, scan);
                break;
            default:
                System.out.print("Некорректный символ\n\n");
        }
    }

    private static void AskZalog(CreditDocFactory factory, Scanner scan) {
        char selVariant;

        if (factory != null) {
            System.out.print("Будет ли предоставлен дополнительный залог\n");
            System.out.print("1 = Да\n");
            System.out.print("2 = Нет\n");
            System.out.print("Введите номер: ");
            selVariant = scan.next().charAt(0);

            switch (selVariant) {
                case '1':
                    factory.createZalog();
                    break;
                case '2':
                    factory.craeteDogovor();
                    break;
                default:
                    System.out.print("Некорректный символ\n\n");
            }
        }
    }
}

