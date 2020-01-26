package visual;

import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import utilites.Colors;

import java.io.IOException;

public class Controller {

    @FXML
    private Button startbutton;

    @FXML
    private ComboBox<String> basecolor = new ComboBox<>();

    @FXML
    private ComboBox<String> color1 = new ComboBox<>();


    @FXML
    private ComboBox<String> color2 = new ComboBox<>();

    @FXML
    private ComboBox<String> color3 = new ComboBox<>();

    @FXML
    private void initialize(){
        ObservableList<String> colorlist = FXCollections.observableArrayList(

                "COLOR1",
                "COLOR2",
                "COLOR3",
                "COLOR4",
                "COLOR5"
        );
        basecolor.setItems(colorlist);
        basecolor.setValue("COLOR1");
        basecolor.setStyle(" -fx-background-color: "+ Colors.basiccolor1);
        basecolor.valueProperty().addListener((observable, oldValue, newValue) -> {
            if(newValue.equals("COLOR1")){
                basecolor.setStyle(" -fx-background-color: "+ Colors.basiccolor1);
            }
            if(newValue.equals("COLOR2")){
                basecolor.setStyle(" -fx-background-color: "+ Colors.basiccolor2);
            }
            if(newValue.equals("COLOR3")){
                basecolor.setStyle(" -fx-background-color: "+ Colors.basiccolor3);
            }
            if(newValue.equals("COLOR4")) {
                basecolor.setStyle(" -fx-background-color: " + Colors.basiccolor4);
            }
            if(newValue.equals("COLOR5")){
                basecolor.setStyle(" -fx-background-color: "+ Colors.basiccolor5);
            }

        });



        color1.setItems(colorlist);
        color1.setValue("COLOR1");
        color1.setStyle(" -fx-background-color: "+ Colors.color11);
        color1.valueProperty().addListener((observable, oldValue, newValue) -> {
            if(newValue.equals("COLOR1")){
                color1.setStyle(" -fx-background-color: "+ Colors.color11);
            }
            if(newValue.equals("COLOR2")){
                color1.setStyle(" -fx-background-color: "+ Colors.color12);
            }
            if(newValue.equals("COLOR3")){
                color1.setStyle(" -fx-background-color: "+ Colors.color13);
            }
            if(newValue.equals("COLOR4")) {
                color1.setStyle(" -fx-background-color: " + Colors.color14);
            }
            if(newValue.equals("COLOR5")){
                color1.setStyle(" -fx-background-color: "+ Colors.color15);
            }
        });

        color2.setItems(colorlist);
        color2.setValue("COLOR1");
        color2.setStyle(" -fx-background-color: "+ Colors.color21);
        color2.valueProperty().addListener((observable, oldValue, newValue) -> {
            if(newValue.equals("COLOR1")){
                color2.setStyle(" -fx-background-color: "+ Colors.color21);
            }
            if(newValue.equals("COLOR2")){
                color2.setStyle(" -fx-background-color: "+ Colors.color22);
            }
            if(newValue.equals("COLOR3")){
                color2.setStyle(" -fx-background-color: "+ Colors.color23);
            }
            if(newValue.equals("COLOR4")) {
                color2.setStyle(" -fx-background-color: " + Colors.color24);
            }
            if(newValue.equals("COLOR5")){
                color2.setStyle(" -fx-background-color: "+ Colors.color25);
            }
        });

        color3.setItems(colorlist);
        color3.setValue("COLOR1");
        color3.setStyle(" -fx-background-color: "+ Colors.color31);
        color3.valueProperty().addListener((observable, oldValue, newValue) -> {
            if(newValue.equals("COLOR1")){
                color3.setStyle(" -fx-background-color: "+ Colors.color31);
            }
            if(newValue.equals("COLOR2")){
                color3.setStyle(" -fx-background-color: "+ Colors.color32);
            }
            if(newValue.equals("COLOR3")){
                color3.setStyle(" -fx-background-color: "+ Colors.color33);
            }
            if(newValue.equals("COLOR4")) {
                color3.setStyle(" -fx-background-color: " + Colors.color34);
            }
            if(newValue.equals("COLOR5")){
                color3.setStyle(" -fx-background-color: "+ Colors.color35);
            }
        });
    }

    public void buttonExitClick(ActionEvent actionEvent) {
        Platform.exit();
    }
        @FXML
        private void buttonpress(){
            Colors.setDefault(basecolor.getValue());
            Colors.setColor1(color1.getValue());
            Colors.setColor2(color2.getValue());
            Colors.setColor3(color3.getValue());
            Stage stage = (Stage) startbutton.getScene().getWindow();

            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("info.fxml"));
                //Parent root = FXMLLoader.load(getClass().getResource("info.fxml"));
                Parent root = loader.load();
                InfoController infoController = loader.getController();
                infoController.setParent(stage);
                Stage info = new Stage();
                info.initModality(Modality.APPLICATION_MODAL);
                info.setTitle("Информация");
                info.setScene(new Scene(root, 400,300));
                info.setResizable(false);
                info.show();


            }catch(IOException e){e.printStackTrace();}
        }




    }



