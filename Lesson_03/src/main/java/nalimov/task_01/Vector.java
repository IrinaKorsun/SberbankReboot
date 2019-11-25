package nalimov.task_01;

import java.util.Arrays;

public class Vector {
    //Координаты вектора
    double x, y, z;

    //Присваиваем координаты вектора напрямую, каждому объекту
    Vector() {
        this.x = Math.random() * 10.;
        this.y = Math.random() * 10.;
        this.z = Math.random() * 10.;
    }

    //Длинна вектора
    public double getLength() {
        return Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2) + Math.pow(this.z, 2));
    }

    //Скалярное произведение
    public double getSkalar(double x, double y, double z) {
        return this.x * x + this.y * y + this.z * z;
    }

    //Векторное произведение
    public StringBuilder getVectorProd(double x, double y, double z) {
        return new StringBuilder().append("(")
                .append((this.y * z) - (this.z * y))
                .append(",")
                .append((this.z * x) - (this.x * z))
                .append(",")
                .append((this.x * y) - (this.y * x))
                .append(")");
    }

    //Сумма векторов
    public StringBuilder getVectorSum(double x, double y, double z) {
        return new StringBuilder().append("(")
                .append((this.x + x))
                .append(",")
                .append((this.y + y))
                .append(",")
                .append((this.z + z))
                .append(")");
    }

    //Раздность векторов
    public StringBuilder getVectorMin(double x, double y, double z) {
        return new StringBuilder().append("(")
                .append((this.x - x))
                .append(",")
                .append((this.y - y))
                .append(",")
                .append((this.z - z))
                .append(")");
    }

    //Угол между векторами
    public double getVectorCos(double x, double y, double z, Vector b) {
        return getSkalar(x, y, z) / (Math.abs(this.getLength()) * Math.abs(b.getLength()));
    }

    //Статический метод создания массива объектов
    public static Vector[] getVectorObject(int n) {
        Vector[] vectArray = new Vector[n];

        for (int i = 0; i < n; i++) {
            vectArray[i] = new Vector();
        }

        return vectArray;
    }

    public static void main(String[] args) {
        //Создаем и извликаем нужное количество объектов в массив
        Vector[] vectArray = getVectorObject(2);
        //Проверяем созданные оъекты
        System.out.println("Объекты : " + Arrays.toString(vectArray));
        //Координаты векторов
        System.out.println("Координаты верктора 1 : " + vectArray[0].x + " " + vectArray[0].y + " " + vectArray[0].z);
        System.out.println("Координаты верктора 2 : " + vectArray[1].x + " " + vectArray[1].y + " " + vectArray[1].z);
        //Длина векторов
        System.out.println("Длинна вектора 1 : " + vectArray[0].getLength());
        System.out.println("Длинна вектора 2 : " + vectArray[1].getLength());
        //Скалярное произведение
        System.out.println("Скалярное произведение : " + vectArray[0].getSkalar(vectArray[1].x, vectArray[1].y, vectArray[1].z));
        //Векторное произведение
        System.out.println("Векторное произведение : " + vectArray[0].getVectorProd(vectArray[1].x, vectArray[1].y, vectArray[1].z));
        //Сумма векторов
        System.out.println("Сумма векторов : " + vectArray[0].getVectorSum(vectArray[1].x, vectArray[1].y, vectArray[1].z));
        //Раздность длин векторов
        System.out.println("Раздность длин векторов : " + vectArray[0].getVectorMin(vectArray[1].x, vectArray[1].y, vectArray[1].z));
        //Угол между векторами
        System.out.println("Угол между векторами : " + vectArray[0].getVectorCos(vectArray[1].x, vectArray[1].y, vectArray[1].z, vectArray[1]));


    }


}
