/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cambridgeexercises;

/**
 *
 * @author Administrator
 */
public class CambridgeExercises {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        int d = EncapsulatedTermDay.dayOfTheWeek(6);
//        int w = EncapsulatedTermDay.weekOfTheTerm(7);
  
            ImmutableTermDay immutable = new ImmutableTermDay(6,6);
            System.out.println(immutable);
    }
}
