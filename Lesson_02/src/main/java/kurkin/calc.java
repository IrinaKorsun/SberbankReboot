package main.java.Kurkin;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class calc {

    private static float version = 1.0F;
    private static Scanner scanner = new Scanner(System.in);
    private static String regex = "\\d+((\\+|\\-|\\%|\\^|\\*|\\/)\\d+)*";

    private static boolean isValid(String pStr) {
        boolean result = false;
        if (pStr.isEmpty()) {
            return false;
        }
        Pattern pattern = Pattern.compile(regex);
        result = pattern.matcher(pStr).matches();
        return result;
    }

    private static String getExpression(){
        System.out.println("Введите пример");
        String result = "";
        String errm = "Некорректный ввод. Строка может содержать только цифры и операции +,-,*,/,%,^";
        if (scanner.hasNext()) {
            result = scanner.next();
            if (!isValid(result)) {
                System.out.println(errm);
                result = getExpression();
            }
        } else {
            System.out.println(errm);
            scanner.next();
            result = getExpression();
        }
        return result;
    }

    private static String calcPow(String pExpr) {
        Pattern p = Pattern.compile("(\\d+)\\^(\\d+)");
        Matcher m = p.matcher(pExpr);
        String result = pExpr;
        if (m.find()) {
            result = pExpr.substring(m.start(), m.end());
            int pos = result.indexOf("^");
            String arg1 = result.substring(0, pos);
            String arg2 = result.substring(pos + 1);
            int res = (int) Math.pow(Integer.parseInt(arg1), Integer.parseInt(arg2));
            result = pExpr.substring(0, m.start()) + res + pExpr.substring(m.end());
        }
        return result;
    }

    private static String calcMult(String pExpr) {
        Pattern p = Pattern.compile("(\\d+){0,1}(\\.){0,1}(\\d+)(\\*|\\/|\\%)(\\d+){0,1}(\\.){0,1}(\\d+)");
        Matcher m = p.matcher(pExpr);
        String result = pExpr;
        if (m.find()) {
            result = pExpr.substring(m.start(), m.end());
            int posMult = result.indexOf("*");
            if (posMult == -1) posMult = 999999;
            int posDiv = result.indexOf("/");
            if (posDiv == -1) posDiv = 999999;
            int posOst = result.indexOf("%");
            if (posOst == -1) posOst = 999999;
            int pos = Math.min(posMult, Math.min(posDiv, posOst));
            String operation = result.substring(pos, pos + 1);
            String arg1 = result.substring(0, pos);
            String arg2 = result.substring(pos + 1);
            double res = 0;
            //System.out.println(pos);
            //System.out.println(operation);
            //System.out.println(arg1);
            //System.out.println(arg2);
            switch (operation) {
                case "*":
                    res = Double.parseDouble(arg1) * Double.parseDouble(arg2);
                    break;
                case "/":
                    res = Double.parseDouble(arg1) / Double.parseDouble(arg2);
                    break;
                case "%":
                    res = Double.parseDouble(arg1) % Double.parseDouble(arg2);
                    break;
            }
            result = pExpr.substring(0, m.start()) + res + pExpr.substring(m.end());
        }
        //System.out.println(result);
        return result;
    }

    private static String calcSum(String pExpr) {
        Pattern p = Pattern.compile("(\\d+){0,1}(\\.){0,1}(\\d+)(\\+|\\-)(\\d+){0,1}(\\.){0,1}(\\d+)");
        Matcher m = p.matcher(pExpr);
        String result = pExpr;
        if (m.find()) {
            result = pExpr.substring(m.start(), m.end());
            int posSum = result.indexOf("+");
            if (posSum == -1) posSum = 999999;
            int posMinus = result.indexOf("-");
            if (posMinus == -1) posMinus = 999999;
            int pos = Math.min(posMinus, posSum);
            String operation = result.substring(pos, pos + 1);
            String arg1 = result.substring(0, pos);
            String arg2 = result.substring(pos + 1);
            double res = 0;
            //System.out.println(operation);
            //System.out.println(arg1);
            //System.out.println(arg2);
            switch (operation) {
                case "+":
                    res = Double.parseDouble(arg1) + Double.parseDouble(arg2);
                    break;
                case "-":
                    res = Double.parseDouble(arg1) - Double.parseDouble(arg2);
                    break;
            }
            //System.out.println(pExpr.substring(0, m.start()));
            //System.out.println(res);
            //System.out.println(pExpr.substring(m.end()));
            result = pExpr.substring(0, m.start()) + res + pExpr.substring(m.end());
        }
        //System.out.println(result);
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Калькулятор v" + version);
        System.out.println("Доступные операции: +,-,*,/,%,^. Без пробелов!!!");
        String result = "";

        do {
            String expression = getExpression();// считаем выражение из строки

            //Вычислим степень
            while (expression.contains("^")) {
                expression = calcPow(expression);
            }
            //Умножение/деление/остаток от деления
            while (expression.contains("*") || expression.contains("/") || expression.contains("%")) {
                expression = calcMult(expression);
            }
            while (expression.contains("+") || expression.contains("-")) {
                expression = calcSum(expression);
            }
            System.out.println(expression);
            System.out.println("Продолжим? (y)");

            if (scanner.hasNext()) {
                result = scanner.next();
            }
    } while(result.equals("y"));



}
}
