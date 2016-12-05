package simplefunction;

/**
 *
 * @author kokesjos
 */
public class SimpleFunction {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println( adding(36,24) );
        System.out.println("Result is " + adding(36, 24) + " correct");
    }
    
    // this is our simple function with 2 integer parameters
    static int adding(int a, int b){
        return a+b;
    }
    
}
