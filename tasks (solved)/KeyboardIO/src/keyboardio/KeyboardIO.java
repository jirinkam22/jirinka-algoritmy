package keyboardio;

import java.util.Scanner;

/**
 *
 * @author Virtual
 */
public class KeyboardIO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);    // create a "scanner"
        Scanner scl= new Scanner(System.in, "Windows-1250"); // code page

        String s;             // declare "s" to be a string

        do {
            System.out.println("Write something:");
            s = sc.nextLine();    // read line into string "s"
            System.out.println("You wrote \"" + s + "\" on the keyboard");
        } while (! s.equals("end"));
    }

}
