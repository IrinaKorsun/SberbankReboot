package sorokina.task_02;
import java.util.Scanner;

public class Task_02_Simple_Calc {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        calculate();
        quit();
    }
    public static double getDouble(){
        double num;
        if (sc.hasNextDouble()){
            num = sc.nextDouble();
        }
        else {
            System.out.println("Enter correct number");
            sc.next();
            num = getDouble();
        }
        return num;
    }
    public static char getOperation(){
        char operation;
        if (sc.hasNext()){
            operation = sc.next().charAt(0);
        }
        else {
            System.out.println("Enter correct operation:");
            sc.next();
            operation = getOperation();
        }
        return operation;
    }
    public static double calc(double first, char operation, double second){
        double result = 0;
        switch (operation) {
            case ('+'):
                result = first + second;
                break;
            case ('-'):
                result = first - second;
                break;
            case ('*'):
                result = first * second;
                break;
            case ('/'):
                if (second == 0){
                    System.out.println("Can't divide by zero! ");
                    System.exit(1);
                }
                else
                result = first / second;
                break;
            default: {
                System.out.println("Operation doesn't support. Enter one of +, -, *, / ");
                result = calc(first, getOperation(), second);
            }
        }
        return result;
    }
    public static void calculate(){
        System.out.println("Enter the first number:");
        double first = getDouble();
        System.out.println("Enter the second number:");
        double second = getDouble();
        System.out.println("Enter the operation:");
        char operation = getOperation();
        double result = calc(first,operation,second);
        System.out.println("Result of calculation "+ first + operation + second +" = " + result);
    }
    public static void quit(){
        System.out.println("Enter S to start over or Q to quit");
        switch (sc.next().toLowerCase().charAt(0)) {
            case ('q'): {
                System.exit(0);
            }
            case ('s'): {
                calculate();
                quit();
                break;
            }
            default:
                System.out.println("Symbol doesn't support");
                quit();
        }
    }
}
