package main.java.sharoyko.Task_01;
import java.util.Scanner;

/**
 *класс Вектор, содержит методы:
 *возврата значений
 *вычисление длинны
 *вычисление скалярного произведения
 * векторное произведение с другим вектором
 *вычисление угла 2 векторов
 *вычисление суммы 2 векторов
 *вычисление разности 2 векторов
 *метод принимающий число N создающий массив N объектов в который помещается случайно сгенерированный вектор
 * ВАЖНО: некоторые методы возвращают значение, т.к. применяются другими методами
 * другие же методы выводятся через консоль напрямую поскольку содержат фигурные скобки (например: {1,5,7})
 */

class Vector{
    //определение атрибутов класса
    private double x, y, z;

    //конструктор класса, присваивает атрибутам значения
    Vector(double xIn, double yIn, double zIn) {
        x = xIn;
        y = yIn;
        z = zIn;
    }

    //возврат значений атрибутов
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    //метод, вычисляющий длину вектора (возвращает значение т.к. используется Косинуса угла вектора)
    public double lengthVector() {
        return Math.sqrt((x * x) + (y * y) + (z * z));
    }

    //метод, вычисляющий скалярное произведение (возвращает значение т.к. используется Косинуса угла вектора)
    public double scalarVectors(Vector a, Vector b) {
        return (a.getX() * b.getX()) + (a.getY() * b.getY()) + (a.getZ() * b.getZ());
    }

    //метод, вычисляющий векторное произведение с другим вектором (выводит значение в консоль)
    public void vectors(Vector a, Vector b) {
        System.out.println("Вектороное произведение равно: {" + (a.getY() * b.getZ() - a.getZ() * b.getY()) + ";" + (a.getZ() * b.getX() - a.getX() * b.getZ()) + ";" + (a.getX() * b.getY() - a.getY() * b.getX()) + "}");
    }

    //метод, вычисляющий угол между векторами (выводит значение в консоль)
    public void angleVectors(Vector a, Vector b) {
        System.out.println("Угол между векторами равен: " + scalarVectors(a, b) / (a.lengthVector() * b.lengthVector()));
    }

    //метод, вычисляющий сумму векторов (выводит значение в консоль)
    public void sumVectors(Vector a, Vector b) {
        System.out.println("Сумма векторов равна: {" + (a.getX() + b.getX()) + ";" + (a.getY() + b.getY()) + ";" + (a.getZ() + b.getZ()) + "}");
    }

    //метод, вычисляющий разность векторов (выводит значение в консоль)
    public void differenceVectors(Vector a, Vector b) {
        System.out.println("Разность векторов равна: {" + (a.getX() - b.getX()) + ";" + (a.getY() - b.getY()) + ";" + (a.getZ() - b.getZ()) + "}");
    }

    //статисческий метод принимающий число и возвращающий массив случайных векторов
    public static Vector[] arrayVectors(int N) {
        //объявляем новые переменные x, y, z которым будет присваиваться случайное значение
        double xNew, yNew, zNew;

        //создаем массив объектов класса размером N
        Vector[] arrVect = new Vector[N];

        //цикл, в котором добавляются векторы со случайными значениями
        for (int i = 0; i < N; i++) {
            xNew = 0 + Math.random() * 10;
            yNew = 0 + Math.random() * 10;
            zNew = 0 + Math.random() * 10;
            arrVect[i] = new Vector(xNew, yNew, zNew);
        }
        return arrVect;
    }
}

public class Task_01 {

    public static void main(String[] args) {
        //объявляем начальные векторы vec, a и b на которых будет показаны методы класса в действии
        Vector vec = new Vector(1, 4, 6);
        Vector a = new Vector(1, 2, 4);
        Vector b = new Vector(7, 4, 5);

        //вычисляем длину вектора vec
        System.out.println("Длина вектора vec вектора равна: " + vec.lengthVector());

        //вычисляем и выводим на экран скалярное прозведение векторов a и b
        System.out.println("Скалярное прозведение векторов a и b: " + vec.scalarVectors(a, b));

        //вычисление векторное прозведение векторов a и b
        vec.vectors(a, b);

        //вычисление угла векторов a и b
        vec.angleVectors(a, b);

        //вычисление суммы векторов a и b
        vec.differenceVectors(a, b);

        //вычисление разности векторов a и b
        vec.sumVectors(a, b);

        //просим пользователя ввести размер массива в консоль при помощи сканера
        System.out.println("Введите размер массива:\n");
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();

        //обращаемся к классу Вектор и вызываем метод создания массива векторов со случайными значениями параметров от 1 до 10
        //и возвращаем его в новый массив векторов в Майн
        Vector[] arrVec = Vector.arrayVectors(N);

        //выводим значения для массива векторов (в данном случае длинну векторов)
        for (int i = 0; i < N; i++) {
            System.out.println("Длина вектора с индексом" + i + " равна: " + arrVec[i].lengthVector());
        }
    }

}
