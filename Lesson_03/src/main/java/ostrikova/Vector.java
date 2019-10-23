package ostrikova;

import java.util.Scanner;

class Vector {
    double Ox;
    double Oy;
    double Oz;

    Vector(double x, double y, double z) { // объявляем конструктор с координатами вектора в трёхмерном пространстве
        Ox = x;
        Oy = y;
        Oz = z;
    }

    double lengthVec() {
        double ln = Math.sqrt(Ox * Ox + Oy * Oy + Oz * Oz); //вычисляем длину вектора
        return ln;
    }

    double scalPr(double x1, double y1, double z1){
        double sp=Ox*x1+Oy*y1+Oz*z1; // вычисляем скалярное произведение
        return sp;
    }


    double [] vectPr(double x1, double y1, double z1){
        double []c=new double[3];
        c [0] = (Oy*z1-Oz*y1);
        c[1]= (Oz*x1-Ox-z1);
        c[2]=  (Ox*y1-Oy*x1);
        return c;

    }

    double cortVect(double sp, double l, double l1) {
        double cv=sp/(l*l1);
        return cv;
    }

    double [] sumVect (double x, double y, double z, double x1, double y1, double z1) {
        double [] a= {x,y,z};
        double [] b={x1,y1,z1};
        double []c={(x+x1),(y+y1),(z+z1)};
        return c;
    }

    double [] resVect (double x, double y, double z, double x1, double y1, double z1) {
        double [] a= {x,y,z};
        double [] b={x1,y1,z1};
        double []w={(x1-x),(y1-y),(z1-z)};
        return w;
    }

   /* static double [][] mas (){
        System.out.println ("Введите целое число N (размер массива); ");
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        double[][] ar = new double[n][3];
        for (int i=0; i<n; i++){
            for(int j=0; j<=3; j++) {
                ar[i][j] = Math.random()*5 + 1; // заполняем массив случайными числами
                System.out.println(ar[i][j]); //выводим массив на консоль
            }
        }
        return ar;
    }
*/


    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System. out.println("Введите координаты первого вектора (координату х, координату y и координату z); ");
        double x1=scan.nextDouble();
        double y1=scan.nextDouble();
        double z1=scan.nextDouble();
        System. out.println("Введите координаты второго вектора (координату х, координату y и координату z); ");
        double x=scan.nextDouble();
        double y=scan.nextDouble();
        double z=scan.nextDouble();
        Vector one = new Vector(x, y, z);
        Vector two = new Vector(x1, y1,z1);
        double lengthVecOne = one.lengthVec();
        double lengthVecTwo = two.lengthVec();
        double scalPrOne=one.scalPr(x1, y1,z1);
        double[] vectPrOne=one.vectPr(x1, y1,z1);
        double cortVectOne=one.cortVect(scalPrOne, lengthVecOne, lengthVecTwo);
        double []sumVectOne=one.sumVect(x, y, z, x1, y1,z1);
        double []resVectOne=one.sumVect(x, y, z, x1, y1,z1);
        //double [][]masOne=one.mas();
        System.out.println("Длина первого вектора равна: "+ lengthVecOne+"\nДлина второго вектора равна: "+lengthVecTwo);
        System.out.println("Скалярное произведение векторов равно: "+scalPrOne);
        System.out.println("Векторное произведение векторов равно: "+ vectPrOne);
        System.out.println("Угол между векторами равен: "+cortVectOne);
        System.out.println("Сумма векторов равна: "+sumVectOne);
        System.out.println("Разница векторов равна: "+resVectOne);
        //System.out.println("Новый массив векторов: "+masOne);
    }
}

