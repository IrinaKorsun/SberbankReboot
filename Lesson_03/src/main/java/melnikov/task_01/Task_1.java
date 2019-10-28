package main.java.melnikov.task_01;

public class Task_1 {

    public static void main(String[] args) {

        Vector v;
        int n = 10;

        Vector[] vectors = Vector.generateRandomVectors(n);

        System.out.printf("Generated vectors numbers: = %d\n", n);
        for (int i = 0; i < n; i++) {
            System.out.printf("Vector[%d] = { %f, %f, %f }\n", i, vectors[i].getX(), vectors[i].getY(), vectors[i].getZ());
        }

        System.out.printf("Length(v0) = %f\n", vectors[0].lenght());
        System.out.printf("Scalar produc(v0, v1) = %f\n", vectors[0].scalarProduct(vectors[1]));
        v = vectors[0].vectotProduct(vectors[1]);
        System.out.printf("Vector product(v0, v1) = { %f, %f, %f }\n", v.getX(), v.getY(), v.getZ());
        System.out.printf("Angle(v0, v1) = %f, \n", vectors[0].angle(vectors[1]));
        v = vectors[0].add(vectors[1]);
        System.out.printf("Sum vectors(v0, v1) = { %f, %f, %f }\n", v.getX(), v.getY(), v.getZ());
        v = vectors[0].sub(vectors[1]);
        System.out.printf("Sub vectors(v0, v1) = { %f, %f, %f }\n", v.getX(), v.getY(), v.getZ());
    }
}
