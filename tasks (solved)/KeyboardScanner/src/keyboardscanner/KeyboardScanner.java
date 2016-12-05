/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package keyboardscanner;

import java.util.Scanner;

/**
 *
 * @author kokesjos
 */
public class KeyboardScanner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number:");
        int k = sc.nextInt();
        int f = 1;
        for (int i = 1; i <= k; i++) {
            f = f * i;
        }
        System.out.println("The factorial of " + k + " is: " + f);
    }
}
