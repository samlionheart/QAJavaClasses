/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.gov.beis.app;

import uk.gov.beis.components.Util;

public class CommonPitfalls {
    {
        System.out.println("hi!!!!!!!!!!!!!!!!!!!!!!!!");
    }
    
    public static void main(String[] args) {
        Util.add(12, 3);
        Util.add("Hel", "lo");
        getChange(2000);
        forLoopErrors();

    }

    private static void forLoopErrors() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            System.out.println("Hello World");
        }
        

    }

    private static void getChange(double cash) {
        double sandwich = 529;
        double drink = 488;
        double newspaper = 167;
        double transport = 455;

        //BigDecimal.valueOf(sandwich)
        double change = cash - sandwich - drink - newspaper - transport;
        System.out.println(change);
    }
}
