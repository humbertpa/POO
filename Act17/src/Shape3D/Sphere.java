package Shape3D;

public class Sphere extends Shape3D {

    private double Radio = 1;

    public Sphere() {
    }

    public Sphere(int x, int y, int z, double radio) {
        super(x, y, z);
        setRadio(radio);
    }

    public Sphere(int x, int y, int z) {
        super(x, y, z);
    }

    public void setRadio(double radio) {
        if (Radio > 0)
            Radio = radio;
    }

    public double getRadio() {
        return Radio;
    }


    public double volume() {
        return (4 * Math.PI) * (Math.pow(Radio, 3) / 3);
    }

    public double area() {
        return 4 * Math.PI * (Math.pow(Radio, 2));
    }

    public String toString() {
        return super.toString() + "Radio: " + getRadio() + " , Diametro: " + getRadio() * 2;
    }

}