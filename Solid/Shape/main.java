/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication15;

/**
 *
 * @author ASUS
 */
public class main {

    private static final int width = 4;
    private static final int height = 5;
    private static final int side = 5;

    public static void main(String[] args) {
        Rectangle reg1 = new Rectangle(width, height);
        System.out.println("==== Rectangle ====");
        System.out.println("Width = " + width);
        System.out.println("Height = " + height);
        System.out.println("Area = " + reg1.getArea());

        Square reg2 = new Square(5);
        //reg2.setWidth(width);
        //reg2.setHeight(height);
        reg2.setSide(side);
        System.out.println("====   Square  ====");
        //System.out.println("Width = " + width);
        //System.out.println("Height = " + height);
        System.out.println("Side = " + side);
        System.out.println("Area = " + reg2.getArea());
    }
}
