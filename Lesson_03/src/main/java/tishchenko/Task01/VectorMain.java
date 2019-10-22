package tishchenko.Task01;

class Vector {

    public final double LengthVector(double x, double y, double z) {
        double result = Math.sqrt(Math.pow(x, 2.0) + Math.pow(y, 2.0) + Math.pow(z, 2.0));
        return result;
    }

    public final double ScalarMultiplication(double x1, double x2, double y1, double y2, double z1, double z2) {
        double result = (x1 * x2) + (y1 * y2) + (z1 * z2);
        return result;
    }

    public final String VectorMultiplication(double x1, double x2, double y1, double y2, double z1, double z2) {
        double new_x = (y1 * z2) - (z1 * y2);
        double new_y = (z1 * x2) - (x1 * z2);
        double new_z = (x1 * y2) - (y1 * x2);
        String result = "(" + (int) new_x + ";" + (int) new_y + ";" + (int) new_z + ")";
        return result;
    }

    public final double SocVectors(double x1, double x2, double y1, double y2, double z1, double z2) {
        Double result = (this.ScalarMultiplication(x1, x2, y1, y2, z1, z2)) / (this.LengthVector(x1, y1, z1) * this.LengthVector(x2, y2, z2));
        return result;
    }

    public final String Sum(double x1, double x2, double y1, double y2, double z1, double z2) {
        String result = "(" + (int) (x1 + x2) + ";" + (int) (y1 + y2) + ";" + (int) (z1 + z2) + ")";
        return result;
    }

    public final String Def(double x1, double x2, double y1, double y2, double z1, double z2) {
        String result = "(" + (int) (x1 - x2) + ";" + (int) (y1 - y2) + ";" + (int) (z1 - z2) + ")";
        return result;
    }

    public void RandomArray(int n) {
        String[] RandArray = new String[n];
        for (int i = 0; i < n; i++) {
            double x = Math.random();
            double y = Math.random();
            double z = Math.random();
            String vector = "(" + x + ";" + y + ";" + z + ")";
            RandArray[i] = vector;
            System.out.println("RandomVector in Array position " + i + " - " + RandArray[i]);
        }
    }
}

class VectorMain {
    public static void main(String[] args) {
        Vector vector = new Vector();
        double x1 = 2;
        double y1 = 2;
        double z1 = 2;
        double x2 = 4;
        double y2 = 6;
        double z2 = 8;
        System.out.println("Length vector - " + vector.LengthVector(x1, y1, z1));
        System.out.println("Scalar product of vectors - " + vector.ScalarMultiplication(x1, x2, y1, y2, z1, z2));
        System.out.println("Vector multiplication - " + vector.VectorMultiplication(x1, x2, y1, y2, z1, z2));
        System.out.println("Cosine of angle between vectors - " + vector.SocVectors(x1, x2, y1, y2, z1, z2));
        System.out.println("The sum of the vectors - " + vector.Sum(x1, x2, y1, y2, z1, z2));
        System.out.println("The difference of the vectors - " + vector.Def(x1, x2, y1, y2, z1, z2));
        vector.RandomArray(3);
    }
}
