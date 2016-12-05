package crossrd;

import javafx.scene.layout.Pane;
import static javafx.scene.paint.Color.BLACK;
import static javafx.scene.paint.Color.GRAY;
import static javafx.scene.paint.Color.GREEN;
import static javafx.scene.paint.Color.RED;
import static javafx.scene.paint.Color.YELLOW;
import javafx.scene.shape.Rectangle;

public class Semaphore extends Light {

    private final Rectangle shape;
    private final Light upper;
    private final Light middle;
    private final Light lower;

    public Semaphore(int positX, int positY) {
        super();
        setHeight(200);
        setWidth(100);        
        setPosition(positX, positY);
        shape = new Rectangle(0, 0, 60, 150);
        shape.setArcHeight(20);
        shape.setArcWidth(20);
        shape.setFill(GRAY);
        getChildren().add(shape);
        upper = new Light(30, 30);
        getChildren().add(upper);
        middle = new Light(30, 75);
        getChildren().add(middle);
        lower = new Light(30, 120);
        getChildren().add(lower);
        setOff();
    }
    
    public final void setPosition(int positX, int positY){
        setLayoutX(positX);
        setLayoutY(positY);
    }
    
    public final void setOff(){
        upper.setColor(BLACK);
        middle.setColor(BLACK);
        lower.setColor(BLACK);        
    }
    
    public void setStop(){
        setOff();
        upper.setColor(RED);
    }
    
    public void setReady(){
        upper.setColor(RED);
        middle.setColor(YELLOW);
        lower.setColor(BLACK);
    }
    
    public void setGo(){
        setOff();
        lower.setColor(GREEN);
    }
    
    public void setWarning(){
        setOff();
        middle.setColor(YELLOW);
    }

}
