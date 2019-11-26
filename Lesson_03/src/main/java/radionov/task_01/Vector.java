package radionov.task_01;

public class Vector {
    double x;
    double y;
    double z;

    public Vector() {
    }

    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    //Метод, вычисляющий длину вектора
    public double length() {
        return Math.sqrt((x * x) + (y * y) + (z * z));
    }

    //Метод, вычисляющий скалярное произведение с другим вектором
    public double multipleScalarVectors(Vector v1, Vector v2) {
        return (v1.x * v2.x) + (v1.y * v2.y) + (v1.z * v2.z);
    }

    //Метод, вычисляющий векторное произведение с другим вектором
    public Vector multipleVectorVectors(Vector v1, Vector v2) {
        double x = (v1.y * v2.z) - (v1.z * v2.y);
        double y = (v1.z * v2.x) - (v1.x * v2.z);
        double z = (v1.x * v2.y) - (v1.y * v2.x);
        return new Vector(x, y, z);
    }

    /*
    Метод,  вычисляющий угол между векторами (или косинус угла):
    косинус угла между векторами равен скалярному произведению векторов,
    деленному на произведение модулей (длин) векторов
     */
    public double cos(Vector v1, Vector v2) {
        double kos = ((v1.x * v2.x) + (v1.y * v2.y) + (v1.z * v2.z)) /
                (Math.abs(v1.length()) * Math.abs(v2.length()));
        return kos;
    }

    //Метод для определения суммы векторов
    public Vector sumVectors(Vector v1, Vector v2) {
        double x = v1.x + v2.x;
        double y = v1.y + v2.y;
        double z = v1.z + v2.z;
        return new Vector(x, y, z);
    }

    //Метод для определения разности векторов
    public Vector raznostVectors(Vector v1, Vector v2) {
        double x = v1.x - v2.x;
        double y = v1.y - v2.y;
        double z = v1.z - v2.z;
        return new Vector(x, y, z);
    }

    /*
    Статический метод, который принимает целое число N,
    и возвращает массив случайных векторов, размером N
     */
    public static Vector[] arrayRandomVectors(int n) {
        Vector[] array = new Vector[n];
        for (int i = 0; i < n; i++) {
            array[i] = new Vector();
        }
        return array;
    }
}