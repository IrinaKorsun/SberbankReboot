package chernoskutov.task_01;

import java.util.ArrayList;

public class Task_01 {
    public static void main(String[] args) {

        Vector vector1 = new Vector(1, 3, 5);
        System.out.println(vector1.toString());
        Vector vector2 = new Vector(4, 4, 4);
        System.out.println(vector2.toString());

        System.out.println(vector1.lengthVector() + " : length vector1");
        System.out.println(Vector.sumVectors(vector1, vector2) + " : sumVectors");
        System.out.println(Vector.differenceVector(vector1, vector2) + " : differenceVector");
        System.out.println(Vector.vectorProduct(vector1, vector2) + " : vectorProduct");
        System.out.println(Vector.scalarProduct(vector1, vector2) + " : scalarProduct");
        System.out.println(Vector.cosBetweenVectors(vector1, vector2) + " : cosBetweenVectors");
        Vector vectorProduct = Vector.vectorProduct(vector1, vector2);
        System.out.println(vectorProduct.toString() + " : toString vectorProduct");

        ArrayList<Vector> arrayListVectors = Vector.createArrayOfVector(10);
        if (arrayListVectors != null) {
            arrayListVectors.forEach(x -> System.out.println(x.toString()));
        }
    }
}
