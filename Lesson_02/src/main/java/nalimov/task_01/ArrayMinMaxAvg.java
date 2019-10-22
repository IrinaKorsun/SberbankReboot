package nalimov.task_01;

public class ArrayMinMaxAvg {

    public static void main(String[] args) {
        // Переменные для вывода на печать
        String avgPrint = null, minPrint = null, maxPrint = null;

        // Тип массива double т.к. используется Math.random() на выходе у которого double
        double[] array = new double[6];

        double avg = 0, sum = 0;
        double min = array[0], max = array[0];

        // За одну операцию записи массива, находим все нужные значения, не читая его по несколько раз.
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random();

         // Разово присвоим первый элемент вместо 0 по умолчанию
            if (i == 0) {
                min = array[0];
                max = array[0];
            }

            sum += array[i];
            min = Math.min(array[i], min);
            max = Math.max(array[i], max);

            minPrint = Double.toString(min);
            maxPrint = Double.toString(max);

            System.out.println(array[i]);

        }

        avg = sum/array.length;

        avgPrint = Double.toString(avg);

        System.out.println("min: " + minPrint);
        System.out.println("max: " + maxPrint);
        System.out.println("avg: " + avgPrint);
    }

}
