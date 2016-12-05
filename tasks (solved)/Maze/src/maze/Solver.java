package maze;

import java.util.LinkedList;
import static javafx.scene.paint.Color.GREEN;
import static javafx.scene.paint.Color.RED;
import static javafx.scene.paint.Color.WHITE;
import static javafx.scene.paint.Color.YELLOW;
import javafx.scene.shape.Rectangle;

/**
 *
 * @author Kokes
 */
public class Solver {
    private final int sizeX;
    private final int sizeY;
    private final int startX;
    private final int startY;
    private final int endX;
    private final int endY;
    private final Rectangle[][] rect;
    private final LinkedList<Integer> list = new LinkedList<>();
    private int trace = -1;
    
    public Solver(Panel panel){
        this.rect = panel.rect;
        sizeX = rect.length;
        sizeY = rect.length;
        // starting position
        startX = 1;
        startY = 1;
        rect[startX][startY].setFill(RED);
        // ending position
        endX = sizeX - 2;
        endY = sizeY - 2;
        rect[endX][endY].setFill(GREEN);
        // clear all id's
        for(int x=0; x<sizeX; x++)
            for(int y=0; y<sizeY; y++){
        rect[x][y].setId(Integer.toString(trace));
        }
        // prepare starting position
        trace = 0;
        rect[1][1].setId(Integer.toString(trace));
        list.add(256*1 + 1);
    }
    
    public void go(){
        int x;
        int y;
        // forward
        while(list.size()>0){
            // pop next rectangle
            int xy = list.poll();
            trace++;
            x = xy / 256;
            y = xy % 256;            
            // finished?
            if((x==endX) && (y==endY)){
                System.out.println("hotovo");
                return;
            }
            forward(x-1, y);
            forward(x+1, y);
            forward(x, y-1);
            forward(x, y+1);
        }
        // prepare backtracing
        list.clear();
        x = endX;
        y = endY;
        list.add(256*x + y);
        // backtracking loop
        while(list.size()>0){
            int xy = list.poll();
            x = xy / 256;
            y = xy % 256;            
            if( backward(x-1, y) ) continue;
            if( backward(x+1, y) ) continue;
            if( backward(x, y-1) ) continue;
            if( backward(x, y+1) ) continue;
        }
    }
    
    private void forward(int x, int y){
            if((x==endX) && (y==endY)){
                System.out.println("hotovo");
                list.clear();
                return;
            }
        if(rect[x][y].getFill() != WHITE)
            return;
        rect[x][y].setFill(YELLOW); // set color
        rect[x][y].setId(Integer.toString(trace));
        list.add(256*x + y);        // schedule for processing
    }            
    
    private boolean backward(int x, int y) {
        int t = Integer.valueOf( rect[x][y].getId() );
        if(t<0) return false;
        if(t>trace) return false;
        rect[x][y].setFill(RED);
        list.add(256*x + y);
        trace = t;
        return true;
    }
}
