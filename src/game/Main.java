package game;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    Stage window;
    Scene gameScene;
    Parent root;

    @Override
    public void start(Stage primaryStage) throws Exception{
        window = primaryStage;
        root = FXMLLoader.load(getClass().getResource("splash.fxml"));
        window.setTitle("Black Jack");
        window.setScene(new Scene(root, 640, 480));
        root.getStylesheets().add(game.Game.class.getResource("styles.css").toExternalForm());

        window.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
