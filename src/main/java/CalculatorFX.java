import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.IOException;

public class CalculatorFX extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Calculator");

        try {
            BorderPane root = (BorderPane) FXMLLoader.load(getClass().getResource("CalculatorView.fxml"));

            primaryStage.setScene(new Scene(root));
            primaryStage.setResizable(false);
        } catch(IOException ioException) {
            ioException.printStackTrace();
        }

        primaryStage.show();

    }
}
