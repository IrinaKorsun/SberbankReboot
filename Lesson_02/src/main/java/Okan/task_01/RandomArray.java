package main.java.Okan.task_01;

public class RandomArray {

    private static final int COUNT = 9;
    public static void main(String[] args) {
        double[] ranar;
        double minz = 0.0;
        double maxz = 0.0;
        double srdz = 0.0;
        ranar = new double[10];
        for (int i = 0; i <= COUNT; i++) {
            ranar [i] = Math.random();
            if (i==0) {
                maxz = ranar[i];
                minz = ranar[i];
            }

            if (ranar[i]<=minz) {
                minz=ranar[i];
            }
            if (ranar[i]>=maxz) {
                maxz=ranar[i];
            }
            srdz = srdz + ranar[i];
            System.out.println(ranar[i]);
        }
        srdz = srdz / COUNT;

        printResult(minz, maxz, srdz);
    }

    private static void printResult(double minz, double maxz, double srdz) {
        System.out.println("Минимальное: " + minz);
        System.out.println("Максимальное: " + maxz);
        System.out.println("Среднее: " + srdz);
    }


}