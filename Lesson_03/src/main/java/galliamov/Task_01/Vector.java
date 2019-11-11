package galliamov.Task_01;

public class Vector {
    public double l_dX;
    public double l_dY;
    public double l_dZ;

    Vector(double x, double y, double z) {
        l_dX = x;
        l_dY = y;
        l_dZ = z;
    }

    Vector() {
        l_dX = 0;
        l_dY = 0;
        l_dZ = 0;
    }

    // Вычисление длины вектора
    double calcLength() {
        return Math.sqrt(this.l_dX * this.l_dX + this.l_dY * this.l_dY + this.l_dZ * this.l_dZ);
    }

    // Вычисление скалярного произведения
    double calcScalar(Vector p_rVec) {
        return this.l_dX * p_rVec.l_dX + this.l_dY * p_rVec.l_dY + this.l_dZ * p_rVec.l_dZ;
    }

    // Вычисление векторного произведения
    Vector calcVectorProduct(Vector p_rVec) {
        Vector rRes = new Vector();

        rRes.l_dX = this.l_dY * p_rVec.l_dZ - this.l_dZ * p_rVec.l_dY;
        rRes.l_dY = this.l_dZ * p_rVec.l_dX - this.l_dX * p_rVec.l_dZ;
        rRes.l_dZ = this.l_dX * p_rVec.l_dY - this.l_dY * p_rVec.l_dX;

        return rRes;
    }

    // Вычисление угла
    double calcAngle(Vector p_rVec) {
        return Math.cos(this.calcScalar(p_rVec) / (this.calcLength() * p_rVec.calcLength()));
    }

    // Сложение векторов
    Vector calcAdd(Vector p_rVec) {
        Vector rRes = new Vector();

        rRes.l_dX = this.l_dX + p_rVec.l_dX;
        rRes.l_dY = this.l_dY + p_rVec.l_dY;
        rRes.l_dZ = this.l_dZ + p_rVec.l_dZ;

        return rRes;
    }

    // Разность векторов
    Vector calcDiff(Vector p_rVec) {
        Vector rRes = new Vector();

        rRes.l_dX = this.l_dX - p_rVec.l_dX;
        rRes.l_dY = this.l_dY - p_rVec.l_dY;
        rRes.l_dZ = this.l_dZ - p_rVec.l_dZ;

        return rRes;
    }

    // Вывести значение вектора
    void printVector() {
        System.out.println("Вектор (" + this.l_dX + ", " + this.l_dY + ", " + this.l_dZ + ") с длиной = " + this.calcLength());
    }


    public static Vector[] generateVectors(int p_iCount) {
        Vector[] ArrVec = new Vector[p_iCount];

        for (int i = 0; i < p_iCount; i++) {
            ArrVec[i] = new Vector(Math.random() * 10, Math.random() * 10, Math.random() * 10);
        }

        return ArrVec;
    }


    public static void main(String[] args) {
        Vector[] ArrVec;
        Vector rNewVec = new Vector();

        int iCount = 10;

        ArrVec = generateVectors(iCount);

        for (int i = 0; i < iCount; i++) {
            ArrVec[i].printVector();
        }

        System.out.println("Вычисление длины вектора 0 = " + ArrVec[0].calcLength());
        System.out.println("Вычисление скалярного произведения векторов 0 и 1 = " + ArrVec[0].calcScalar(ArrVec[1]));
        rNewVec = ArrVec[0].calcVectorProduct(ArrVec[1]);
        System.out.println("Вычисление векторного произведения векторов 0 и 1 = ");
        rNewVec.printVector();
        System.out.println("Вычисление угла между векторов 0 и 1 = " + ArrVec[0].calcAngle(ArrVec[1]));
        rNewVec = ArrVec[0].calcAdd(ArrVec[1]);
        System.out.println("Сложение векторов 0 и 1 = ");
        rNewVec.printVector();
        rNewVec = ArrVec[0].calcDiff(ArrVec[1]);
        System.out.println("Вычетание векторов 0 и 1 = ");
        rNewVec.printVector();
    }
}