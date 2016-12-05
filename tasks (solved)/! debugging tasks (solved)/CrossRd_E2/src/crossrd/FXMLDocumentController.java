/*
 * This Software is protected by copyright law and international treaties.
 * This Software is licensed (not sold), and its use is subject
 * to a valid WRITTEN AND SIGNED End User License Agreement (EULA).
 * The unauthorized use, copying or distribution of this Software
 * may result in severe criminal or civil penalties,
 * and will be prosecuted to the maximum extent allowed by law.
 */
package crossrd;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;

/**
 *
 * @author Kokes
 */
public class FXMLDocumentController implements Initializable {
    
    CrossRoad cr = new CrossRoad();

    @FXML
    private void handleButtonAction(ActionEvent event) {
        cr.switchState();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ap.getChildren().add(cr);
    }    
    
}
