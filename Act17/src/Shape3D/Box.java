package Shape3D;

public class Box extends Shape3D {

    private double alto = 1;
    private double ancho = 1;
    private double largo = 1;

    public Box() {
    }

    public Box(double x, double y, double z, double lado) {
        super(x, y, z);
        setAlto(lado);
        setAncho(lado);
        setLargo(lado);
    }

    public Box(double x, double y, double z, double alto, double ancho, double largo) {
        super(x, y, z);
        setAlto(alto);
        setAncho(ancho);
        setLargo(largo);
    }

    public Box(int x, int y, int z) {
        super(x, y, z);
    }

    public void setAlto(double alto) {
        if (alto > 0)
            this.alto = alto;
    }
    public void setAncho(double ancho) {
        if (ancho > 0)
            this.ancho = ancho;
    }
    public void setLargo(double largo) {
        if (largo > 0)
            this.largo = largo;
    }

    public double getAlto() {
        return alto;
    }
    public double getAncho() {
        return ancho;
    }
    public double getLargo() {
        return largo;
    }

    //Methods
    public double volume() {
        return alto * ancho * largo;
    }

    public double area() {
        return 2*(alto*(ancho+largo)+largo*ancho);
    }

    public String toString() {
        return super.toString() + "Alto: " + getAlto() + " , Ancho: " + getAncho() + " , Largo: " + getLargo();
    }
}