import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ToggleButton;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

import java.net.URL;
import java.util.ResourceBundle;

public class CalculatorViewController implements Initializable {
    @FXML
    private BorderPane root;
    @FXML
    private VBox header;
    @FXML
    private ToggleButton toggleTheme;

    @FXML
    private Label lblText;

    @FXML private Button btnRemainder, btnOneDivX, btnC, btnBack, btnSquare, btnPower,
    btnLog, btnDivision, btnMultiply, btnSubtract, btnAdd, btnEqual, btnPoint, btnSign,
    btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;

    private char operator = ' '; // Save the operator
    private boolean go = true; // For calculate with Opt != (=)
    private boolean addWrite = true; // Connect numbers in display
    private double val = 0; // Save the value typed for calculation


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        lblText.setText("0");

        btnC.setOnAction(event-> {
            System.out.println("BTN C");

            lblText.setText("0");
            operator = ' ';
            val = 0;
        });

        btnBack.setOnAction(event -> {
            String str = lblText.getText();

            StringBuilder str2 = new StringBuilder();
            for(int i = 0; i < str.length() - 1; i++) {
                str2.append(str.charAt(i));
            }

            if(str2.toString().equals("")) {
                lblText.setText("0");
            } else {
                lblText.setText(str2.toString());
            }
        });

        btnRemainder.setOnAction();

    }

}
