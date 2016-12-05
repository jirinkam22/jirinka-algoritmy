package maze;

import java.util.ArrayList;
import java.util.Random;
import javafx.scene.layout.Pane;
import static javafx.scene.paint.Color.BLACK;
import static javafx.scene.paint.Color.GRAY;
import static javafx.scene.paint.Color.WHITE;
import javafx.scene.shape.Rectangle;

/**
 *
 * @author Kokes
 */
public class Panel extends Pane {
    private final int size = 6;
    private final Random rand = new Random(); 
    
    public Rectangle[][] rect;
    private final ArrayList<Rectangle> al = new ArrayList<>();    
            
    public Panel(int countX, int countY){
        // create panel with borders
        rect = new Rectangle[countX][countY];
        for(int x=0; x<countX; x++) {
            for(int y=0; y<countY; y++) {
                Rectangle r = new Rectangle( x*size, y*size, size, size);
                r.setFill(WHITE);
                // set borders
                if((x==0) || (x==countX-1))
                    r.setFill(BLACK);
                else if((y==0) || (y==countY-1))
                    r.setFill(BLACK);
                // incorporate 
                rect[x][y] = r;
                getChildren().add(r);
            }            
        }
        // create gray squares
        for(int x=2; x<countX-1; x+=2) {
            for(int y=2; y<countY-1; y+=2) {
                Rectangle r = rect[x][y];
                r.setFill(GRAY);
                al.add(r);
            }
        }
        // create inner walls
        while(al.size()>0){
            // select random square
            int index = rand.nextInt(al.size());
            Rectangle r = al.get(index);
            int x = (int)r.getLayoutX()/size;
            int y = (int)r.getLayoutY()/size;
            // select random direction
            int dir = rand.nextInt(4);
            int deltaX, deltaY;
            if(dir==0){deltaX=-1; deltaY=0;}
            else if(dir==1){deltaX=1; deltaY=0;}
            else if(dir==2){deltaX=0; deltaY=-1;}
            else {deltaX=0; deltaY=1;}
            // loop until reached wall
            int i = 0;
            do{
                r = rect[x][y];
                if(r.getFill()==GRAY)
                    al.remove(r);
                r.setFill(BLACK);
                x += deltaX;
                y += deltaY;
                i++;
            } while(rect[x][y].getFill() != BLACK);
                
        }
    }
                
}
