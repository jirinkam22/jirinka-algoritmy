/*
 * This Software is protected by copyright law and international treaties.
 * This Software is licensed (not sold), and its use is subject
 * to a valid WRITTEN AND SIGNED End User License Agreement (EULA).
 * The unauthorized use, copying or distribution of this Software
 * may result in severe criminal or civil penalties,
 * and will be prosecuted to the maximum extent allowed by law.
 */
package nimgame;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author Kokes
 */
public class FXMLDocumentController implements Initializable {
    
    // variables connected to FXML graphic
    @FXML
    private TextField tfCount;
    @FXML
    private TextField tfPlayer;
    
    // variables (attributes) internal in class FXMLDocumentController
    NimClass nim;   // instance of class NimClass
    
    // functions (methods)
    @FXML
    private void handleButtonAction(ActionEvent event) {
        nim.takesPlayer( tfPlayer.getText() );
        tfCount.setText( nim.takesComputer() );
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        nim = new NimClass(10, 3); // create instance
        tfCount.setText( nim.getCurrent() ); // display initial Count
    }    
    
}
