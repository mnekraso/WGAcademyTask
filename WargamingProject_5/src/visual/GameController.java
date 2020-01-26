package visual;

import elements.BasicElement;
import field.ElementsMover;
import field.GameField;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.shape.Rectangle;
import javafx.stage.Modality;
import javafx.stage.Stage;
import utilites.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;


public class GameController {
    @FXML
    private GridPane grid;
    @FXML
    private MenuItem restart;
    @FXML
    private MenuItem autocomplete;
    @FXML
    private AnchorPane font;
    @FXML
    private Rectangle color1;
    @FXML
    private Rectangle color2;
    @FXML
    private Rectangle color3;
    @FXML
    private Rectangle grid0;
    @FXML
    private Rectangle grid1;
    @FXML
    private Rectangle grid2;
    @FXML
    private Rectangle grid3;
    @FXML
    private Rectangle grid4;
    @FXML
    private Rectangle grid5;
    @FXML
    private Rectangle grid6;
    @FXML
    private Rectangle grid7;
    @FXML
    private Rectangle grid8;
    @FXML
    private Rectangle grid9;
    @FXML
    private Rectangle grid10;
    @FXML
    private Rectangle grid11;
    @FXML
    private Rectangle grid12;
    @FXML
    private Rectangle grid13;
    @FXML
    private Rectangle grid14;
    @FXML
    private Rectangle grid15;
    @FXML
    private Rectangle grid16;
    @FXML
    private Rectangle grid17;
    @FXML
    private Rectangle grid18;
    @FXML
    private Rectangle grid19;
    @FXML
    private Rectangle grid20;
    @FXML
    private Rectangle grid21;
    @FXML
    private Rectangle grid22;
    @FXML
    private Rectangle grid23;
    @FXML
    private Rectangle grid24;

    private Stage newParent;

    void setParent(Stage parent) {
        this.newParent = parent;
    }

    public void buttonExitClick(ActionEvent actionEvent) {
        Platform.exit();
    }

    private GameField field = new GameField(Colors.getDefault_color(), new String[]{Colors.getColor1(), Colors.getColor2(), Colors.getColor3()});
    private LinkedList<BasicElement> elementsGrid = field.getElementsGrid();

    private LinkedList<Rectangle> visualGrid = new LinkedList<>();
    private ArrayList<Button> buttons;

    @FXML
    private void initialize(){
        font.setStyle(" -fx-background-color: "+ Colors.getDefault_color());
        visualGrid.add(grid0);
        visualGrid.add(grid1);
        visualGrid.add(grid2);
        visualGrid.add(grid3);
        visualGrid.add(grid4);
        visualGrid.add(grid5);
        visualGrid.add(grid6);
        visualGrid.add(grid7);
        visualGrid.add(grid8);
        visualGrid.add(grid9);
        visualGrid.add(grid10);
        visualGrid.add(grid11);
        visualGrid.add(grid12);
        visualGrid.add(grid13);
        visualGrid.add(grid14);
        visualGrid.add(grid15);
        visualGrid.add(grid16);
        visualGrid.add(grid17);
        visualGrid.add(grid18);
        visualGrid.add(grid19);
        visualGrid.add(grid20);
        visualGrid.add(grid21);
        visualGrid.add(grid22);
        visualGrid.add(grid23);
        visualGrid.add(grid24);

        color1.setStyle(" -fx-fill: "+Colors.getColor1());
        color2.setStyle(" -fx-fill: "+Colors.getColor2());
        color3.setStyle(" -fx-fill: "+Colors.getColor3());
        update();



        }



    private ElementsMover mover = new ElementsMover(elementsGrid);

    private boolean gridClicked;

    @FXML
    private void fontTouch(){
        if(!gridClicked) {
            clear();
        }else{
            gridClicked=false;
        }
    }
    private void clear(){
        if(buttons!=null) {
            if (font.getChildren().contains(buttons.get(0))) {
                for (Button button : buttons) {
                    font.getChildren().remove(button);
                }
            }
        }

        buttons=null;

    }



    private void update(){
        for (int i=0; i<25;i++){
            if(elementsGrid.get(i).getElementStatus()== ElementStatus.ACTIVE){
                visualGrid.get(i).setDisable(false);
                visualGrid.get(i).setVisible(true);
            }else if(elementsGrid.get(i).getElementStatus()== ElementStatus.EMPTY){
                visualGrid.get(i).setDisable(true);
                visualGrid.get(i).setVisible(false);
            }else if(elementsGrid.get(i).getElementStatus()== ElementStatus.FREEZED){
                visualGrid.get(i).setVisible(true);
                visualGrid.get(i).setDisable(false);
            }
            visualGrid.get(i).setStyle(" -fx-fill: "+elementsGrid.get(i).getColor());
        }

    }
    private Checker checker = new Checker(elementsGrid);
    private void check(){
        if(checker.check()){
            Stage endScreen=new Stage();
            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("finalScreen.fxml"));
                //Parent root = FXMLLoader.load(getClass().getResource("info.fxml"));
                Parent root = loader.load();
                FinalScreen finalScreen = loader.getController();
                //InfoController infoController = loader.getController();
                finalScreen.setParent(newParent);
                endScreen.initModality(Modality.APPLICATION_MODAL);
                endScreen.setTitle("Некрасов Михаил");
                endScreen.setScene(new Scene(root, 400,300));
                endScreen.setResizable(false);
                endScreen.show();
                //newParent.close();
            }catch (IOException e){e.printStackTrace();}
            }
    }
    @FXML
    private void grid0touch(){
        clear();

        buttons=new Pointer(elementsGrid, 0,(int)grid0.localToScene(grid0.getBoundsInLocal()).getMinX(),(int)grid0.localToScene(grid0.getBoundsInLocal()).getMinY()).generate();
        for (Button button : buttons) {
            font.getChildren().add(button);
        }


        gridClicked=true;


        buttons.get(2).setOnAction(a-> {System.out.println("Down(0) is clicked");
            mover.move(0,Direction.DOWN);
            update();
            clear();
            check();});

    }
//grid0touch --> обрабатываем нажатие клавиатуры --> в классе ElementsMover делаем метод и меняем местами
    @FXML
    private void grid1touch(){

    }

    @FXML
    private void grid2touch(){
        clear();

        buttons=new Pointer(elementsGrid, 2,(int)grid2.localToScene(grid2.getBoundsInLocal()).getMinX(),(int)grid2.localToScene(grid2.getBoundsInLocal()).getMinY()).generate();
        for (Button button : buttons) {
            font.getChildren().add(button);
        }


        gridClicked=true;


        buttons.get(2).setOnAction(a-> {System.out.println("Down(2) is clicked");
            mover.move(2,Direction.DOWN);
            update();
            clear();
            check();});
           }

    @FXML
    private void grid3touch(){

    }

    @FXML
    private void grid4touch(){
        clear();
        //buttons = new Pointer(elementsGrid, 4, 100,100).generate();
         buttons=new Pointer(elementsGrid, 4,(int)grid4.localToScene(grid4.getBoundsInLocal()).getMinX(),(int)grid4.localToScene(grid4.getBoundsInLocal()).getMinY()).generate();
        for (Button button : buttons) {
            font.getChildren().add(button);
        }
        System.out.println(font.getChildren().contains(buttons.get(1)));


        gridClicked=true;

        buttons.get(2).setOnAction(a-> {System.out.println("Down(4) is clicked");
        mover.move(4, Direction.DOWN);
        update();
        clear();
        check();});
    }


    @FXML
    private void grid5touch(){
        clear();

        buttons=new Pointer(elementsGrid, 5,(int)grid5.localToScene(grid5.getBoundsInLocal()).getMinX(),(int)grid5.localToScene(grid5.getBoundsInLocal()).getMinY()).generate();
        for (Button button : buttons) {
            font.getChildren().add(button);
        }


        gridClicked=true;
        buttons.get(0).setOnAction(a-> {System.out.println("Up(5) is clicked");
            mover.move(5,Direction.UP);
            update();
            clear();
            check();
        });
        buttons.get(1).setOnAction(a-> {System.out.println("Right(5) is clicked");
            mover.move(5,Direction.RIGHT);
            update();
            clear();
            check();});
        buttons.get(2).setOnAction(a-> {System.out.println("Down(5) is clicked");
            mover.move(5,Direction.DOWN);
            update();
            clear();
            check();});


    }

    @FXML
    private void grid6touch(){
        clear();

        buttons=new Pointer(elementsGrid, 6,(int)grid6.localToScene(grid6.getBoundsInLocal()).getMinX(),(int)grid6.localToScene(grid6.getBoundsInLocal()).getMinY()).generate();
        for (Button button : buttons) {
            font.getChildren().add(button);
        }


        gridClicked=true;

        buttons.get(1).setOnAction(a-> {System.out.println("Right(6) is clicked");
            mover.move(6,Direction.RIGHT);
            update();
            clear();
            check();});

        buttons.get(3).setOnAction(a-> {System.out.println("Left(6) is clicked");
            mover.move(6,Direction.LEFT);
            update();
            clear();
            check();});


    }

    @FXML
    private void grid7touch(){
        clear();

        buttons=new Pointer(elementsGrid, 7,(int)grid7.localToScene(grid7.getBoundsInLocal()).getMinX(),(int)grid7.localToScene(grid7.getBoundsInLocal()).getMinY()).generate();
        for (Button button : buttons) {
            font.getChildren().add(button);
        }


        gridClicked=true;
        buttons.get(0).setOnAction(a-> {System.out.println("Up(7) is clicked");
            mover.move(7,Direction.UP);
            update();
            clear();
            check();
        });
        buttons.get(1).setOnAction(a-> {System.out.println("Right(7) is clicked");
            mover.move(7,Direction.RIGHT);
            update();
            clear();
            check();});
        buttons.get(2).setOnAction(a-> {System.out.println("Down(7) is clicked");
            mover.move(7,Direction.DOWN);
            update();
            clear();
            check();});
        buttons.get(3).setOnAction(a-> {System.out.println("Left(7) is clicked");
            mover.move(7,Direction.LEFT);
            update();
            clear();
            check();});


    }

    @FXML
    private void grid8touch(){
        clear();

        buttons=new Pointer(elementsGrid, 8,(int)grid8.localToScene(grid8.getBoundsInLocal()).getMinX(),(int)grid8.localToScene(grid8.getBoundsInLocal()).getMinY()).generate();
        for (Button button : buttons) {
            font.getChildren().add(button);
        }


        gridClicked=true;

        buttons.get(1).setOnAction(a-> {System.out.println("Right(8) is clicked");
            mover.move(8,Direction.RIGHT);
            update();
            clear();
            check();});

        buttons.get(3).setOnAction(a-> {System.out.println("Left(8) is clicked");
            mover.move(8,Direction.LEFT);
            update();
            clear();
            check();});


    }

    @FXML
    private void grid9touch(){
        clear();

        buttons=new Pointer(elementsGrid, 9,(int)grid9.localToScene(grid9.getBoundsInLocal()).getMinX(),(int)grid9.localToScene(grid9.getBoundsInLocal()).getMinY()).generate();
        for (Button button : buttons) {
            font.getChildren().add(button);
        }


        gridClicked=true;
        buttons.get(0).setOnAction(a-> {System.out.println("Up(9) is clicked");
            mover.move(9,Direction.UP);
            update();
            clear();
            check();
        });

        buttons.get(2).setOnAction(a-> {System.out.println("Down(9) is clicked");
            mover.move(9,Direction.DOWN);
            update();
            clear();
            check();});
        buttons.get(3).setOnAction(a-> {System.out.println("Left(9) is clicked");
            mover.move(9,Direction.LEFT);
            update();
            clear();
            check();});


    }

    @FXML
    private void grid10touch(){
        clear();

        buttons=new Pointer(elementsGrid, 10,(int)grid10.localToScene(grid10.getBoundsInLocal()).getMinX(),(int)grid10.localToScene(grid10.getBoundsInLocal()).getMinY()).generate();
        for (Button button : buttons) {
            font.getChildren().add(button);
        }


        gridClicked=true;
        buttons.get(0).setOnAction(a-> {System.out.println("Up(10) is clicked");
            mover.move(10,Direction.UP);
            update();
            clear();
            check();
        });

        buttons.get(2).setOnAction(a-> {System.out.println("Down(10) is clicked");
            mover.move(10,Direction.DOWN);
            update();
            clear();
            check();});



    }

    @FXML
    private void grid11touch() {
    }

    @FXML
    private void grid12touch(){
        clear();

        buttons=new Pointer(elementsGrid, 12,(int)grid12.localToScene(grid12.getBoundsInLocal()).getMinX(),(int)grid12.localToScene(grid12.getBoundsInLocal()).getMinY()).generate();
        for (Button button : buttons) {
            font.getChildren().add(button);
        }


        gridClicked=true;

        buttons.get(0).setOnAction(a-> {System.out.println("Up(12) is clicked");
            mover.move(12,Direction.UP);
            update();
            clear();
            check();});
        buttons.get(2).setOnAction(a-> {System.out.println("Down(12) is clicked");
            mover.move(12,Direction.DOWN);
            update();
            clear();
            check();});



    }

    @FXML
    private void grid013touch(){

    }

    @FXML
    private void grid14touch(){
        clear();

        buttons=new Pointer(elementsGrid, 14,(int)grid14.localToScene(grid14.getBoundsInLocal()).getMinX(),(int)grid14.localToScene(grid14.getBoundsInLocal()).getMinY()).generate();
        for (Button button : buttons) {
            font.getChildren().add(button);
        }


        gridClicked=true;
        buttons.get(0).setOnAction(a-> {System.out.println("Up(14) is clicked");
            mover.move(14,Direction.UP);
            update();
            clear();
            check();
        });

        buttons.get(2).setOnAction(a-> {System.out.println("Down(14) is clicked");
            mover.move(14,Direction.DOWN);
            update();
            clear();
            check();});



    }

    @FXML
    private void grid015touch(){
        clear();

        buttons=new Pointer(elementsGrid, 15,(int)grid15.localToScene(grid15.getBoundsInLocal()).getMinX(),(int)grid15.localToScene(grid15.getBoundsInLocal()).getMinY()).generate();
        for (Button button : buttons) {
            font.getChildren().add(button);
        }


        gridClicked=true;
        buttons.get(0).setOnAction(a-> {System.out.println("Up(15) is clicked");
            mover.move(15,Direction.UP);
            update();
            clear();
            check();
        });
        buttons.get(1).setOnAction(a-> {System.out.println("Right(15) is clicked");
            mover.move(15,Direction.RIGHT);
            update();
            clear();
            check();});
        buttons.get(2).setOnAction(a-> {System.out.println("Down(0) is clicked");
            mover.move(15,Direction.DOWN);
            update();
            clear();
            check();});

    }

    @FXML
    private void grid16touch(){
        clear();

        buttons=new Pointer(elementsGrid, 16,(int)grid16.localToScene(grid16.getBoundsInLocal()).getMinX(),(int)grid16.localToScene(grid16.getBoundsInLocal()).getMinY()).generate();
        for (Button button : buttons) {
            font.getChildren().add(button);
        }


        gridClicked=true;

        buttons.get(1).setOnAction(a-> {System.out.println("Right(16) is clicked");
            mover.move(16,Direction.RIGHT);
            update();
            clear();
            check();});

        buttons.get(3).setOnAction(a-> {System.out.println("Left(16) is clicked");
            mover.move(16,Direction.LEFT);
            update();
            clear();
            check();});
    }

    @FXML
    private void grid17touch(){
        clear();

        buttons=new Pointer(elementsGrid, 17,(int)grid17.localToScene(grid17.getBoundsInLocal()).getMinX(),(int)grid17.localToScene(grid17.getBoundsInLocal()).getMinY()).generate();
        for (Button button : buttons) {
            font.getChildren().add(button);
        }


        gridClicked=true;
        buttons.get(0).setOnAction(a-> {System.out.println("Up(17) is clicked");
            mover.move(17,Direction.UP);
            update();
            clear();
            check();
        });
        buttons.get(1).setOnAction(a-> {System.out.println("Right(17) is clicked");
            mover.move(17,Direction.RIGHT);
            update();
            clear();
            check();});
        buttons.get(2).setOnAction(a-> {System.out.println("Down(17) is clicked");
            mover.move(17,Direction.DOWN);
            update();
            clear();
            check();});
        buttons.get(3).setOnAction(a-> {System.out.println("Left(7) is clicked");
            mover.move(17,Direction.LEFT);
            update();
            clear();
            check();});


    }

    @FXML
    private void grid18touch(){
        clear();

        buttons=new Pointer(elementsGrid, 18,(int)grid18.localToScene(grid18.getBoundsInLocal()).getMinX(),(int)grid18.localToScene(grid18.getBoundsInLocal()).getMinY()).generate();
        for (Button button : buttons) {
            font.getChildren().add(button);
        }


        gridClicked=true;
        buttons.get(1).setOnAction(a-> {System.out.println("Right(18) is clicked");
            mover.move(18,Direction.RIGHT);
            update();
            clear();
            check();});

        buttons.get(3).setOnAction(a-> {System.out.println("Left(18) is clicked");
            mover.move(18,Direction.LEFT);
            update();
            clear();
            check();});

    }

    @FXML
    private void grid19touch(){
        clear();

        buttons=new Pointer(elementsGrid, 19,(int)grid14.localToScene(grid19.getBoundsInLocal()).getMinX(),(int)grid19.localToScene(grid19.getBoundsInLocal()).getMinY()).generate();
        for (Button button : buttons) {
            font.getChildren().add(button);
        }


        gridClicked=true;
        buttons.get(0).setOnAction(a-> {System.out.println("Up(19) is clicked");
            mover.move(19,Direction.UP);
            update();
            clear();
            check();
        });

        buttons.get(2).setOnAction(a-> {System.out.println("Down(19) is clicked");
            mover.move(19,Direction.DOWN);
            update();
            clear();
            check();});
        buttons.get(3).setOnAction(a-> {System.out.println("Left(19) is clicked");
            mover.move(19,Direction.LEFT);
            update();
            clear();
            check();});

    }

    @FXML
    private void grid20touch(){
        clear();

        buttons=new Pointer(elementsGrid, 20,(int)grid20.localToScene(grid20.getBoundsInLocal()).getMinX(),(int)grid20.localToScene(grid20.getBoundsInLocal()).getMinY()).generate();
        for (Button button : buttons) {
            font.getChildren().add(button);
        }


        gridClicked=true;
        buttons.get(0).setOnAction(a-> {System.out.println("Up(20) is clicked");
            mover.move(20,Direction.UP);
            update();
            clear();
            check();
        });


    }

    @FXML
    private void grid21touch(){

    }

    @FXML
    private void grid22touch(){
        clear();

        buttons=new Pointer(elementsGrid, 22,(int)grid22.localToScene(grid22.getBoundsInLocal()).getMinX(),(int)grid22.localToScene(grid22.getBoundsInLocal()).getMinY()).generate();
        for (Button button : buttons) {
            font.getChildren().add(button);
        }


        gridClicked=true;
        buttons.get(0).setOnAction(a-> {System.out.println("Up(22) is clicked");
            mover.move(22,Direction.UP);
            update();
            clear();
            check();
        });
    }

    @FXML
    private void grid23touch(){

    }

    @FXML
    private void grid24touch(){
        clear();
        buttons=new Pointer(elementsGrid, 24,(int)grid24.localToScene(grid24.getBoundsInLocal()).getMinX(),(int)grid24.localToScene(grid24.getBoundsInLocal()).getMinY()).generate();
        for (Button button : buttons) {
            font.getChildren().add(button);
        }


        gridClicked=true;
        buttons.get(0).setOnAction(a-> {System.out.println("Up(24) is clicked");
            mover.move(24,Direction.UP);
            update();
            clear();
            check();
        });

    }





    @FXML
    private void restart(){
        /*try {

            Parent root = FXMLLoader.load(getClass().getResource("WargamingProject.fxml"));
            Stage newParent=(Stage) grid.getScene().getWindow();
            newParent.setTitle("Game - NEKRASOV");
            newParent.setResizable(false);
            newParent.setScene(new Scene(root));
            newParent.show();

        }catch(IOException e){e.printStackTrace();}*/
    }

    @FXML
    private void autocomplete(){
        new AutoComplete(elementsGrid).complete();
        update();
        check();
    }


}
