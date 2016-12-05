package hanoi;

import javafx.scene.layout.AnchorPane;

/**
 *
 * @author Kokes
 */
public class Game {

    private final AnchorPane ap;
    private final int noDiscs;
    private final Disc[] discs;
    private final Axes ax;
    private int status = 0;
    
    private int axisWithSmall = 0;

    public Game(int noDiscs, AnchorPane ap) {
        // setup drawing container
        this.ap = ap;
        // create empty axes
        ax = new Axes();
        // create array of (graphic) discs
        this.noDiscs = noDiscs;
        discs = new Disc[noDiscs];
        for (int d = 0; d < noDiscs; d++) { // create discs
            discs[d] = new Disc(d);
            ap.getChildren().add(discs[d]); // connect disc to AnchorPane
            ax.add(0, d);                   // add disc to 0-th axis
            discs[d].showDiscAt(0, d);
        }
    }

    public void step(){
        if (status==0)
            step0();
        else
            step1();
        status = (status+1) % 2;
    }
    
    private void step0(){
        // move the smallest disc to next axis
        int n = noDiscs-1;
        ax.poll(axisWithSmall);
        axisWithSmall = (axisWithSmall + 1) % 3;
        int p = ax.add(axisWithSmall, n) - 1;
        discs[n].showDiscAt(axisWithSmall, p);
    }
    
    private void step1(){
        // find 2 axes with discs other then the smallest one in the top
        // and move legally (there is only one valid move)
        int a = (axisWithSmall + 1) % 3;    // axis
        int b = (axisWithSmall + 2) % 3;    // axis
        int da = ax.peek(a);    // disc
        int db = ax.peek(b);    // disc
        if(da<db){
            // cannot put da onto db, so must put db onto da
            ax.poll(b);         // take disc from b
            ax.add(a, db);      // put it on a
            int p = ax.size(a) - 1;
            discs[db].showDiscAt(a, p);
        } else {
            // must put da onto db
            ax.poll(a);         // take disc from a
            ax.add(b, da);      // put it on b
            int p = ax.size(b) - 1;
            discs[da].showDiscAt(b, p);
        }        
    }
    
}
