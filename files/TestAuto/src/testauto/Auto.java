/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package testauto;

/**
 *
 * @author kokesjos
 */

public class Auto {

    private int rychlost = 0;
    
    int ukazTachometr(){
        return rychlost;
    }

    int zrychli(int oKolik){
       rychlost = rychlost + oKolik;
       return rychlost;
    }
    
    int zpomal(int oKolik){
        rychlost = rychlost - oKolik;
        return rychlost;
    }
    
}
