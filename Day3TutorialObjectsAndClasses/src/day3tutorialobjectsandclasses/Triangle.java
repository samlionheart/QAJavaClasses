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
public class Triangle {

    public final int NUMBER_OF_SIDES = 3;
    private double sideA;
    private double sideB;
    private double sideC;
//    private double angleA;
//    private double angleB;
//    private double angleC;

    public Triangle(double sideA, double sideB, double sideC)// double angleA, double angleB, double angleC) {
    {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
//        this.angleA = angleA;
//        this.angleB = angleB;
//        this.angleC = angleC;
    }

    public double perimeter() {
        return sideA + sideB + sideC;
    }

    public double area() {
        double s = perimeter() / 2;
        final double y = s * (s - sideA) * (s - sideB) * (s - sideC);
        if (y < 0) {
            throw new IllegalArgumentException(" The dimensions specified are out of range for a triangle");
        }
        return Math.sqrt(y);
    }

    @Override
    public String toString() {
        return "Triangle: Area : " + area() + " Perimeter : " + perimeter() + " and the three sides: " + sideA + ", " + sideB + "," + sideC;
    }
}
