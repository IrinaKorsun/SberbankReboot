package main.java.sarapulova;

import java.util.Scanner;

public class Task_02_Calc {

    public static void main(String args[])
    {
        double x, y, res;
        char operand;
        Scanner scan = new Scanner(System.in);

        do
        {
            System.out.print("Select operation\n");
            System.out.print("1 = Add(+)\n");
            System.out.print("2 = Sub(-)\n");
            System.out.print("3 = Mult(*)\n");
            System.out.print("4 = Div(/)\n");
            System.out.print("5 = Pow(p)\n");
            System.out.print("6 = Sqrt(s)\n");
            System.out.print("0 = Exit\n");
            System.out.print("Enter Your Choice:\n");
            operand = scan.next().charAt(0);

            switch (operand)
            {
                case '+' :
                case '1' :
                    System.out.print("Enter Two Number: \n");
                    x = scan.nextDouble();
                    y = scan.nextDouble();
                    res = add(x,y);
                    System.out.print("Result = " + res + "\n\n");
                    break;
                case '-' :
                case '2' :
                    System.out.print("Enter Two Number: \n");
                    x = scan.nextDouble();
                    y = scan.nextDouble();
                    res = sub(x,y);
                    System.out.print("Result = " + res + "\n\n");
                    break;
                case '*' :
                case '3' :
                    System.out.print("Enter Two Number: \n");
                    x = scan.nextDouble();
                    y = scan.nextDouble();
                    res = mult(x,y);
                    System.out.print("Result = " + res + "\n\n");
                    break;
                case '/' :
                case '4' :
                    System.out.print("Enter Two Number: \n");
                    x = scan.nextDouble();
                    y = scan.nextDouble();
                    res = div(x,y);
                    System.out.print("Result = " + res + "\n\n");
                    break;
                case 'p' :
                case '5' :
                    System.out.print("Enter Number and exp: \n");
                    x = scan.nextDouble();
                    y = scan.nextDouble();
                    res = pow(x,y);
                    System.out.print("Result = " + res + "\n\n");
                    break;
                case 's' :
                case '6' :
                    System.out.print("Enter One Number: \n");
                    x = scan.nextDouble();
                    res = sqrt(x);
                    System.out.print("Result = " + res + "\n\n");
                    break;
                case '0' :
                    System.exit(0);
                    break;
                default :
                    System.out.print("Incorrect operand\n\n");
            }
        }
        while (operand != 0);
    }


    private static double add(double x, double y)
    {
        return x + y;
    }
    private static double sub(double x, double y)
    {
        return x-y;
    }
    private static double mult(double x, double y)
    {
        return x*y;
    }
    private static double div(double x, double y)
    {
        return x/y;
    }
    private static double pow(double x, double y)
    {
        return Math.pow(x,y);
    }

    private static double sqrt(double x)
    {
        return Math.sqrt(x);
    }

}