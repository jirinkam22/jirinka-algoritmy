/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package testauto;

/**
 *
 * @author kokesjos
 */
public class TestAuto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Auto a1 = new Auto();
        
        System.out.println(  a1.ukazTachometr() );
        a1.zrychli(30);
        System.out.println(  a1.ukazTachometr() );
        a1.zpomal(10);
        System.out.println(  a1.ukazTachometr() );
        
        Auto a2 = new Auto();
        System.out.println(  a2.ukazTachometr() );
        a2.zrychli(60);
        System.out.println(  a2.ukazTachometr() );
        a2.zpomal(15);
        System.out.println(  a2.ukazTachometr() );
        
        System.out.println(  a1.ukazTachometr() );
        System.out.println(  a2.ukazTachometr() );
        
        }
    }
