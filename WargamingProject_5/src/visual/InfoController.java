package visual;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import utilites.Colors;

import java.io.IOException;


public class InfoController {
    private Stage parent;

    void setParent(Stage parent) {
        this.parent = parent;
    }

    @FXML
    private AnchorPane font;

    @FXML
    private Button button = new Button();

    public void buttonExitClick(ActionEvent actionEvent) {
        Stage stage=(Stage)button.getScene().getWindow();
        stage.close();    }
    @FXML
    private void initialize(){
        font.setStyle(" -fx-background-color: "+ Colors.getDefault_color());
        button.setOnAction(a->{
            parent.close();
            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("WargamingProject.fxml"));
                Parent root = loader.load();
                Stage game = new Stage();
                GameController gameController = loader.getController();
                gameController.setParent(game);
                game.setTitle("Game - NEKRASOV");
                game.setResizable(false);
                game.setScene(new Scene(root));
                game.show();
            }catch(IOException e){e.printStackTrace();}
            Stage stage=(Stage)button.getScene().getWindow();
            stage.close();
        });
    }

}
