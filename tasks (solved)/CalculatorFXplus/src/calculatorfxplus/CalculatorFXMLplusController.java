/*
 *  This Software is protected by copyright law and international treaties.
 *  This Software is licensed (not sold), and its use is subject
 *  to a valid WRITTEN AND SIGNED End User License Agreement (EULA).
 *  The unauthorized use, copying or distribution of this Software
 *  may result in severe criminal or civil penalties,
 *  and will be prosecuted to the maximum extent allowed by law.
 */
package calculatorfxplus;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 *
 * @author Kokes
 */
public class CalculatorFXMLplusController implements Initializable {

    double reslt = 0;

    @FXML
    private Button buttonClear;
    @FXML
    private Button buttonPlus;
    @FXML
    private Button buttonMinus;
    @FXML
    private Button buttonResult;

    @FXML
    private TextField display;

    @FXML
    private void handleButtonCharAction(ActionEvent event) {
        System.out.println(  ((Button)event.getSource()).getText()  );
        display.setText( display.getText() + ((Button)event.getSource()).getText() );
    }

    @FXML
    private void handleButtonClearAction(ActionEvent event) {
        display.setText("");
        reslt = 0;
    }
        
    @FXML
    private void handleButtonPlusAction(ActionEvent event) {
        try {
            double x = Double.parseDouble(display.getText());
            reslt += x;
            display.setText("");
        } catch (Exception ex) {
            display.setText("ERROR");
        }
    }

    @FXML
    private void handleButtonMinusAction(ActionEvent event) {
        try {
            double x = Double.parseDouble(display.getText());
            reslt -= x;
            display.setText("");
        } catch (Exception ex) {
            display.setText("ERROR");
        }
    }

    @FXML
    private void handleButtonResultAction(ActionEvent event) {
        display.setText(Double.toString(reslt));
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
