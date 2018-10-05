/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selections;

import java.util.Scanner;

public class Selections {

    public static void main(String[] args) {
        rockPaperScissors();
        randomMonth();

    }
//  NOTE : Exercise Selections 3.17
    //  NOTE : Exercise Selections 3.4

    private static void randomMonth() {
        String[] months;
        months = new String[]{"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        //Random number from 0 to 11, to coincide with months array
        int randomMonth = (int) (Math.random() * 11);
        System.out.println(months[randomMonth]);
    }

    private static void rockPaperScissors() {
        Scanner sc = new Scanner(System.in);
        System.out.print("scissor (0), rock (1), paper (2): ");
        int rps = sc.nextInt();
        //Generating random number from 0 to 2
        int compRps = (int) (Math.random() * 3);
        String[] myRpsArray;
        myRpsArray = new String[]{"scissor", "rock", "paper"};

        if (rps == compRps) {
            System.out.println("The computer is " + myRpsArray[compRps] + ". You are " + myRpsArray[rps] + ". It is a draw");
        } else if (rps == 1 && compRps == 2 || rps == 2 && compRps == 0 || rps == 0 && compRps == 1) {
            System.out.println("The computer is " + myRpsArray[compRps] + ". You are " + myRpsArray[rps] + ". You lose");
        } else {
            System.out.println("The computer is " + myRpsArray[compRps] + ". You are " + myRpsArray[rps] + ". You won");
        }
    }
}
