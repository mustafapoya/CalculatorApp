import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ToggleButton;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

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

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        toggleTheme.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                System.out.println("Changing Theme");
            }
        });
    }

}
