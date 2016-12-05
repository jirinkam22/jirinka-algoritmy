/*
 *  This Software is protected by copyright law and international treaties.
 *  This Software is licensed (not sold), and its use is subject
 *  to a valid WRITTEN AND SIGNED End User License Agreement (EULA).
 *  The unauthorized use, copying or distribution of this Software
 *  may result in severe criminal or civil penalties,
 *  and will be prosecuted to the maximum extent allowed by law.
 */
package calculatorfx;

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
public class CalculatorFXMLController implements Initializable {

    double reslt = 0;

    @FXML
    private Button button0;
    @FXML
    private Button button1;
    @FXML
    private Button button2;
    @FXML
    private Button button3;
    @FXML
    private Button button4;
    @FXML
    private Button button5;
    @FXML
    private Button button6;
    @FXML
    private Button button7;
    @FXML
    private Button button8;
    @FXML
    private Button button9;
    @FXML
    private Button buttonClear;
    @FXML
    private Button buttonPoint;
    @FXML
    private Button buttonPlus;
    @FXML
    private Button buttonMinus;
    @FXML
    private Button buttonResult;

    @FXML
    private TextField display;

    @FXML
    private void handleButton0Action(ActionEvent event) {
        display.setText(display.getText() + "0");
    }

    @FXML
    private void handleButton1Action(ActionEvent event) {
        display.setText(display.getText() + "1");
    }

    @FXML
    private void handleButton2Action(ActionEvent event) {
        display.setText(display.getText() + "2");
    }

    @FXML
    private void handleButton3Action(ActionEvent event) {
        display.setText(display.getText() + "3");
    }

    @FXML
    private void handleButton4Action(ActionEvent event) {
        display.setText(display.getText() + "4");
    }

    @FXML
    private void handleButton5Action(ActionEvent event) {
        display.setText(display.getText() + "5");
    }

    @FXML
    private void handleButton6Action(ActionEvent event) {
        display.setText(display.getText() + "6");
    }

    @FXML
    private void handleButton7Action(ActionEvent event) {
        display.setText(display.getText() + "7");
    }

    @FXML
    private void handleButton8Action(ActionEvent event) {
        display.setText(display.getText() + "8");
    }

    @FXML
    private void handleButton9Action(ActionEvent event) {
        display.setText(display.getText() + "9");
    }

    @FXML
    private void handleButtonPointAction(ActionEvent event) {
        display.setText(display.getText() + ".");
    }

    @FXML
    private void handleButtonClearAction(ActionEvent event) {
        display.setText("");
        reslt = 0;
    }
    
    @FXML
    private void handleButtonCharacterAction(ActionEvent event) {
        display.setText(display.getText() + event.getSource());
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
