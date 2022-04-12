package shapes2d;

public class Rectangle {
    private double height=1.0;
    private double base=1.0;

    // Constructores
    public Rectangle() {
    }
    public Rectangle(double base) {
        setBase(base);
        setHeight(base);
    }
    public Rectangle(double base,double height) {
        setBase(base);
        setHeight(height);
    }
    public void setHeight(double height) {
        if(height>=1.0 && height<=10.0)
            this.height=height;
    }
    public void setBase(double base) {
        if(base>=1.0 && base<=10.0)
            this.base=base;
    }
    public double getHeight() {
        return(height);
    }
    public double getBase() {
        return(base);
    }
    public double getArea() {
        return(base*height);
    }
    public double getPerimeter() {
        return(2*base+2*height);
    }
    public void print(){
        System.out.println("Base= "+getBase());
        System.out.println("Height= "+getHeight());
        System.out.println("Area= "+getArea());
        System.out.println("Perimetro= "+getPerimeter()+"\n");
    }
    public void finalize() {
        System.out.println("Se destruye: " + this.base + ", " + this.height);
    }


}