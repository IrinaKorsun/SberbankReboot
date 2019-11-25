package ostrikova;
import java.util.Scanner;

class Vector {
    double x;
    double y;
    double z;

    Vector(double x, double y, double z) { // объявляем конструктор с координатами вектора в трёхмерном пространстве
        this.x = x;
        this.y = y;
        this.z = z;
    }

    double lengthVec() {
        return Math.sqrt(x * x + y * y + z * z); //вычисляем длину вектора;
    }

    double scalPr(double x1, double y1, double z1){
        return x*x1+y*y1+z*z1; // вычисляем скалярное произведение;
    }

    double cortVect(double sp, double l, double l1) {
        return sp/(l*l1);
    }

    double [] vectPr(double x1, double y1, double z1){
        double []c = new double[3];
        c[0]=(this.y * z1 - this.z * y1);
        c[1]=(this.z * x1 - this.x * z1);
        c[2]=(this.x * y1 - this.y * x1);
        return c;
    }

    public double [] sumV(double x1, double y1, double z1) {
        double []v = new double[3];
        v[0]=(this.x + x1);
        v[1]=(this.y + y1);
        v[2]=(this.z + z1);
        return v;
    }

    double[] resVect(double x1, double y1, double z1) {
        double[] r=new double[3];
        r[0]= (x1-this.x);
        r[1]=(y1-this.y);
        r[2]=(z1-this.z);
        return r;
    }

    static double [][] mas (){
        System.out.println ("Введите целое число N (размер массива); ");
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        double[][] ar = new double[n][n];
        System.out.println ("Создан массив размером "+n+" строк на "+n+" столбцов: ");
        for (int i=0; i<n; i++) {
            for (int j = 0; j < n; j++) {
                ar[i][j] = Math.random() * 5 + 1; // заполняем массив случайными числами
                System.out.print(ar[i][j] + "\t"); //выводим массив на консоль
            }
            System.out.println();
        }
        return ar;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите координаты первого вектора (координату х, координату y и координату z); ");
        double x1 = scan.nextDouble();
        double y1 = scan.nextDouble();
        double z1 = scan.nextDouble();
        System.out.println("Введите координаты второго вектора (координату х, координату y и координату z); ");
        double x = scan.nextDouble();
        double y = scan.nextDouble();
        double z = scan.nextDouble();

        Vector one = new Vector(x, y, z);
        Vector two = new Vector(x1, y1, z1);

        double lengthVecOne = one.lengthVec();
        double lengthVecTwo = two.lengthVec();
        System.out.println("Длина первого вектора равна: " + lengthVecOne + "\nДлина второго вектора равна: " + lengthVecTwo);

        double scalPrOne = one.scalPr(x1, y1, z1);
        System.out.println("Скалярное произведение векторов равно: " + scalPrOne);

        double cortVectOne = one.cortVect(scalPrOne, lengthVecOne, lengthVecTwo);
        System.out.println("Угол между векторами равен: " + cortVectOne);

        double[] vectPrOne = one.vectPr(x1, y1, z1);
        System.out.println("Векторное произведение векторов равно: ");
        for (int k = 0; k <= 2; k++) {
            System.out.println(vectPrOne[k]);
        }

        double[] sumVOne=one.sumV(x1, y1,z1);
        System.out.println("Сумма векторов равна: ");
        for (int b=0; b<=2;b++) {
            System.out.println(sumVOne[b]);
        }

        double[] resVectOne = one.resVect(x1, y1, z1);
        System.out.println("Разница векторов равна: ");
        for (int g = 0; g <= 2; g++) {
            System.out.println(resVectOne[g]);
        }

        double [][]masOne=one.mas();
    }
}