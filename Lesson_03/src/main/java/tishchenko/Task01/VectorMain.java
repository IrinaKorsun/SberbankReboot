package tishchenko.Task01;

class Vector {
    double x, y, z;

    // Создаем конструктор без входных параметров
    Vector() {
        this.x = 0;
        this.y = 0;
        this.z = 0;
    }

    // Создаем конструктор с входными параметрами
    Vector(double newX, double newY, double newZ) {
        this.x = newX;
        this.y = newY;
        this.z = newZ;
    }

    //Метод отрисовки вектора для проверки корректности
    void PrintVector() {
        System.out.println("(" + this.x + ";" + this.y + ";" + this.z + ")");
    }

    //Метод вычисляющий длину вектора
    public double LengthVector(Vector vector) {
        double result = Math.sqrt(Math.pow(vector.x, 2.0) + Math.pow(vector.y, 2.0) + Math.pow(vector.z, 2.0));
        return result;
    }

    //Метод вычисляющий калярное произведение 2х векторов
    public double ScalarMultiplication(Vector vector) {
        double result = (this.x * vector.x) + (this.y * vector.y) + (this.z * vector.z);
        return result;
    }

    //Метод вычисляющий произведение 2х векторов
    public String VectorMultiplication(Vector vector) {
        double new_x = (this.y * vector.z) - (this.z * vector.y);
        double new_y = (this.z * vector.x) - (this.x * vector.z);
        double new_z = (this.x * vector.y) - (this.y * vector.x);
        String result = "(" + (int) new_x + ";" + (int) new_y + ";" + (int) new_z + ")";
        return result;
    }

    //Метод вычисляющий угол между векторами
    public double SocVectors(Vector vector) {
        Double result = (this.ScalarMultiplication(vector)) / (this.LengthVector(vector) * this.LengthVector(vector));
        return result;
    }

    //Метод вычисляющий сумму векторов
    public String Sum(Vector vector) {
        String result = "(" + (int) (this.x + vector.x) + ";" + (int) (this.y + vector.y) + ";" + (int) (this.z + vector.z) + ")";
        return result;
    }

    //Метод вычисляющий разность векторов
    public String Def(Vector vector) {
        String result = "(" + (int) (this.x - vector.x) + ";" + (int) (this.y - vector.y) + ";" + (int) (this.z - vector.z) + ")";
        return result;
    }

    //Метод формирующий массив из случайных N векторов, и возвращающий полученный массив векторов, на вход принимает длину массива N
    public Vector[] RandomArray(int n) {
        Vector[] RandArray = new Vector[n];
        for (int i = 0; i < n; i++) {
            RandArray[i] = new Vector(1 + Math.random() * 5, 1 + Math.random() * 5, 1 + Math.random() * 5);
            System.out.print("Random Vector in " + i + " element Array = ");
            RandArray[i].PrintVector();
        }
        return RandArray;
    }
}

class VectorMain {
    public static void main(String[] args) {
        Vector vectorOne = new Vector(2, 4, 6);
        System.out.print("Vector One -");
        vectorOne.PrintVector();
        Vector vectorTwo = new Vector(3, 5, 7);
        System.out.print("Vector Two -");
        vectorTwo.PrintVector();
        System.out.println("Length vector - " + vectorOne.LengthVector(vectorOne));
        System.out.println("Scalar product of vectors - " + vectorOne.ScalarMultiplication(vectorTwo));
        System.out.println("Vector multiplication - " + vectorOne.VectorMultiplication(vectorTwo));
        System.out.println("Cosine of angle between vectors - " + vectorOne.SocVectors(vectorTwo));
        System.out.println("The sum of the vectors - " + vectorOne.Sum(vectorTwo));
        System.out.println("The difference of the vectors - " + vectorOne.Def(vectorTwo));
        vectorOne.RandomArray(3);
    }
}
