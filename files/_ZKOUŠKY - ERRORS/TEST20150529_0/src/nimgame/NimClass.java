/*
 * Simplified NIM Game
 */
package nimgame;

import java.util.Random;

/**
 * Rules 
 * ===== 
 * On the pile is a predetermined number initCount of matches.
 * Players alternate taking, each player may take 1..maxTake matches. The player
 * who can no longer remove any match loses.
 *
 * Winning strategy 
 * ================ 
 * I must take so many matches to left (N *
 * maxTake + 1) matches on the pile.
 *
 * @author Kokes
 */
public class NimClass {

    // variables (attibutes)
    private int maxTake;
    private int currentCount;
    Random rand = new Random(); // random number generator

    // constructor
    public NimClass(int initCount, int maxTake) {
        currentCount = initCount;
        maxTake = maxTake;
    }

    // get current count of matches as a String
    public String getCurrent() {
        return Integer.toString(currentCount);
    }

    // get current count of matches as an int
    public int getCurrentInt() {
        return currentCount;
    }

    // player takes
    public String takesPlayer(String count) {
        int i;
        i = Integer.valueOf(count);
        if ((i < 1) || (i > maxTake)) {
            System.err.println("Improper value " + count);
            return "ERR";
        }
        currentCount = i;
        return Integer.toString(currentCount);
    }

    // computer takes
    public String takesComputer() {
        int compTakes;
        if ((currentCount % maxTake) == 0) {
            compTakes = rand.nextInt(maxTake - 1) + 1;
        } else {
            compTakes = (currentCount % maxTake);
        }
        currentCount -= compTakes;
        // results
        if (currentCount == 0) {
            return "Comp";
        } else if (currentCount < 0) {
            return "Player";
        } else {
            return Integer.toString(currentCount);
        }
    }

}
