package Shape3D;

public abstract class Shape3D {

    private double x = 1;
    private double y = 1;
    private double z = 1;


    public Shape3D() {
    }

    public Shape3D(double x, double y, double z) {
        setx(x);
        sety(y);
        setz(z);
    }

    public void setx(double x) {
        this.x = x;
    }
    public void sety(double y) {
        this.y = y;
    }
    public void setz(double z) {
        this.z = z;
    }

    public double getx() {
        return x;
    }
    public double gety() {
        return y;
    }
    public double getz() {
        return z;
    }

    public abstract double volume();
    public abstract double area();
    public String toString() {
        return "posicion: ( "+ getx() +" , " + gety() + " , " + getz() + " )\n";
    }
}