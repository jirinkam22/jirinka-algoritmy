/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package readingtextfile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author kokesjos
 */
public class ReadingTextFile {

    /**
     * @param args the command line arguments
     */
public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("Hamlet.txt");
        BufferedReader reader = new BufferedReader(fr);
        String line = null;
        while ((line = reader.readLine()) != null) {
            //process each line in some way
            if( line.contains("Horatio") )
               System.out.println(line);
        }

    }    
}
