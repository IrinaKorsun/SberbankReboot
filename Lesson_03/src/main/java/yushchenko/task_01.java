package yushchenko;

class Vector {
    double x;
    double y;
    double z;

    //Конструктор 1
    Vector(double a, double b, double c) {
        x = a;
        y = b;
        z = c;
    }

    //Конструктор 2
    Vector() {
        x = Math.random();
        y = Math.random();
        z = Math.random();
    }

    //Метод, вычисляющий длину вектора
    double getLength(Vector a) {
        return Math.sqrt(a.x * a.x + a.y * a.y + a.z * a.z);
    }

    //Метод, вычисляющий скалярное произведение
    double getScalMult(Vector a, Vector b) {
        return a.x * b.x + a.y * b.y + a.z * b.z;
    }

    //Метод, вычисляющий векторное произведение
    Vector getVectorMult(Vector a, Vector b) {
        Vector c = new Vector(0, 0, 0);
        c.x = a.y * b.z - a.z * b.y;
        c.y = a.z * b.x - a.x * b.z;
        c.z = a.x * b.y - a.y * b.x;
        return c;
    }

    //Метод, вычисляющий косинус угла между векторами
    double getAngle(Vector a, Vector b) {
        return getScalMult(a, b) / (getLength(a) * getLength(b));
    }

    //Метод, вычисляющий сумму векторов
    Vector getSum(Vector a, Vector b) {
        Vector c = new Vector(a.x + b.x, a.y + b.y, a.z + b.z);
        return c;
    }

    //Метод, вычисляющий разность векторов
    Vector getDif(Vector a, Vector b) {
        Vector c = new Vector(a.x - b.x, a.y - b.y, a.z - b.z);
        return c;
    }

    //Метод, возвращающий массив случайных векторов
    public static Vector[] vectorArr(int n) {
        Vector[] arr = new Vector[n];
        for (int i = 0; i < n; i++) {
            arr[i] = new Vector();
        }
        return arr;
    }

}

public class task_01 {
    public static void main(String[] args) {
        Vector a = new Vector(1, 2, 2);
        Vector b = new Vector(1, 2, 3);
        printVector("a", a);
        printVector("b", b);
//        System.out.println("Вектор a: ("+a.x+", "+a.y+", "+a.z+")");
//        System.out.println("Вектор b: ("+b.x+", "+b.y+", "+b.z);
        System.out.println("Длина вектора a = " + a.getLength(a));
        System.out.println("Скалярное произведение: " + a.getScalMult(a, b));
        System.out.println("Косинус угла: " + a.getAngle(a, b));
    }

    // Для вывода вектора на экран
    public static void printVector(String name, Vector a) {
        System.out.println("Вектор " + name + ": (" + a.x + ", " + a.y + ", " + a.z + ")");
    }
}
