package day3tutorialobjectsandclasses;

import java.math.BigDecimal;
import java.math.MathContext;

public class Day3TutorialObjectsAndClasses {

    public static void main(String[] args) {
        Circle myCircle = new Circle(6);
        myCircle.setRadius(7);

        Square mySquare = new Square(6, "red");

        Triangle myTriangle = new Triangle(5, 6, 6);
        try {
            double k = myTriangle.area();
            System.out.println("The area of your triangle : " + myTriangle.area());
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }

        System.out.println(myCircle);
        System.out.println(mySquare);
        System.out.println(myTriangle);
        
        BigDecimal bd = new BigDecimal(myCircle.area());
        System.out.println("Area of the circle is " + bd.round(MathContext.DECIMAL32));
        
        Circle myBigCircle = new Circle(10);
        Circle mySmallCircle = new Circle(10);
        
        Boolean checkIfEqual = myBigCircle.equals(mySquare);
        System.out.println(checkIfEqual);
    }

}
