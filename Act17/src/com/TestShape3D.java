package com;

import Shape3D.*;

public class TestShape3D {
    public static void main(String[] args) {
        Shape3D cubo = new Box(1,1,1,6);
        System.out.println(cubo);
        System.out.println(cubo.area());
        System.out.println(cubo.volume());
        System.out.println();

        Shape3D Esfera = new Sphere(1,1,1,3);
        System.out.println(Esfera);
        System.out.println(Esfera.volume());
        System.out.println(Esfera.area());
        System.out.println();

        Shape3D Cilindro = new Cylinder(1, 1,1,2,1);
        System.out.println(Cilindro);
        System.out.println(Cilindro.volume());
        System.out.println(Cilindro.area());
    }
}