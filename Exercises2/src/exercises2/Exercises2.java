/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercises2;

import java.util.*;

public class Exercises2 {

    public static void main(String[] args) {
        //cylinderVolume();
        //costOfDriving();
        investment();
    }

    private static void cylinderVolume() {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Please enter the radius of the cylinder");
        double radius = myScanner.nextDouble();

        System.out.println("Please enter the length of the cylinder");
        double length = myScanner.nextDouble();

        double area = Math.pow(radius, 2) * Math.PI;
        System.out.println("The area is:: " + area);

        double volume = area * length;
        System.out.println("The volume is:: " + volume);

    }

    private static void costOfDriving() {
        Scanner myScanner = new Scanner(System.in);

        System.out.print("Please enter the driving distance: ");
        double distance = myScanner.nextDouble();

        System.out.print("Enter miles per gallon: ");
        double mpg = myScanner.nextDouble();

        System.out.print("Enter price per gallon: ");
        double ppg = myScanner.nextDouble();

        double totalcost;

        totalcost = (distance / mpg) * ppg;

        System.out.print("The cost of driving is $" + totalcost);
    }

    private static void investment() {
//        Scanner myScanner = new Scanner(System.in);
//        
//        System.out.print("Enter investment amount: ");
//        double investmentAmount = myScanner.nextDouble();
//        
//        System.out.print("Enter annual interest rate in percentage: ");
//        double yearlyInvestmentRate = myScanner.nextDouble();
//        
//        System.out.print("Enter number of years: ");
//        double numberOfYears = myScanner.nextDouble();
//        
//        double total;
//        
//        total = investmentAmount*Math.pow((1 + (yearlyInvestmentRate/12)), (numberOfYears*12));
//        
//        System.out.print("Accumulated value is $" + total);
//    }
//    private static void assignGrades() {
//        
        {
            Scanner input = new Scanner(System.in);

            // Prompt the user to enter the investment amount,
            // annual interest rate and number of years.
            System.out.print("Enter investment amount: ");
            double amount = input.nextDouble();
            System.out.print("Enter annual interest rate in percentage: ");
            double monthlyInterestRate = input.nextDouble();
            monthlyInterestRate /= 1200;
            System.out.print("Enter number of years: ");
            int years = input.nextInt();

            // Calculate future investment value
            double futureInvestmentValue
                    = amount * Math.pow(1 + monthlyInterestRate, years * 12);

            // Display result
            System.out.println("Accumulated value is $" + futureInvestmentValue);
        }
    }
}
