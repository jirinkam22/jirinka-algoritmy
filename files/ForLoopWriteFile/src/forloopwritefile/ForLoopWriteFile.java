/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forloopwritefile;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author kokesjos
 */
public class ForLoopWriteFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("b.txt");
        BufferedWriter buf = new BufferedWriter(fw);
        
        for(int i=0; i<10; i++) {
            buf.write("Hello " + i);
            buf.newLine();
        }
    
    buf.close();
    fw.close();
    }
    
}
