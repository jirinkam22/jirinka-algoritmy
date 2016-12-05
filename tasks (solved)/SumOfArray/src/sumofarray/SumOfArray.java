/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumofarray;

/**
 *
 * @author kokesjos
 */
public class SumOfArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] p = {7, 5, 3, 10, 11};
        
        int sum = 0;
        for(int i=0; i<5; i++){
            sum = sum + p[i];
        }
        System.out.printf("Sum of all items is %d\n", sum);
    }
    
}
