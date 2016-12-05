/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package findprimes;

/**
 *
 * @author kokesjos
 */
public class FindPrimes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int upperLimit = 10;
        
        // generating n
        for(int n = 2; n < upperLimit; n++){
            boolean isPrime = true;
            
            // try to divide by i=2..n
            for(int i = 2; i < n; i++){
                if((n % i)== 0){
                    isPrime = false;
                    break;
                }
            }
            
            if(isPrime)
                System.out.println(n);
        }
    }
    
}
