/*
 *  This Software is protected by copyright law and international treaties.
 *  This Software is licensed (not sold), and its use is subject
 *  to a valid WRITTEN AND SIGNED End User License Agreement (EULA).
 *  The unauthorized use, copying or distribution of this Software
 *  may result in severe criminal or civil penalties,
 *  and will be prosecuted to the maximum extent allowed by law.
 */
package calculatorfx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Kokes
 */
public class CalculatorFX extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("CalculatorFXMLDocument.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
