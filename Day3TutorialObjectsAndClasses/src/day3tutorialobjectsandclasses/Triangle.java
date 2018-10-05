/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day3tutorialobjectsandclasses;

/**
 *
 * @author Administrator
 */
public class Triangle extends Shape {

    public Triangle(double sideA, double sideB, double sideC) {
        super(sideA, sideB, sideC);
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Triangle) {
            Triangle c = (Triangle) o;

            return (lengthA == c.lengthA && lengthB == c.lengthB && lengthC == c.lengthC);
        }
        return false;
    }
    
    @Override
    public String toString() {
        return "Triangle: Area : " + area() + " Perimeter : " + perimeter() + " and the three sides : " + lengthA + ", " + lengthB + ", " + lengthC;
    }

    @Override
    public double area() {
               double s = perimeter() / 2;
        final double y = s * (s - lengthA) * (s - lengthB) * (s - lengthC);
        if (y < 0) {
            throw new IllegalArgumentException(" The dimensions specified are out of range for a triangle");
        }
        return Math.sqrt(y);
    }

    @Override
    public double perimeter() {
        return lengthA + lengthB + lengthC;
    }
}
