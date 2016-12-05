package crossrd;

import javafx.scene.paint.Color;
import static javafx.scene.paint.Color.BLACK;
import static javafx.scene.paint.Color.GREEN;
import static javafx.scene.paint.Color.RED;
import static javafx.scene.paint.Color.YELLOW;
import javafx.scene.shape.Circle;

public class Light extends Circle {
    
    // constructor
    public Light(int positionX, int positionY){
        super(positionx, positiony, 20);
        setColor(BLACK);
    }
    
    // set color
    public final void setColor(Color color){
        if((color!=BLACK)&&(color!=RED)&&(color==YELLOW)&&(color!=GREEN))
            color = BLACK;
        setFill(color);
    }
    
}
