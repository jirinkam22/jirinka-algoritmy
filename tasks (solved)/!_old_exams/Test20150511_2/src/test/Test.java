package test;

import java.util.Scanner;

/**
 *
 * @author kokesjos
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();

        Scanner sc = Scanner(System.in);
        while (sc.hasNextLine()) {
            String s = sc();
            ll.add(s);

            for (int i = 0; i < ll.size(); i++) {
                println("result=" + ll(i));
            }
            println();
        }

    }
}

        
