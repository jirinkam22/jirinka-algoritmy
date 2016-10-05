package polymorphism;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 *
 * @author Kokes
 */
public class PolymorphismController implements Initializable {
    
    Woman w;        // class Women !!

    @FXML
    private Label labelSays;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TO DO
    }    
    
    @FXML
    private void handleButtonActionWoman(ActionEvent event) {
        w = new Woman();
        String greeting = w.say();        
        labelSays.setText( greeting );
        System.out.println(greeting);
    }
    
    
    
    
    @FXML
    private void handleButtonActionGirlfriend(ActionEvent event) {
        w = new Girlfriend();
        String greeting = w.say();        
        labelSays.setText( greeting );
        System.out.println(greeting);
    }
    
    @FXML
    private void handleButtonActionWife(ActionEvent event) {
        w = new Wife();
        String greeting = w.say();        
        labelSays.setText( greeting );
        System.out.println(greeting);
    }
    
    @FXML
    private void handleButtonActionMiL(ActionEvent event) {
        w = new MotherInLaw();
        String greeting = w.say();        
        labelSays.setText( greeting );
        System.out.println(greeting);
    }
    
}
