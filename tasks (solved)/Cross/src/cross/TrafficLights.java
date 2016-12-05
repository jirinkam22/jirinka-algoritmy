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
public class TrafficLights {
    // constructor
    TrafficLights(String name){
        this.name = name;
    }
    
    private ColorLight redLight = new ColorLight("RED");
    private ColorLight yellowLight = new ColorLight("YELLOW");
    private ColorLight greenLight = new ColorLight("GREEN");
    
    private int state = 4;
    private final String name;
    
    public void nextState(){
        state = state + 1;
        if(state>3){
            state = 0;
        }
        
        System.out.println("Traffic light = " + name);
        
        if(state==0){
            redLight.setLightState(true);
            yellowLight.setLightState(false);
            greenLight.setLightState(false);
        }
        if(state==1){
            redLight.setLightState(true);
            yellowLight.setLightState(true);
            greenLight.setLightState(false);
        }
        if(state==2){
            redLight.setLightState(false);
            yellowLight.setLightState(false);
            greenLight.setLightState(true);
        }
        if(state==3){
            redLight.setLightState(false);
            yellowLight.setLightState(true);
            greenLight.setLightState(false);
        }
            
        System.out.println();
    }
}
