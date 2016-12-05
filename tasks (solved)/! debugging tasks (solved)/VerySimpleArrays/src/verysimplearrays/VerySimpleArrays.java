/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package verysimplearrays;

import java.util.Scanner;

/**
 *
 * @author kokesjos
 */
public class VerySimpleArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);    // create a "scanner"
// alternatively: Scanner scl= new Scanner(System.in, "Windows-1250"); // code page
        String s;                        // declare "s" to be a string
        String[] lines = new String[5]; // array af strings (to store your lines)    
        
        for(int i=0; i<5; i++){
            System.out.println("Write something:");
            s = sc.nextLine();    // read line into string "s"
            System.out.println("You wrote " + s + " on the keyboard");
            
            // write your line into array "lines"
            lines[i] = s;
        }
        
        System.out.println("***********************************");
        for(int i=4; i>0; i--)
            System.out.println( lines[i] );
    }
}
