/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package testcar;

/**
 *
 * @author kokesjos
 */
public class TestCar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Car a1 = new Car();
        
        System.out.println(  a1.showSpeed() );
        a1.faster(30);
        System.out.println(  a1.showSpeed() );
        a1.slower(10);
        System.out.println(  a1.showSpeed() );
        
        Car a2 = new Car();
        System.out.println(  a2.showSpeed() );
        a2.faster(60);
        System.out.println(  a2.showSpeed() );
        a2.slower(15);
        System.out.println(  a2.showSpeed() );
        
        System.out.println(  a1.showSpeed() );
        System.out.println(  a2.showSpeed() );
        
        }
    }
