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
public class Square {

    public final int NUMBER_OF_SIDES = 4;
    private double sideA;
    private String color;
    
    public Square(double sideA, String color){
        this.sideA = sideA;
        this.color = color;
    }

    public double perimeter() {
        return 4 * sideA;
    }

    public double area() {
        return Math.pow(sideA, 2);
    }
        @Override
    public String toString() {
        return "Square: Area : " + area() + " Perimeter : " + perimeter() + " and the side: " + sideA;
    }
}
