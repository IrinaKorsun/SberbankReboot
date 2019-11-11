package okan.task_01_okan;

public class MyVector {
    private double x;
    private double y;
    private double z;

    private MyVector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    private double lenVect() {
        return Math.sqrt(x * x + y * y + z * z);
    }


    private double scalar(MyVector vector) {
        return x * vector.x + y * vector.y + z * vector.z;
    }


    private MyVector cros(MyVector vector) {
        return new MyVector(
                y * vector.z - z * vector.y,
                z * vector.x - x * vector.z,
                x * vector.y - y * vector.x);
    }


    private double cos(MyVector vector) {
        return scalar(vector) / (lenVect() * vector.lenVect());
    }

    private MyVector add(MyVector vector) {
        return new MyVector(
                x + vector.x,
                y + vector.y,
                z + vector.z
        );
    }

    private MyVector subtract(MyVector vector) {
        return new MyVector(
                x - vector.x,
                y - vector.y,
                z - vector.z
        );
    }


    public static void main(String[] args) {
        MyVector[] vectors =  new MyVector[2] ;
        vectors [0] = new MyVector(Math.random(), Math.random(), Math.random());
        vectors [1] = new MyVector(Math.random(), Math.random(), Math.random());
        System.out.println("Вектор 1: " + vectors[0].x + " " +  vectors[0].y + " " + vectors[0].z);
        System.out.println("Вектор 2: " + vectors[1].x + " " +  vectors[1].y + " " + vectors[1].z);
        System.out.println("Длина: " + vectors[0].lenVect());
        System.out.println("Скалярное произведение:" + vectors[0].scalar(vectors[1]));
        System.out.println("Векторное произведение:" + vectors[0].cros(vectors[1]).x + " " + vectors[0].cros(vectors[1]).y + " " + vectors[0].cros(vectors[1]).z);
        System.out.println("Cos:" + vectors[0].cos(vectors[1]));
        System.out.println("Сумма:" + vectors[0].add(vectors[1]).x + " " + vectors[0].add(vectors[1]).y + " " + vectors[0].add(vectors[1]).z);
        System.out.println("Разность:" + vectors[0].subtract(vectors[1]).x + " " + vectors[0].subtract(vectors[1]).y + " " + vectors[0].subtract(vectors[1]).z);
    }



}