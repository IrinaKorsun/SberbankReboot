package kapustin.task_01;

import java.util.Random;

public class Vector {
    int x;
    int y;
    int z;

    public Vector(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }

    public Vector[] GetArrayVectors(int number) {
        Vector[] arrayOfVecotrs = new Vector[number];
        Random random = new Random();

        for (int i = 0; i < number; i++) {
            arrayOfVecotrs[i] = new Vector(random.nextInt(100), random.nextInt(100), random.nextInt(100));
        }
        return arrayOfVecotrs;
    }

    public double getLengthVector(int x, int y, int z) {
        return Math.sqrt(x * x + y * y + z * z);
    }

    public double getCalculatingScalarProduct(Vector[] arrayOfVectors) {
        return arrayOfVectors[0].x * arrayOfVectors[1].x + arrayOfVectors[0].y * arrayOfVectors[1].y + arrayOfVectors[0].z * arrayOfVectors[1].z;
    }

    public Vector getVectorProduct(Vector[] arrayOfVectors) {
        int x = arrayOfVectors[0].y * arrayOfVectors[1].z - arrayOfVectors[0].z * arrayOfVectors[1].y;
        int y = arrayOfVectors[0].z * arrayOfVectors[1].x - arrayOfVectors[0].x * arrayOfVectors[1].z;
        int z = arrayOfVectors[0].x * arrayOfVectors[1].y - arrayOfVectors[0].y * arrayOfVectors[1].x;
        return new Vector(x, y, z);
    }

    public double getCosineOfVectors(Vector[] arrayOfVectors) {
        return getCalculatingScalarProduct(arrayOfVectors) / (Math.abs(getLengthVector(arrayOfVectors[0].x, arrayOfVectors[0].y, arrayOfVectors[0].y)) * Math.abs(getLengthVector(arrayOfVectors[1].x, arrayOfVectors[1].y, arrayOfVectors[1].z)));
    }

    public Vector getSumOfVectors(Vector[] arrayOfVectors) {
        int x = arrayOfVectors[0].x + arrayOfVectors[1].x;
        int y = arrayOfVectors[0].y + arrayOfVectors[1].y;
        int z = arrayOfVectors[0].z + arrayOfVectors[1].z;
        return new Vector(x, y, z);
    }

    public Vector getDifferenceOfVectors(Vector[] arrayOfVectors) {
        int x = arrayOfVectors[0].x - arrayOfVectors[1].x;
        int y = arrayOfVectors[0].y - arrayOfVectors[1].y;
        int z = arrayOfVectors[0].z - arrayOfVectors[1].z;
        return new Vector(x, y, z);
    }


    public static void main(String[] args) {
        Vector[] arrayOfVecotrs;
        Vector vector1 = new Vector(1, 2, 4);
// создание массива случайных векторов размером N.
        arrayOfVecotrs = vector1.GetArrayVectors(2);
//длина вектора
        System.out.println(vector1.getLengthVector(vector1.x, vector1.y, vector1.z));
//скалярное произведение
        System.out.println(vector1.getCalculatingScalarProduct(arrayOfVecotrs));
//векторное произведение
        Vector vector2 = vector1.getVectorProduct(arrayOfVecotrs);
//косинус угла
        System.out.println(vector1.getCosineOfVectors(arrayOfVecotrs));
//сумма
        Vector vector3 = vector1.getSumOfVectors(arrayOfVecotrs);
//разность
        Vector vector4 = vector1.getDifferenceOfVectors(arrayOfVecotrs);
        System.out.println("X:"+vector4.getX()+" Y:"+vector4.getY()+" Z:"+vector4.getZ());
    }
}
