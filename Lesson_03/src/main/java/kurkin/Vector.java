package kurkin;

import java.util.Random;

public class Vector {

    private int x, y, z;

    public Vector(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Vector() {
        new Vector(0, 0, 0);
    }

    public double getLength() {
        return Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2) + Math.pow(this.z, 2));
    }

    public double getScaleMult(Vector v) {
        return this.x*v.x + this.y*v.y + this.z*v.z;
    }

    public Vector VectMult(Vector v) {
        return new Vector(this.y*v.z - this.z*v.y, this.z*v.x - this.x*v.z, this.x* v.y - this.y*v.x);
    }
    
    public double Angle(Vector v) {
        return this.getScaleMult(v)/Math.abs(this.getLength()*v.getLength());
    }

    public Vector Sum(Vector v) {
        return new Vector(this.x+v.x, this.y+v.y, this.z+v.z);
    }

    public Vector Minus(Vector v1, Vector v2) {
        return new Vector(v1.x-v2.x, v1.y-v2.y, v1.z-v2.z);
    }

    public static Vector[] createArray(Integer N) {
        Vector[] v = new Vector[N];
        Random random = new Random();
        for (int i=0; i<N; i++) {
            v[i] = new Vector( random.nextInt(100),  random.nextInt(100),  random.nextInt(100));
        }
        return v;
    }

    public void print() {
        System.out.println("X: " + this.x + "; Y: " + this.y + "; Z: " + this.z);
    }
}