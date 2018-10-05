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
public class Square extends Shape {

    public Square(double sideA) {
        super(sideA);
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Square) {
            Square c = (Square) o;

            return lengthA == c.lengthA;
        }
        return false;
    }
    
    @Override
    public String toString() {
        return "Square: Area : " + area() + " Perimeter : " + perimeter() + " and the sides : " + lengthA;
    }

    @Override
    public double area() {
        return Math.pow(lengthA, 2);
    }

    @Override
    public double perimeter() {
        return 4 * lengthA;
    }
}
