/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package area;

import static java.lang.Math.PI;

/**
 *
 * @author kokesjos
 */
public class Area {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double radius = 4.0;
        double area;
                
        area = PI * radius * radius;
        System.out.printf("\tArea of circle is %f\n", area);
        System.out.printf("\tArea of circle is %5.2f\n", area);
    }
    
}
