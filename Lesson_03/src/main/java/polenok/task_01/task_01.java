package polenok.task_01;

class Vector {
    double x,y,z;

    //Конструктор без параметров
    Vector(){
        this.x = 0;
        this.y = 0;
        this.z = 0;
    }

    //Конструктор с параметрами
    Vector(double xi, double yi, double zi){
        this.x = xi;
        this.y = yi;
        this.z = zi;
    }

    //Метод возвращает длину вектора
    public double VectorLenght (){
        return Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2) + Math.pow(this.z, 2));
    }

    //Метод рисует вектор
    public void PrintVector (){
        System.out.println(this.x +"; "+ this.y +"; "+ this.z+"; ");
    }

    //Метод принимает вектор и вычисляет скалярное произведение
    public double ScalarMultiply (Vector vector){
        return (this.x * vector.x + this.y * vector.y + this.z * vector.z);
    }

    //Метод принимает вектор и вычисляет векторное произведение
    public Vector VectorMultiply (Vector vector){
        return new Vector(this.y * vector.z - this.z * vector.y, this.z * vector.x - this.x * vector.z, this.x * vector.y - this.y * vector.x);
    }

    //Метод, вычисляющий угол между векторами
    public double AngleBetweenVectors (Vector vector){
        return this.ScalarMultiply(vector) / Math.abs(this.VectorLenght() * vector.VectorLenght());
    }

    //Метод для суммы
    public Vector AmountVectors (Vector vector){
        return new Vector(this.x + vector.x,this.y + vector.y,this.z + vector.z);
    }

    //Метод для разности
    public Vector DifferenceVectors (Vector vector){
        return new Vector(this.x - vector.x,this.y - vector.y,this.z - vector.z);
    }

    //статический метод, который принимает целое число n, и возвращает массив случайных векторов размером n.
    public static Vector[] GenerateVectorsArray (int n){
        Vector[] vector = new Vector[n];

        for (int i = 0; i < n; i++){
            vector[i] = new Vector(1 + Math.random()*10,1 + Math.random()*10,1 + Math.random()*10);
        }

        return vector;
    }
}

public class Task_01 {
    public static void main(String[] args) {
        Vector num1 = new Vector(4,5,6);
        Vector num2 = new Vector(1, 2,3);

        System.out.print("Вектор num1: ");
        num1.PrintVector();
        System.out.print("Вектор num2: ");
        num2.PrintVector();
        System.out.println("Длина вектора num1: "+num1.VectorLenght());
        System.out.println("Скалярное произведение num1 и num2: "+num1.ScalarMultiply(num2));
        Vector num3 = num1.VectorMultiply(num2);
        System.out.print("Векторное произведение num1 и num2: ");
        num3.PrintVector();
        System.out.println("Угол между векторами num1 и num2: "+num1.AngleBetweenVectors(num2));
        Vector num4 = num1.AmountVectors(num2);
        System.out.print("Сумма num1 и num2: ");
        num4.PrintVector();
        Vector num5 = num1.DifferenceVectors(num2);
        System.out.print("Разность num1 и num2: ");
        num5.PrintVector();
        Vector[] vectarray = num1.GenerateVectorsArray(5);
        System.out.println("Массив векторов:");
        for (int i = 0; i < vectarray.length; i++){
            System.out.print("Вектор "+i+": ");
            vectarray[i].PrintVector();
        }
    }
}
