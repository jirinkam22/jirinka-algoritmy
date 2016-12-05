/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trycatch;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author kokesjos
 */
public class TryCatch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FileReader fr = null;
        try {
            fr = new FileReader("demo.txt");
            Scanner sc = new Scanner(fr);
            while (sc.hasNextInt()){
                int i = sc.nextInt();
                System.out.println("number="+i);
            }
        } catch (FileNotFoundException ex) {
            System.err.println("Cannot find file demo.txt");
        } finally {
            try {
                fr.close();
            } catch (IOException ex) {
                Logger.getLogger(TryCatch.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
