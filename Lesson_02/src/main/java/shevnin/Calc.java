package main.java.shevnin;

public class Calc {
    public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
        double[] numArgs;
        numArgs = new double[3];
        try {
            numArgs[0] = Double.parseDouble(args[0]);
            numArgs[1] = Double.parseDouble(args[2]);
            switch (args[1]) {
                case "+":
                    numArgs[2] = numArgs[0] + numArgs[1];
                    break;
                case "-":
                    numArgs[2] = numArgs[0] - numArgs[1];
                    break;
                case "/":
                    numArgs[2] = numArgs[0] / numArgs[1];
                    break;
                case "*":
                    numArgs[2] = numArgs[0] * numArgs[1];
                    break;
                default:
                    throw new ArrayIndexOutOfBoundsException("Неверный оператор - \"" + args[1] + "\"");
            }
            System.out.println(args[0] + " " + args[1] + " " + args[2] + " = " + numArgs[2]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Неверный аргумент! " + e.getMessage());
         }
   }
}
