package day2tutorialstring;

import java.util.*;

public class Day2TutorialString {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        double age = myScanner.nextDouble();

        System.out.print("Enter you gender: ");
        String gender = myScanner.next();

        System.out.print("Enter vehicle cc: ");
        double vehicleCC = myScanner.nextDouble();

        double policy;

        double genderDouble;
        double ageDouble;
        double vehicleCCDouble;

        //gender
        if ((gender == "m") || (gender == "male")) {
            genderDouble = 1.2;
        } else {
            genderDouble = 1.0;
        }

        //age
        if (age >= 25 && age <= 60) {
            ageDouble = 1.1;
        } else {
            ageDouble = 1.25;
        }

        //vehicleCC
        if (vehicleCC > 1000 && vehicleCC <= 1500) {
            vehicleCCDouble = 1.0;
        } else if (vehicleCC > 1500 && vehicleCC <= 3000) {

            vehicleCCDouble = 1.25;
        } else if (vehicleCC > 3000 && vehicleCC <= 3500) {

            vehicleCCDouble = 1.5;
        }
        policy = (genderDouble*ageDouble*vehicleCCDouble)*4;
        System.out.println("Your policy is $" + (policy));
    }

}
