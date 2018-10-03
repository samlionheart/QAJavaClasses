/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day2tutorialstrings;

/**
 *
 * @author Administrator
 */
public class Day2TutorialStrings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String title = "Brexit uncertain";
        String author = "N. Farage -";

        int length = title.length();
        char firstChar = title.charAt(0);
        char lastChar = title.charAt(length - 1);
        String[] token = title.split(" ");
        
        StringBuilder sb = new StringBuilder(author);
        sb.append(title);
        System.out.println(sb);
    }

}
