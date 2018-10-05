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
public class Vehicle {

    //fields
    private double speed;
    private boolean isMoving;
    private static int count;

    //methods
    public Vehicle() {
        count++;
    }

    public static int getInstanceCount() {
        return count;
    }

    public void stop() {
    }

    public void accelerate() {
        speed += 1;
    }

    public void move() {
    }

    public void startEngine() {
    }
}
