package com;

public class B extends A {
    static {
        System.out.println("static de B");
    }
    private double a1 = 2 * super.a1;
    public B(int _a1) {
        this.a1 -= _a1;
        System.out.println(a1);
    }
}