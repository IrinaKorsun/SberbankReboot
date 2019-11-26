package kurkin.task_01;

public class task_01 {

    public static void main(String[] args) {
            Vector vector = new Vector(1, 2, 3);
            System.out.println(vector.getLength());
        System.out.println(vector.getScaleMult(vector));
        Vector[] v = new Vector[10];
        v = Vector.createArray(10);
        for (int i=0; i<v.length; i++) {
            v[i].print();
        }
        }

}
