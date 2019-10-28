package nalimov.task_02;

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.Float.parseFloat;

public class Сalculator {

    /* Принцип действия калькулятора.
     * Открывается сканер
     * Вводится строка, пример 1+1 @число@ @операция@ @число@
     * Строка сохраняемтся и убираются возможные пробелы
     * Строка парсится в соответствии с операциями, производится split в массив
     * Выполняется расчет, в соответствии с операцией, при невозможности выводится сообщение
     * Выход из калькулятора через "q"
     * Помощь "h"
     * */

    public static void calculatorPrint(String resultPrint, boolean getPrintResult) {

        if (getPrintResult) {
            System.out.println("= " + resultPrint);
        }
        else {
            System.out.println("Данная операция не поддерживается.");
        }
    }

    public static void main(String[] args) {

        //Разделители из поддерживаемых комманд
        String patternSplit = "\\*|\\+|\\-|/|\\^|sqrt:|%";

        //Вырожение для вычисления
        String textExpression = "";

        //Переменные для расчета и печати результата
        String resultPrint = "";
        double result = 0.0;
        float  resultProcent = 0.0f;

        Scanner scan = new Scanner(System.in);

        for ( ; ; ) {

            boolean getPrintResult = true;

            System.out.println("Введите: @число@ @операция@ @число@  (поддерживаемые операции: *, +, -, /, ^, sqrt:, %), выход (q), помощь (h) :");

            //Добовляем введеную строку и убираем пробелы
            textExpression = scan.nextLine().replace(" ", "");

            //Выход из цикла; переход в помощь
            if (textExpression.equals("q")) {
                break;
            }
            else if (textExpression.equals("h")) {
                System.out.println("/*\nПример заполнения @число@ @операция@ @число@ : (дробное 1.2), 1*1, 1+1, 1-1, 1/1, 1^2(@число@^@степень@), sqrt:6, 7%458(@процент@%@число@)\n*/");
                continue;
            }

            //Добавляем в массив нашу строку разбивая разделитем
            String[] calcVar = textExpression.split(patternSplit);

            //Произведем расчет значения только если введенная операция поддерживается
            // и проставим маркер печати результата
            if (textExpression.contains("*")) {

                result = Double.parseDouble(calcVar[0]);
                result *= Double.parseDouble(calcVar[1]);

                resultPrint = Double.toString(result);

            }
            else if (textExpression.contains("+")) {

                result = Double.parseDouble(calcVar[0]);
                result += Double.parseDouble(calcVar[1]);

                resultPrint = Double.toString(result);

            }
            else if (textExpression.contains("-")) {

                result = Double.parseDouble(calcVar[0]);
                result -= Double.parseDouble(calcVar[1]);

                resultPrint = Double.toString(result);

            }
            else if (textExpression.contains("/")) {

                result = Double.parseDouble(calcVar[0]);
                result /= Double.parseDouble(calcVar[1]);

                resultPrint = Double.toString(result);
            }
            else if (textExpression.contains("^")) {

                result = Math.pow(Double.parseDouble(calcVar[0]),Double.parseDouble(calcVar[1]));

                resultPrint = Double.toString(result);
            }
            else if (textExpression.contains("sqrt:")) {

                result = Math.sqrt(Double.parseDouble(calcVar[1]));

                resultPrint = Double.toString(result);
            }
            else if (textExpression.contains("%")) {

                resultProcent = (parseFloat(calcVar[1]) / 100) * parseFloat(calcVar[0]);

                resultPrint = Float.toString(resultProcent);
            }
            else  {

                getPrintResult = false;
            }

            //Передадим результат и флаг печати
            calculatorPrint(resultPrint, getPrintResult);

            // Отладка парсинга в массив
            //System.out.println(Arrays.toString(calcVar));
        }

        scan.close();

    }

}

