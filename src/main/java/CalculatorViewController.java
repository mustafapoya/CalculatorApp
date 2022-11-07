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

    @FXML private Button btnRemainder, btnDivX, btnC, btnBack, btnSquare, btnPower,
    btnLog, btnDivision, btnMultiply, btnMinus, btnPlus, btnEqual, btnPoint, btnSign,
    btnOne, btnTwo, btnThree, btnFour, btnFive, btnSix, btnSeven, btnEight, btnNine;



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
