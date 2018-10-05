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
public class Circle extends Shape{

    public Circle(double sideA) {
        super(sideA);
    }
    
    @Override
    public boolean equals(Object o) {
        if (o instanceof Circle) {
            Circle c = (Circle) o;

            return lengthA == c.lengthA;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Circle:  Area : " + area() + " Perimeter : " + perimeter() + " Radius : " + lengthA;
    }

    @Override
    public double area() {
       return Math.PI*Math.pow(lengthA, 2);
    }

    @Override
    public double perimeter() {
        return 2*Math.PI*lengthA;
    }

}
