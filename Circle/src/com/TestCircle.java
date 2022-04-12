package com;

import shapes2d.Circle;

public class TestCircle {
    public static void main(String[] args) {
        Circle circ1 = new Circle(2.5);
        Circle circ2 = new Circle(6.6);
        Circle circ3 = new Circle(7.5);
        circ1.print(1);
        circ2.print(2);
        circ3.print(3);
    }
}