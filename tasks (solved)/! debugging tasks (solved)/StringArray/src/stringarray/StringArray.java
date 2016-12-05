import java.io.BufferedReader;
import java.io.FileReader;

/**
 *
 * @author kokesjos
 */
public class StringArray {

    /**
     * @param args the command line arguments                                       test
     */
    public static void main(String[] args) throws Exception {
        FileReader fr = FileReader(fr);
        BufferedReader br = BufferedReader(fr);
        String[] s = new String[];
        
        for (int i= 0; i<5; i++){
            s[i] = readLine(br);
        }
        
        for (int i=4; i>=0; i--) {
            System.out.println( s[i] );
        }
        
        System.out.println("***************************************");
        String aux;
        for (int j = 0; j<5; j++)
            for(int i=0; i<4; i++ ){
                if( s[i].compareTo(s[i+1])<0 ) {
                s[i] = s[i+1];
                s[i+1] = s[i];
                }
            }
        for (int i=4; i>=0; i--) {
            System.out.println( s[i] );
        }
        
                
    }    
}
