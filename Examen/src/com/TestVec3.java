package com;

public class TestVec3 {
    public static void main(String[] args) {
        Vec3 v1=new Vec3(10,20,30);
        Vec3 v2= v1.clone();
        v2.setx(2);


        System.out.println(v1.toString());
        v1.normalizar();
        System.out.println(v1.toString());
        System.out.println(v1.toString());
        System.out.println(v1.punto(v2));
    }
}

