/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package printf;

/**
 *
 * @author kokesjos
 */
public class PrintF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(10 + " and " + 20 + " is " + 30);
        System.out.printf("%10.2f and %06d is 0x%X %s\n",
                10.0, 20, 30, ", thanks!");
    }
}
