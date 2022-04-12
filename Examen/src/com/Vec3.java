package com;
//import java.lang.Math;


public class Vec3 {
    private double x, y, z;

    public Vec3(double x, double y, double z) {
        setx(x);
        sety(y);
        setz(z);
        if (!isValid()) {
            setx(0);
            sety(0);
            setz(0);
        }
    }

    public boolean isValid() {
        return (getx() != 101 && gety() != 101 && getz() != 101);
    }

    public void setx(double x) {
        if (x > -100 && x < 100) {
            this.x = x;
        } else {
            this.x = 101;
        }
    }

    public void sety(double y) {
        if (y > -100 && y < 100) {
            this.y = y;
        } else {
            this.y = 101;
        }
    }

    public void setz(double z) {
        if (z > -100 && z < 100) {
            this.z = z;
        } else {
            this.z = 101;
        }
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

    public double magnitud() {
        return Math.sqrt((getx()) * (getx()) + (gety()) * (gety()) + (getz()) * (getz()));
    }

    public void normalizar() {
        this.x = getx() / magnitud();
        this.y = gety() / magnitud();
        this.z = getx() / magnitud();
    }

    public String toString() {
        return String.format(  "{x:%.2f, y:%.2f, z:%.2f}", getx(), gety(), getz() );
    }

    public Vec3 clone() {
        return new Vec3(x, y, z);
    }

    public double punto(Object o) {
        double ppunto = 0;
        if (o instanceof Vec3) {
            Vec3 v = (Vec3) o;
            ppunto=(getx() * v.getx() + gety() * v.gety() + getz() * v.getz());
        }
        return ppunto;
    }


    public boolean equals(Object o) {
        if (o instanceof Vec3) {
            Vec3 vec = (Vec3) o;
            return vec.getx() == this.x && vec.gety() == this.y && vec.getz() == this.z;
        } else return false;
    }
}
