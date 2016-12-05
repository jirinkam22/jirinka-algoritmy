package hanoi;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

/**
 *
 * @author Kokes
 */
public class Disc extends Rectangle {

    // global variables
    private final int halfWidth;        // width in pixels
    private final int size;             // size of disc: 0..9 (0 is max, 9 is min)
    private final int height = 30;      // default height of disc
    private final Color[] colors = {Color.MIDNIGHTBLUE, Color.ROYALBLUE, Color.DARKTURQUOISE,
        Color.LIGHTSEAGREEN, Color.LIME, Color.GOLD, Color.ORANGERED, Color.RED,
        Color.MAGENTA, Color.BLUEVIOLET};

    /**
     * constructor
     * initial position of disc is on axis 0, position 0..9
     * 
     * @param size Size of disc: 0..9 (0 is max, 9 is min)
     */
    public Disc(int size) {
        setFill(colors[size]);
        setHeight(height);
        this.size = size;
        halfWidth = (10-size) * 10;
        setWidth(2 * halfWidth);
    }

    /**
     * Show disk on given axis and position
     * 
     * @param d number of disc (0 = biggest one)
     */
    public void showDiscAt(int axis, int position) {        
        int x = 200 + 200*axis - halfWidth + 5;
        setLayoutX(x);
        int y = 400 - 30*position - height;
        setLayoutY(y);
    }
}
