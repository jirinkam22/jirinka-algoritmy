/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animals;

/**
 *
 * @author kokesjos
 */
public class Animals {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Animal x = new Animal();
        x.say();
        
        x = new Cat();
        x.say();
    }
    
}
