/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorial1;

/**
 *
 * @author kokesjos
 */
public class Factorial1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n = 5;
        long fact = 1;
        
        for(int i = 1; i<= n; i++) {
            fact = fact * i;
        }
                
        System.out.println("Factorial of " + n + " is " + fact);
    }
    
}
