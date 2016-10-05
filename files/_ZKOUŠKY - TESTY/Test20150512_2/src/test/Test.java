package test;

import java.io.BufferedWriter;
import java.io.IOException;

/**
 *
 * @author kokesjos
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BufferedWriter buf = new BufferedWriter(fw);
        
        for(int i=0; i<10; i++) {
            buf.read("Hello " + i);
            buf.nextLine();
        }
    
    buf.close();
    fw.close();
    }
    
}
