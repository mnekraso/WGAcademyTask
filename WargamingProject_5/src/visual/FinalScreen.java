package visual;

import javafx.application.Platform;
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


public class FinalScreen {
    private Stage parent;

    void setParent(Stage parent) {
        this.parent = parent;
    }

    @FXML
    private AnchorPane font;
    @FXML
    private Button restart;

    @FXML
    private Button exit;



    @FXML
    private void initialize(){
        font.setStyle( "-fx-background-color: "+ Colors.getDefault_color());
        restart.setOnAction(a->{
            Stage s = (Stage) restart.getScene().getWindow();

            Stage game = new Stage();
            try {
                Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
                game.setTitle("Nekrasov Mikhail");
                game.setScene(new Scene(root, 600, 400));
                game.setResizable(false);
                game.show();
                parent.close();
                s.close();
            }catch (IOException e){e.printStackTrace();}
            });

        exit.setOnAction(a->Platform.exit());
    }

    public void buttonExitClick(ActionEvent actionEvent) {
        parent.close();
        Platform.exit();
    }

}
