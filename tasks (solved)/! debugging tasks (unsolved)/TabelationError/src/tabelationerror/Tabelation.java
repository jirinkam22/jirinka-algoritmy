package tabelationerror;

/**
 * Given expression y = (122x^2 - 17x + 54) / (198x^3 - 456x^2 - 390x - 72)
 * Sum all values for x=0..10
 *
 * @author Kokes
 */
public class Tabelation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double sum = 0d;
        double y;
        
        for(double x = 0d; x <= 10d; x++){
            y = (122*x*x - 17*x + 54) / (198*x*x*x - 456*x*x -390*x - 72);
            sum += y;
System.out.println(x + ", " + sum);
        }
        
        System.out.println(sum);
    }
    
}


/*
1) operace s integer x dávají nulu
2) pro x rovno třem dělení nulou
3) přejmenování proměnné
*/