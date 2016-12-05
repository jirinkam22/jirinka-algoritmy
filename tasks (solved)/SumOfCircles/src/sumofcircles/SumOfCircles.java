/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumofcircles;

/**
 *
 * @author kokesjos
 */
public class SumOfCircles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // find PI
        double pi = 22.0 / 7;
        // radius
        int r1 = 1;
        int r2 = 2;
        int r3;
        r3 = 7;
        // first circle
        double area1 = pi * r1 * r1;
        double area2 = pi * r2 * r2;
        double area3 = pi * r3 * r3;
                // print out the result
        System.out.println(area1 + area2 + area3);
    }

}
