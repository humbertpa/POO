package com;

import shapes2d.Rectangle;

import javax.swing.JOptionPane;

public class TestRectangle {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(2.5, 5);
        Rectangle r2 = new Rectangle(6.6, 2.2);
        Rectangle r3 = new Rectangle(7.5, 1.3);

        r2= new Rectangle(2);

        System.gc();

        r2 = new Rectangle( Double.parseDouble(JOptionPane.showInputDialog("nueva base")),
                            Double.parseDouble(JOptionPane.showInputDialog("nueva altura")));

        System.gc();
    }
}
