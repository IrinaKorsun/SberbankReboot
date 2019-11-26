package torikov.Task01Vector;

public class Vector {
    private double x;
    private double y;
    private double z;


    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    public double vectorLength() {  // длинна вектора
        return Math.sqrt(x * x + y * y + z * z);
    }

    public double scalarProduct(Vector otherVector) { // скалярное произведение
        return x * otherVector.x + y * otherVector.y + z * otherVector.z;
    }

    public Vector vectorProduct(Vector otherVector) {  // векторное произведение
        return new Vector(y * otherVector.z - z * otherVector.y, z * otherVector.x - x * otherVector.z, x * otherVector.y - y * otherVector.x);
    }

    public double angle(Vector otherVector) { // угол между векторами
        double lengthVector1 = this.vectorLength();
        double lengthVector2 = otherVector.vectorLength();

        if (lengthVector1 == 0 || lengthVector2 == 0) {
            return 0;
        } else {
            return this.scalarProduct(otherVector) / (lengthVector1 * lengthVector2);
        }
    }

    public Vector sum(Vector otherVector) { // сумма векторов
        return new Vector(x + otherVector.x, y + otherVector.y, z + otherVector.z);
    }

    public Vector mult(Vector otherVector) { // разность векторов
        return new Vector(x - otherVector.x, y - otherVector.y, z - otherVector.z);
    }


    public static Vector[] randomVectors(int amountVectors) {  // создание векторов
        Vector[] vectorArray = new Vector[amountVectors];

        for (int i = 0; i < amountVectors; i++) {
            vectorArray[i] = new Vector(Math.random(), Math.random(), Math.random());
        }

        return vectorArray;
    }
}
