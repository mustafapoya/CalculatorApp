import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import jfxtras.styles.jmetro.JMetro;
import jfxtras.styles.jmetro.Style;

import java.io.IOException;

public class CalculatorFX extends Application {
    static final private Style STARTING_STYLE = Style.LIGHT;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Style startingStyle = STARTING_STYLE;
        JMetro jMetro = new JMetro(startingStyle);

        primaryStage.setTitle("Calculator");

        try {
            BorderPane root = (BorderPane) FXMLLoader.load(getClass().getResource("CalculatorView.fxml"));

            Scene scene = new Scene(root);
            jMetro.setScene(scene);

            primaryStage.setScene(scene);
            primaryStage.setResizable(false);
        } catch(IOException ioException) {
            ioException.printStackTrace();
        }

        primaryStage.show();

    }
}
