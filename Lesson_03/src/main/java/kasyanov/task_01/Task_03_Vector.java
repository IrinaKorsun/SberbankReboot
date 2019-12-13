package kasyanov.task_01;

import java.util.Scanner;

public class Task_03_Vector {   // класс вектор
    double x;
    double y;
    double z;

    Task_03_Vector(double x, double y, double z) { // конструктор класса "task_03_vector" с тремя обязательными параметрами x, y, z
        this.x = x;
        this.y = y;
        this.z = z;
    }

    // метод, вычисляющий длину вектора. Корень можно посчитать с помощью Math.sqrt()
    public double LenVector() {     // метод "LenVector()" класса "task_03_vector" для вычисления длины
        return Math.sqrt(x * x + y * y + z * z);
    }

    // метод, вычисляющий скалярное произведение
    public double scalarVector(Task_03_Vector arg_vector) {
        return x * arg_vector.x + y * arg_vector.y + z * arg_vector.z;
    }

    // метод, вычисляющий векторное произведение
    public Task_03_Vector crossVector(Task_03_Vector task_03_vector) {
        return new Task_03_Vector(
                y * task_03_vector.z - z * task_03_vector.y,
                z * task_03_vector.x - x * task_03_vector.z,
                x * task_03_vector.y - y * task_03_vector.x);
    }

    // Косинус между двумя векторами
    public double cosVector(Task_03_Vector task_03_vector) {
        // Для вычисления длины и произведения используются методы multiply и length
        return scalarVector(task_03_vector) / (LenVector() * task_03_vector.LenVector());
    }

    // Метод для суммы
    public Task_03_Vector add(Task_03_Vector task_03_vector) {
        return new Task_03_Vector(
                x + task_03_vector.x,
                y + task_03_vector.y,
                z + task_03_vector.z
        );
    }

    // Метод для разности
    public Task_03_Vector subtract(Task_03_Vector task_03_vector) {
        return new Task_03_Vector(
                x - task_03_vector.x,
                y - task_03_vector.y,
                z - task_03_vector.z
        );
    }

    // статический метод, который принимает целое число N, и возвращает массив случайных векторов размером N
    public static Task_03_Vector[] generate(int n){
        Task_03_Vector[] vectors = new Task_03_Vector[n];
        for(int i =0; i < n; i++){
            vectors[i] = new Task_03_Vector(Math.random(), Math.random(), Math.random());
        }
        return vectors;
    }

    public static void main(String[] args) {
        System.out.println("Задание 3: про вектора");   // Заголовок
        System.out.println("----------------------");   // Заголовок

        // Создаем новый объект vector1 класса "task_03_vector" и передаем ему согласно конструктора три параметра
        Task_03_Vector vector1 = new Task_03_Vector(10, 10, 10);

        // Выводим на экран результат метода "LenVector()" объекта "vector1" класса "task_03_vector"
        System.out.println("Длина вектора =" + vector1.LenVector());

        Task_03_Vector vector2 = new Task_03_Vector(10, 10, 10);
        System.out.println("Свалярное произведение векторов =" + vector2.scalarVector(vector1));

        //Task_03_Vector vector3 = new Task_03_Vector(10, 10, 10);
        Task_03_Vector vector3 = vector2.crossVector(vector2);
        System.out.println("Векторное произведение: x = " + vector3.x + " y = " + vector3.y + " z = " + vector3.z);

        System.out.println("Косинус между двумя векторами =" + vector1.cosVector(vector1));

        Task_03_Vector vector4 = vector1.add(vector1);
        //System.out.println("Метод для суммы =" + vector1.add(vector1));
        System.out.println("Метод для суммы : x = " + vector4.x + " y = " + vector4.y + " z = " + vector4.z);

        Task_03_Vector vector5 = vector1.subtract(vector1);
        //System.out.println("Метод для разности =" + vector1.subtract(vector1));
        System.out.println("Метод для разности : x = " + vector5.x + " y = " + vector5.y + " z = " + vector5.z);

        System.out.println("Mассив случайных векторов размером N = 10;); ");

        // Задаем размер массива
        int nn = 10;
        // Создадим массив
        Task_03_Vector[]vectors  = vector1.generate(nn);

        for(int i =0; i < nn; i++){
            System.out.print("Вектор " + i + " х = "+ vectors[i].x + " y = " + vectors[i].y + " z = " + vectors[i].z);
            //+ vectors[i].x +" ");
            System.out.println(" ");
        }

        System.out.println("----------------------------");
        System.out.println("Программа кспешно завершена.");   // Конец программы

    }
}