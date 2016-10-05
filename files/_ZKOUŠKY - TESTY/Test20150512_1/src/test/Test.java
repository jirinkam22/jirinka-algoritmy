package test;

/**
 *
 * @author kokesjos
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FileWriter fw = FileWriter("b.txt");
        BufferedWriter buf = BufferedWriter(buf);
        
        for(int i=0; i<10; i++) {
            buf.print("Hello " + i);
            buf.println(i);
        }
    
    close(buf);
    close(fw);
    
    
    }
    
}
