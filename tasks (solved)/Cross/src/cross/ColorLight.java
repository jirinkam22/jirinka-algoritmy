package cross;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kokesjos
 */
public class ColorLight {
    // constructor
    public ColorLight(String initColor){
        lightIsOn = false;
        color = initColor;
    }
    
    private boolean lightIsOn;
    private final String color;
    
    public boolean getLightState(){
        return lightIsOn;
    }
    
    public void setLightState(boolean newState){
        lightIsOn = newState;
        if(lightIsOn){
            System.out.print(color + " is ON");
        } else {
            System.out.print(color + " is OFF");            
        }
    }
}
