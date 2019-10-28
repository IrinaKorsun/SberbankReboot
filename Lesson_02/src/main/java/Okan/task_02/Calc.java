package Okan.task_02;

public class Calc {
    public static void main(String[] args) {
        float ressult =0;
        float FirstZ;
        float SecondZ;
        System.out.println(args[0]);
        System.out.println(args[1]);
        System.out.println(args[2]);

        FirstZ = Float.parseFloat(args[0]);
        SecondZ = Float.parseFloat(args[2]);

        switch (args[1]) {
            case "+":
                ressult = FirstZ + SecondZ;
                break;
            case "-":
                ressult = FirstZ - SecondZ;
                break;
            case "/":
                ressult = FirstZ / SecondZ;
                break;
            case "*":
                ressult = FirstZ * SecondZ;
                break;
        }
        System.out.println(ressult);
    }

}
