package day3tutorialobjectsandclasses;

import java.math.BigDecimal;
import java.math.MathContext;

public class Day3TutorialObjectsAndClasses {

    public static void main(String[] args) {
        Circle myCircle = new Circle(6);

        Square mySquare = new Square(6);

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
        Circle[] myCircles = new Circle[5];
        Square[] mySquares = new Square[5];
        Triangle[] myTriangles = new Triangle[5];

        Shape[] myShapes = new Shape[5];
        myShapes[0] = new Circle(10);
        myShapes[1] = new Triangle(5, 6, 5);
        myShapes[2] = new Square(10);
        myShapes[3] = new Circle(10);
        myShapes[4] = new Circle(10);
        
        for (Shape shape: myShapes){
            System.out.println(shape);
        }
        

    }

}
