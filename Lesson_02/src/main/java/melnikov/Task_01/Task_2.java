package melnikov.Task_01;

public class Task_2 {

    public static void main(String[] args) {
        double min = 1;
        double max = 0;
        double avg = 0;

        int count = (int) (Math.random() * 100);
        double[] array = new double[count];

        for (int i = 0; i < array.length; i++) {
            double v = Math.random();
            if (v > max) {
                max = v;
            }
            if (v < min) {
                min = v;
            }
            avg += v;
            array[i] = v;
        }
        System.out.printf("Max value = %f, Min value = %f, Average value = %f\n", max, min, avg / array.length);
    }
}