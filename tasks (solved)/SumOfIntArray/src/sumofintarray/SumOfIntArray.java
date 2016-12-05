/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumofintarray;

/**
 *
 * @author kokesjos
 */
public class SumOfIntArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] a = new int[3];
        a[0] = 101;
        a[1] = 202;
        a[2] = 303;
        
        int sum = 0;
        
        for(int i = 0; i < 3; i++){
            sum = sum + a[i];
        }
        
        System.out.printf("Result is %d\n", sum);
    }
    
}
