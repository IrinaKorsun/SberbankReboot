package main.java.shevnin;

public class RamdomArray {
    public static void main(String[] args) {
        double[] intArray;
        double minValue, maxValue, avgValue;
        intArray = new double[10];
        maxValue = avgValue = 0;
        minValue = 1;
        for (int i = 0; i < 10; i++) {
            intArray[i] = Math.random();
            if (minValue > intArray[i]) minValue = intArray[i];
            if (maxValue < intArray[i]) maxValue = intArray[i];
            avgValue += intArray[i];
            System.out.println("intArray[" + i + "] = " + intArray[i]);
        }
        avgValue = avgValue / 10;
        System.out.println("minValue = " + minValue + ",   maxValue = " + maxValue + ",   avgValue = " + avgValue);
    }
}
