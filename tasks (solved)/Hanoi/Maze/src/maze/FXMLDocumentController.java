/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maze;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

/**
 *
 * @author Kokes
 */
public class FXMLDocumentController implements Initializable {
    
    private final int SEED = 50;    // magic number for count of rows/lines
    public  Panel panel;
    private Solver solver;
    
    @FXML private AnchorPane ap;
    @FXML private Button button;
    
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        solver.go();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // calculation of row/line size and count
        int count = 5 + 2*SEED;
        panel = new Panel(count, count);
        ap.getChildren().add(panel);
        solver = new Solver(panel);        
    }    
    
}
