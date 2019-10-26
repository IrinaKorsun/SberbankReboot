package chernoskutov.task_01;

import java.util.ArrayList;

public class Vector {

    private final double x;
    private final double y;
    private final double z;

    Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    double lengthVector() {
        return Math.sqrt(x * x + y * y + z * z);
    }

    static double scalarProduct(Vector v1, Vector v2) {
        return v1.x * v2.x + v1.y * v2.y + v1.z * v2.z;
    }

    static Vector vectorProduct(Vector v1, Vector v2) {
        double x = v1.y * v2.z - v1.z * v2.y;
        double y = v1.z * v2.x - v1.x * v2.z;
        double z = v1.x * v2.y - v1.y * v2.x;
        return new Vector(x, y, z);
    }

    static double cosBetweenVectors(Vector v1, Vector v2) {
        return scalarProduct(v1, v2) / (v1.lengthVector() * v2.lengthVector());
    }

    static Vector sumVectors(Vector v1, Vector v2) {
        double x = v1.x + v2.x;
        double y = v1.y + v2.y;
        double z = v1.z + v2.z;
        return new Vector(x, y, z);
    }

    static Vector differenceVector(Vector v1, Vector v2) {
        double x = v1.x - v2.x;
        double y = v1.y - v2.y;
        double z = v1.z - v2.z;
        return new Vector(x, y, z);
    }

    static ArrayList<Vector> createArrayOfVector(int count) {
        if (count == 0) {
            System.out.println("Err. Count = 0;");
            return null;
        }
        ArrayList<Vector> arr = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            double x = Math.random() * 100;
            double y = Math.random() * 100;
            double z = Math.random() * 100;
            arr.add(new Vector(x, y, z));
        }
        return arr;
    }

    @Override
    public String toString() {
        return "Vector{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}
