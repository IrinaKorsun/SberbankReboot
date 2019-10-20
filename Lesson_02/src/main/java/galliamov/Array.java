package main.java.galliamov;

public class Array {
    public static void main(String[] args) {
        int iCountRec = 10;

        double dMin = 1;
        double dMax = -1;
        double dSred = 0;

        double[] arrdRecs = new double[iCountRec];

        System.out.println("Вывод значений массива: ");

        for (int iIdx = 0; iIdx < iCountRec; iIdx++)
        {
            arrdRecs [iIdx] =  Math.random();

            System.out.println("Значение элемента с индексом " + iIdx + " = " + arrdRecs [iIdx]);

            if (dMin > arrdRecs [iIdx])
            {
                dMin = arrdRecs [iIdx];
            }

            if (dMax < arrdRecs [iIdx])
            {
                dMax = arrdRecs [iIdx];
            }

            dSred = dSred + arrdRecs [iIdx];
        }
        dSred = dSred / iCountRec;
        System.out.println("Минимальное значение: " + dMin);
        System.out.println("Среднее значение: " + dSred);
        System.out.println("Максимальное значение: " + dMax);

    }
}
