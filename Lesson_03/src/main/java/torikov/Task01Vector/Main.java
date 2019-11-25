package torikov.Task01Vector;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите кол-во векторов которые необходимо создать (желательно от 2-х):");
        int n = in.nextInt();
        Vector[] arrayVectors = Vector.randomVectors(n);
        for (int i = 0; i < arrayVectors.length; i++) {
            System.out.println("Вектор " + (int) (i + 1) + ": " + arrayVectors[i].getX() + " ; " + arrayVectors[i].getY() + " ; " + arrayVectors[i].getZ());
        }
        System.out.println("Введите номер вектора 1, с которым необходимо произвести операции (от 1 до " + n + "):");
        int n1 = in.nextInt();
        System.out.println("Введите номер вектора 2, с которым необходимо произвести операции (от 1 до " + n + "):");
        int n2 = in.nextInt();
        Vector vector1 = arrayVectors[n1 - 1];
        Vector vector2 = arrayVectors[n2 - 1];
        System.out.println("Длинна вектора 1: " + vector1.vectorLength());
        System.out.println("Длинна вектора 2: " + vector2.vectorLength());
        System.out.println("Скалярное произведение: " + vector1.scalarProduct(vector2));
        Vector vectorProduct = vector1.vectorProduct(vector2);
        System.out.println("Векторное произведение: " + vectorProduct.getX() + ";" + vectorProduct.getY() + ";" + vectorProduct.getZ());
        System.out.println("Угол между векторами: " + vector1.angle(vector2));
        Vector vectorSum = vector1.sum(vector2);
        System.out.println("Сумма векторов: " + vectorSum.getX() + ";" + vectorSum.getY() + ";" + vectorSum.getZ());
        Vector vectorMult = vector1.mult(vector2);
        System.out.println("Разность векторов: " + vectorMult.getX() + ";" + vectorMult.getY() + ";" + vectorMult.getZ());

        in.close();
    }
}


