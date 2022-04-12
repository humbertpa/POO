package Shape3D;

public class Cylinder extends Shape3D {

    private double Altura = 1;
    private double Radio = 1;


    public Cylinder(int x, int y, int z, double altura, double radio) {
        super(x, y, z);
        setRadio(radio);
        setAltura(altura);
    }


    public void setRadio(double radio) {
        Radio = radio;
    }
    public void setAltura(double altura) {
        Altura = altura;
    }

    public double getRadio() {
        return Radio;
    }
    public double getAltura() {
        return Altura;
    }

    public double volume() {
        return Math.PI * (Math.pow(Radio, 2)) * Altura;
    }

    public double area() {
        return (2 * Math.PI * Radio * Altura) + (2 * Math.PI * (Math.pow(Radio, 2)));
    }

    public String toString() {
        return super.toString() + "Radio: " + getRadio() + " , Diametro: " + getRadio() * 2 + " , Altura: " + getAltura();
    }
}