/*
 * Typicky priklad, kdy nevime, kolikrat cyklus probehne
 */
package whileloop;

/**
 *
 * @author kokesjos
 */
public class WhileLoop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        double x = 1000;

        while(x>0.5){
            System.out.println(x);
            x = x/3;
        }

        System.out.println("Out="+x);
    }    
}




















