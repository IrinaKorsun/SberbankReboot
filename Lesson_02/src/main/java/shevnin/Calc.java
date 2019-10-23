package shevnin;

class IllegalOperatorException  extends Exception {
    public IllegalOperatorException(String message){
        super(message);
     }
}

public class Calc {
    public static void main(String[] args) {
        double numArg1, numArg2, numRes;
        try {
            numArg1 = Double.parseDouble(args[0]);
            numArg2 = Double.parseDouble(args[2]);
            switch (args[1]) {
                case "+":
                    numRes = numArg1 + numArg2;
                    break;
                case "-":
                    numRes = numArg1 - numArg2;
                    break;
                case "/":
                    numRes = numArg1 / numArg2;
                    break;
                case "*":
                    numRes = numArg1 * numArg2;
                    break;
                default:
                    throw new IllegalOperatorException("Неверный оператор - \"" + args[1] + "\"");
            }
            System.out.println(args[0] + " " + args[1] + " " + args[2] + " = " + numRes);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Отсутствует параметр " + e.getMessage() + "!");
        } catch (NumberFormatException e) {
            System.out.println("Нечисловой аргумент! " + e.getMessage());
        } catch (IllegalOperatorException e) {
            System.out.println(e.getMessage());
        }
   }
}
