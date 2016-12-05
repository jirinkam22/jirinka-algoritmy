package ctenitextsouboru;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Cteni z textoveho souboru
 * @author kokesjos
 */
public class CteniTextSouboru {

    /**
     * @param args the command line arguments
     */
public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("Hamlet.txt");
        BufferedReader reader = new BufferedReader(fr);
        String line = null;
        while ((line = reader.readLine()) != null) {
            //process each line in some way
            if( line.contains("Commission") )
               System.out.println(line);
        }

    }
}
