package shevnin.task_01;

import static java.lang.System.*;

public class Vector_shevnin {
    double x, y, z;

    // конструктор вектора
    public Vector_shevnin(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    // длина вектора
    public double length() {
        return Math.sqrt(x*x + y*y + z*z);
    }

    // скалярное произведение вектора this на вектор secondVector
    public double scalarProduct(Vector_shevnin secondVector) {
        return this.x*secondVector.x + this.y*secondVector.y + this.z*secondVector.z;
    }

    // векторное произведение вектора this на вектор secondVector
    public Vector_shevnin vectorProduct(Vector_shevnin secondVector) {
       return new Vector_shevnin(
                this.y * secondVector.z - this.z * secondVector.y
                , this.z * secondVector.x - this.x * secondVector.z
                , this.x * secondVector.y - this.y * secondVector.x
        );
    }

    // косинус улга между вектором this и вектором secondVector
    public double vectorAngle(Vector_shevnin secondVector) {
        return this.scalarProduct(secondVector) / this.length() / secondVector.length();
    }

    // сумма вектора this и вектора secondVector
    public Vector_shevnin vectorSum(Vector_shevnin secondVector) {
        return new Vector_shevnin(
                this.x + secondVector.x
                ,this.y + secondVector.y
                ,this.z + secondVector.z
        );
    }

    // разность векторов this и secondVector
    public Vector_shevnin vectorDiff(Vector_shevnin secondVector) {
        return new Vector_shevnin(
                this.x - secondVector.x
                ,this.y - secondVector.y
                ,this.z - secondVector.z
        );
    }

    public static void main(String[] args) {

        try {
            int vectorCount = Integer.parseInt(args[0]);
            out.println("Количество векторов = " + vectorCount);
            Vector_shevnin[] vectorArr = new Vector_shevnin[vectorCount+4];
            for (int i = 0; i < vectorCount; i++) {
                 vectorArr[i] = new Vector_shevnin(Math.random(),Math.random(),Math.random());
                out.println("vector["+i+"] = ("+vectorArr[i].x+",\t"+vectorArr[i].y+",\t"+vectorArr[i].z+"),\t length = "+vectorArr[i].length());
            }
            if (vectorCount > 1) {
                vectorArr[vectorCount] = vectorArr[0].vectorProduct(vectorArr[1]);
                vectorArr[vectorCount+1] = vectorArr[0].vectorSum(vectorArr[1]);
            }
            if (vectorCount > 3) {
                vectorArr[vectorCount+2] = vectorArr[2].vectorProduct(vectorArr[3]);
                vectorArr[vectorCount+3] = vectorArr[2].vectorDiff(vectorArr[3]);
            }
            out.println("============ Проверки ===============");
            for (int i = 0; i < vectorCount+4; i++) {
                if (i == 0) out.println("---------------- сохранность исходных векторов:");
                if (i == vectorCount) out.println("----------------результаты вычислений ----------------");
                if (i == vectorCount && vectorCount > 1) out.println("["+vectorCount+"] = [0]x[1]. [0]v[1] = " + vectorArr[0].vectorAngle(vectorArr[1]));
                if (i == vectorCount+1 && vectorCount > 1) out.println("["+(vectorCount+1)+"] = [0]+[1]. [0]*[1] = " + vectorArr[0].scalarProduct(vectorArr[1]));
                if (i == vectorCount+2 && vectorCount > 3) out.println("["+(vectorCount+2)+"] = [2]x[3]. [2]v[3] = " + vectorArr[2].vectorAngle(vectorArr[3]));
                if (i == vectorCount+3 && vectorCount > 3) out.println("["+(vectorCount+3)+"] = [2]-[3]. [2]*[3] = " + vectorArr[2].scalarProduct(vectorArr[3]));
                if (vectorArr[i] != null)  out.println("vector["+i+"] = ("+vectorArr[i].x+",\t"+vectorArr[i].y+",\t"+vectorArr[i].z+"),\t length = "+vectorArr[i].length());
            }

        } catch (ArrayIndexOutOfBoundsException e) {
            out.println("Отсутствует параметр " + e.getMessage() + "!");
        } catch (NumberFormatException e) {
            out.println("Нецелочисленный аргумент! " + e.getMessage());
        }
    }
 }
