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
public final class ImmutableTermDay {

    private int day;
    private int week;
    
    public ImmutableTermDay(int day, int week){
        setDay(day);
        setWeek(week);
    }

    private int setDay(int day) {
        if (day <= 6 && day >= 0) {
            return this.day = day;
        } else {
            throw new IllegalArgumentException(" not day number");
        }
    }

    private int setWeek(int week) {
        if (week <= 7 && week >= 0) {
            return this.week = week;
        } else {
            throw new IllegalArgumentException(" not week number");
        }
    }

}
