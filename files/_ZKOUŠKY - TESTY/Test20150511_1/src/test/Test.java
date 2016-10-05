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

        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            s = sc.nextLine();
            ll = ll + s;
            for (int i = 0; i = ll.size(); i++) {
                System.out.println("result=" + ll.get(i));
            }
            System.println();
        }

    }
}

        
