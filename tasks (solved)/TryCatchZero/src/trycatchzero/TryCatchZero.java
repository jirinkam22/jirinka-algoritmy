/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trycatchzero;

import java.util.Scanner;

/**
 *
 * @author kokesjos
 */
public class TryCatchZero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            while (sc.hasNext()) {
                int i = sc.nextInt();
                double x = 1d / (i - 6);
                System.out.println("result=" + x);
            }
        } catch (Exception e) {
            System.err.println("My error");
        }
            
    }
    
}
