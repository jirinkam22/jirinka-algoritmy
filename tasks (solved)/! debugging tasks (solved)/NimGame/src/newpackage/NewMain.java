/*
 * This Software is protected by copyright law and international treaties.
 * This Software is licensed (not sold), and its use is subject
 * to a valid WRITTEN AND SIGNED End User License Agreement (EULA).
 * The unauthorized use, copying or distribution of this Software
 * may result in severe criminal or civil penalties,
 * and will be prosecuted to the maximum extent allowed by law.
 */
package newpackage;

import java.io.IOException;
import java.util.Scanner;
import nimgame.NimClass;

/**
 *
 * @author Kokes
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        NimClass nim = new NimClass(10, 3);
        Scanner sc = new Scanner(System.in);
        int inp;

        while (true) {
            System.out.println("Count = " + nim.getCurrent());
            System.out.print("User takes: ");
            inp = sc.nextInt();
            if ((inp < 1) || (inp > 3)) {
                break;
            }
            System.out.println();

            nim.takesPlayer(Integer.toString(inp));
            System.out.println(nim.takesComputer());
        }
    }
}
