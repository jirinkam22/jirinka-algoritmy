/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package testcar;

/**
 *
 * @author kokesjos
 */

public class Car {

    private int speed = 0;
    
    int showSpeed(){
        return speed;
    }

    int faster(int increment){
       speed = speed + increment;
       return speed;
    }
    
    int slower(int increment){
        speed = speed - increment;
        return speed;
    }
    
}
