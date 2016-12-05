package stringarray;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author kokesjos
 */
public class StringArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        FileReader fr = new FileReader("a.txt");
        BufferedReader br = new BufferedReader(fr);
        String[] s = new String[20];
        
        for (int i= 0; i<5; i++){
            s[i] = br.readLine();
        }
        
        for (int i=4; i>=0; i--) {
            System.out.println( s[i] );
        }
        
        System.out.println("***************************************");
        String aux;
        for (int j = 0; j<5; j++)
            for(int i=0; i<4; i++ ){
                if( s[i].compareTo(s[i+1])<0 ) {
                aux = s[i];
                s[i] = s[i+1];
                s[i+1] = aux;
                }
            }
        for (int i=4; i>=0; i--) {
            System.out.println( s[i] );
        }
        
                
    }    
}
