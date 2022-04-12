package shapes2d;

public class Circle {
    protected double radio;

    public Circle(double r) {
        radio = r;
    }

    public double getPerimeter() {
        return Math.PI * radio * 2;
    }

    public double getArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    public void print(int i){
        System.out.println("Circulo "+i);
        System.out.println("Radio= "+radio);
        System.out.println("Area= "+getArea());
        System.out.println("Perimetro= "+getPerimeter()+"\n");
    }
}
