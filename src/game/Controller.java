package game;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class Controller {

    @FXML
    private void handleGameStart(MouseEvent event) throws Exception{
        final Node source = (Node) event.getSource();
        Parent gameScene = FXMLLoader.load(getClass().getResource("game.fxml"));
        final Stage stage = (Stage) source.getScene().getWindow();
        stage.setScene(new Scene(gameScene, 640, 480));
        
    }

    @FXML
    private void handleAppClose(MouseEvent event) {
        System.exit(0);
    }
}
