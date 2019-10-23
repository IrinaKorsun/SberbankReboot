package sarapulova.task_01;

public class Vector {
    double vector_x;
    double vector_y;
    double vector_z;

    Vector(double i, double j, double k) {
        vector_x = i;
        vector_y = j;
        vector_z = k;
    }

    static double vectorLength(Vector vector)
    {
        double res;
        res = Math.sqrt(Math.pow(vector.vector_x,2) + Math.pow(vector.vector_y,2) + Math.pow(vector.vector_z,2));
        return res;
    }

    static double vectorMultScal(Vector vector1, Vector vector2)
    {
        double res;
        res = vector1.vector_x*vector2.vector_x + vector1.vector_y*vector2.vector_y + vector1.vector_z*vector2.vector_z;
        return res;
    }

    static Vector vectorMultVect(Vector vector1, Vector vector2)
    {
        double resX;
        double resY;
        double resZ;
        Vector res;
        resX = vector1.vector_y*vector2.vector_z - vector1.vector_z*vector2.vector_y;
        resY = vector1.vector_z*vector2.vector_x - vector1.vector_x*vector2.vector_z;
        resZ = vector1.vector_x*vector2.vector_y - vector1.vector_y*vector2.vector_x;
        res = new Vector(resX, resY, resZ);
        return res;
    }

    static double vectorCos(Vector vector1, Vector vector2)
    {
        double res;
        res = vectorMultScal(vector1, vector2)/(Math.abs(vectorLength(vector1)) * Math.abs(vectorLength(vector2)));
        return res;
    }

    static Vector vectorAdd(Vector vector1, Vector vector2)
    {
        double resX;
        double resY;
        double resZ;
        Vector res;
        resX = vector1.vector_x + vector2.vector_x;
        resY = vector1.vector_y + vector2.vector_y;
        resZ = vector1.vector_z + vector2.vector_z;
        res = new Vector(resX, resY, resZ);
        return res;
    }

    static Vector vectorSub(Vector vector1, Vector vector2)
    {
        double resX;
        double resY;
        double resZ;
        Vector res;
        resX = vector1.vector_x - vector2.vector_x;
        resY = vector1.vector_y - vector2.vector_y;
        resZ = vector1.vector_z - vector2.vector_z;
        res = new Vector(resX, resY, resZ);
        return res;
    }


    private static Vector[] vectorArr (int arrSize) {
        Vector[] arr = new Vector[arrSize];
        int a = 0; // Начальное значение диапазона
        int b = 100; // Конечное значение диапазона

        double resX;
        double resY;
        double resZ;

        for (int i = 0; i < arrSize; i++)
        {
            resX = a + (int) (Math.random() * b);
            resY = a + (int) (Math.random() * b);
            resZ = a + (int) (Math.random() * b);
            arr[i] = new Vector(resX, resY, resZ);
        }
        return arr;
    }

    private static void showVector(Vector vec, String str) {
        System.out.println(str);
        System.out.println("Координата x: " + vec.vector_x);
        System.out.println("Координата y: " + vec.vector_y);
        System.out.println("Координата z: " + vec.vector_z);
    }


    public static void main(String args[])
    {
        Vector vec1;
        Vector vec2;
        Vector vecRes;
        double resDbl;
        int arrSize = 2;
        Vector[] vecArr;

        vecArr = vectorArr(arrSize);
        vec1 = vecArr[0];
        vec2 = vecArr[1];

        System.out.println("Создали два произвольных вектора:");
        showVector(vec1, "Вектор 1");
        showVector(vec2, "Вуктор 2");

        vecRes = vectorAdd(vec1,vec2);
        showVector(vecRes, "Сумма векторов:");

        vecRes = vectorSub(vec1,vec2);
        showVector(vecRes, "Разность векторов:");

        resDbl = vectorLength(vec1);
        System.out.println("Длина вектора1 " + resDbl);

        resDbl = vectorLength(vec2);
        System.out.println("Длина вектора2 " + resDbl);

        resDbl = vectorMultScal(vec1, vec2);
        System.out.println("Скалярное произведение " + resDbl);

        vecRes = vectorMultVect(vec1,vec2);
        showVector(vecRes, "Векторное произведение:");

        resDbl = vectorCos(vec1, vec2);
        System.out.println("Косинус угла м/у векторами " + resDbl);
    }

}
