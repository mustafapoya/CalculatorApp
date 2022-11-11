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

import javax.swing.*;
import java.io.IOException;

public class CalculatorFX extends Application {
    static final private Style STARTING_STYLE = Style.DARK;

    public static void main(String[] args) {
        launch(args);
    }

    JMetro jMetro;

    @Override
    public void start(Stage primaryStage) {
        Style startingStyle = STARTING_STYLE;
        jMetro = new JMetro(startingStyle);

        primaryStage.setTitle("Calculator");

        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("CalculatorView.fxml"));
            BorderPane root = (BorderPane) fxmlLoader.load();
            CalculatorViewController controller = (CalculatorViewController) fxmlLoader.getController();

            controller.toggleTheme.setOnAction(event -> {
                if(controller.toggleTheme.isSelected()) {
                    jMetro.setStyle(Style.LIGHT);
                    controller.setRootTheme(true);
                    controller.toggleTheme.setText("Dark");
                } else {
                    jMetro.setStyle(Style.DARK);
                    controller.setRootTheme(false);
                    controller.toggleTheme.setText("Light");
                }
            });

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
