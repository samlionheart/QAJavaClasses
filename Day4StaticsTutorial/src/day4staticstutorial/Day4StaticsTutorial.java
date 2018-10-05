/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day4staticstutorial;

/**
 *
 * @author Administrator
 */
public class Day4StaticsTutorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Vehicle benz = new Vehicle();
//        Vehicle toyota = new Vehicle();
//        Vehicle landrover = new Vehicle();
//        
//        toyota.startEngine();
//        
//        System.out.println(" Number of vehicles created: " + Vehicle.getInstanceCount());
            printTable();
    }
    private static void printTable(){
        String[] column1 = {"1","3","5"};
        String[] column2 = {"2","4","6"};
        System.out.println("Heading 1 \t Heading 2");
        int j = 0;
        for(int i = 0; i<column1.length; i++){
            System.out.print(column1[i] + "\t\t ");
            System.out.println(column2[j]);
            j++;
        }
        
    }
}
