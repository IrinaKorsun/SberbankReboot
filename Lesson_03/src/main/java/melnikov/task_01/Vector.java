package melnikov.task_01;

public class Vector {

    private double x, y, z;

    Vector(double x, double y, double z){
       this.x = x;
       this.y = y;
       this.z = z;
    }

    double getX() {
        return x;
    }

    double getY() {
        return y;
    }

    double getZ() {
        return z;
    }

    static double lenght(Vector a) {
        return Math.sqrt(a.x*a.x + a.y*a.y + a.z*a.z);
    }

    public double lenght() {
        return  lenght(this);
    }

    static public double scalarProduct(Vector a, Vector b) {
        return a.x * b.x + a.y * b.y + a.z * b.z;
    }

    public double scalarProduct(Vector b) {
        return scalarProduct(this, b);
    }

    static public Vector vectotProduct(Vector a, Vector b) {
        return new Vector (a.y * b.z - a.z * b.y, a.z * b.x - a.x * b.z, a.x * b.y - a.y * b.x );
    }

    public Vector vectotProduct(Vector b) {
        return vectotProduct(this, b);
    }

    static public double angle(Vector a, Vector b) {
        return scalarProduct(a,b) / Math.abs(a.lenght()) * Math.abs( b.lenght() ) ;
    }

    public double angle(Vector b) {
        return angle(this, b);
    }

    static public Vector add(Vector a, Vector b) {
        return new Vector( a.x + b.x, a.y + b.y, a.z + b.z);
    }

    public Vector add(Vector b) {
        return add(this, b);
    }

    static public Vector sub(Vector a, Vector b) {
        return new Vector( a.x - b.x, a.y - b.y, a.z - b.z);
    }

    public Vector sub(Vector b) {
        return sub(this, b);
    }

    static public Vector[] generateRandomVectors(int N) {
        Vector[] result = new Vector[N];

        for (int i = 0; i < N; i++) {
            result[i] = new Vector (
                    Math.random(),
                    Math.random(),
                    Math.random()
            );
        }
        return result;
    }
}
