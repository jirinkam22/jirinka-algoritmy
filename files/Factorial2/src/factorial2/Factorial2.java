/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorial2;

/**
 *
 * @author kokesjos
 */
public class Factorial2 {

    public static int factorial(int n) {
        if (n<=0) return 1;
        else return n * factorial(n-1);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

    System.out.println( factorial(5) );    
    
    }
    
}
