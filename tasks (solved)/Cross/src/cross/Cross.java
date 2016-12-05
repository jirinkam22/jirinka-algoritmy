/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cross;

/**
 *
 * @author kokesjos
 */
public class Cross {
        static TrafficLights westEast = new TrafficLights("West-East");
        static TrafficLights northSouth = new TrafficLights("North-South");
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        for(int i = 0; i < 20; i++){
            westEast.nextState();
            northSouth.nextState();
        }
    }
    
}
