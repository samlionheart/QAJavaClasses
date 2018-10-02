/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lionheart.conditionals;

import java.util.*;

/**
 *
 * @author Administrator
 */
public class Day2TutorialConditionals {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Scanner myScanner = new Scanner(System.in);
        //System.out.println("Enter day of the week number: ");
        //int dayNumber = myScanner.nextInt();
        //displayWeekDay(dayNumber);
        displayWeekDay(true, 6);
    }

    private static void displayWeekDay(boolean useSwitch,int day) {
        switch (day) {
            case 1:
                System.out.println("Monday");break;
            case 2:
                System.out.println("tue");break;
            case 3:
                System.out.println("wed");break;
            case 4:
                System.out.println("thurs");break;
            case 5:
                System.out.println("fri");break;
            case 6:
                System.out.println("sat");break;
            case 7:
                System.out.println("sun");break;
            default:
                System.out.println("The day is unknown");
        }
    }

    private static int displayWeekDay(int dayNumb) {

        String[] daysOfTheWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        if (dayNumb <= 7 && dayNumb >= 1) {
            if (dayNumb <= 5 && dayNumb >= 0) {
                System.out.println("This is a weekday");
            } else {
                System.out.print("This day is a weekend");
            }
            System.out.println(" and is " + daysOfTheWeek[dayNumb - 1]);
        } else {
            System.out.println("You have not entered a day number");
        }
        return 0;
    }
}
