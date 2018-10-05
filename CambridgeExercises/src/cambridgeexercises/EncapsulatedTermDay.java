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
public class EncapsulatedTermDay {

//    public static int dayOfTheWeek(int day) {
//        if (day > 6 || day < 0) {
//            throw new IllegalArgumentException(" Invalid day of the week");
//        }
//        return day;
//    }
//    public static int weekOfTheTerm(int week) {
//        if (week > 7 || week < 0) {
//            throw new IllegalArgumentException(" Invalid week of the term");
//        }
//        return week;
//    }
    private byte day;
    private byte week;

    public byte setDay(byte day) {
        if (day <= 6 && day >= 0) {
            return this.day=day;
        }
        throw new IllegalArgumentException(" not day number");
    }
   public byte setWeek(byte week) {
        if (week <= 7 && week >= 0) {
                    return this.week=week;
        }

        throw new IllegalArgumentException(" not week number");
    }
}
