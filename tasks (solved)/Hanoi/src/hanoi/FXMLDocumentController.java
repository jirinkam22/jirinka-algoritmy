package hanoi;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;

/**
 * Hanoi towers - deep search first
 *
 * @author Kokes
 */
public class FXMLDocumentController implements Initializable {

    private final int NO_DISCS = 10;
    private Game game;
    
    @FXML
    private AnchorPane ap;

    @FXML
    private void handleButtonAction(ActionEvent event) {
        game.step();
    }

  @Override
    public void initialize(URL url, ResourceBundle rb) {
        // initializa whole game
        game = new Game(NO_DISCS, ap);
    }
}
