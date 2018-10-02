/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

/**
 *
 * @author Administrator
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double[] values = {10, 10, 10, 10};
        double u = sum(values);
        System.out.println(u);
        double z = average(values);
        System.out.println(z);
        
    }

    private static double sum(double[] values) {
        double total = 0;
        for(int i = 0; i < values.length; i++){
            total = total + values[i];
        }
        return total;
    }
    private static double average(double[] values){
        return sum(values) / values.length;
    }
}
