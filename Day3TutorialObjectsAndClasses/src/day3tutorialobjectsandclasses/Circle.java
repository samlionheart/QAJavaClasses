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
public class Circle {
    //fields

    private double radius;
    //constants
    public final int NUMBER_OF_SIDES = 0;

    //constructors
    public Circle(double radius) {
        this.radius = radius;

    }

    //setter
    public void setRadius(double radius) {
        this.radius = radius;
    }

    //methods
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    public double area() {
        return Math.pow(Math.PI * radius, 2);
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Circle) {
        Circle c = (Circle) o;

        return radius == c.radius;
    }
        return false;
    }

    @Override
    public String toString() {
        return "Circle:  Area : " + area() + " Perimeter : " + perimeter() + " radius " + radius;
    }

}
