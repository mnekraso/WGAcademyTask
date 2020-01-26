package visual;

import elements.BasicElement;
import field.ElementsMover;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;

import utilites.Direction;

import java.util.ArrayList;
import java.util.LinkedList;

public class Pointer {

    private LinkedList<BasicElement> elementsgrid;
    private ArrayList<Button> buttons = new ArrayList<>();
    private ElementsMover mover;


    private Button up;
    private Button right;
    private Button down;
    private Button left;
    private int index;
    private int scale_x;
    private int scale_y;
    Pointer(LinkedList<BasicElement> elementsgrid, int index, int scale_x, int scale_y) {
        this.elementsgrid = elementsgrid;
        this.index=index;
        this.scale_x=scale_x;
        this.scale_y=scale_y;
        mover = new ElementsMover(elementsgrid);
        up = new Button("", new ImageView("visual/вверх.png"));
        right = new Button("", new ImageView("visual/вправо.png"));
        down = new Button("", new ImageView("visual/вниз.png"));
        left = new Button("", new ImageView("visual/влево.png"));


       /* up=new Button();
        right=new Button();
        down=new Button();
        left=new Button();
        */

        buttons.add(up);
        buttons.add(right);
        buttons.add(down);
        buttons.add(left);

        for(Button b:buttons){
            //b.setPrefSize(45,45);
            b.setMinSize(40,40);
            b.setMaxSize(40,40);
        }
    }



    //Group buttons = new Group();

    /**
     * перемещает элементы группой
     * @param x
     * @param y
     */
    private void move(int x, int y){
        left.setLayoutX(x);
        left.setLayoutY(y);

        up.setLayoutX(x+40);
        up.setLayoutY(y-40);

        right.setLayoutX(x+80);
        right.setLayoutY(y);

        down.setLayoutX(x+40);
        down.setLayoutY(y);
    }

    /**
     * активирует или блокирует кнопки управления в зависимости от расположения объекта,
     * предусмотрено изменение положения кнопок относительно элемента
     * @return
     */
    ArrayList<Button> generate(){
        up.setDisable(true);
        left.setDisable(true);
        down.setDisable(true);
        right.setDisable(true);
        switch(index){
            case 0:
                setDirect(0);
               // up.setDisable(true);
               // left.setDisable(true);
               // down.setDisable(false);
               // right.setDisable(true);
                move(scale_x, scale_y-40);
                break;
            case 1:

               /* up.setDisable(true);
                left.setDisable(false);
                down.setDisable(false);
                right.setDisable(false);
                */
                move(scale_x, scale_y-40);
                break;
            case 2:
                setDirect(2);
                /*up.setDisable(true);
                left.setDisable(true);
                down.setDisable(false);
                right.setDisable(true);
                */
                move(scale_x, scale_y-40);
                break;
            case 3:

                move(scale_x, scale_y-40);
                break;
            case 4:
                setDirect(4);
                /*up.setDisable(true);
                left.setDisable(true);
                down.setDisable(false);
                right.setDisable(true);*/
                move(scale_x, scale_y-40);
                break;

            case 5:
                setDirect(5);
                /*up.setDisable(false);
                left.setDisable(true);
                down.setDisable(false);
                right.setDisable(false);*/
                move(scale_x, scale_y-40);
                break;
            case 6:
                setDirect(6);
                System.out.println(left.isDisable());
                System.out.println(right.isDisable());
                /*up.setDisable(false);
                left.setDisable(false);
                down.setDisable(false);
                right.setDisable(false);*/
                move(scale_x, scale_y-40);
                break;
            case 7:
                setDirect(7);
                /*up.setDisable(false);
                left.setDisable(true);
                down.setDisable(false);
                right.setDisable(false);*/
                move(scale_x, scale_y-40);
                break;
            case 8:
                setDirect(8);
                /*up.setDisable(false);
                left.setDisable(false);
                down.setDisable(false);
                right.setDisable(false);*/
                move(scale_x, scale_y-40);
                break;
            case 9:
                setDirect(9);
                /*up.setDisable(false);
                left.setDisable(false);
                down.setDisable(false);
                right.setDisable(true);*/
                move(scale_x, scale_y-40);
                break;

            case 10:
                setDirect(10);
                /*up.setDisable(false);
                left.setDisable(true);
                down.setDisable(false);
                right.setDisable(false);*/
                move(scale_x, scale_y-40);
                break;
            case 11:
                move(scale_x, scale_y-40);
                break;
            case 12:
                setDirect(12);
                /*up.setDisable(false);
                left.setDisable(true);
                down.setDisable(false);
                right.setDisable(false);*/
                move(scale_x, scale_y-40);
                break;
            case 13:
                move(scale_x, scale_y-40);
                break;
            case 14:
                setDirect(14);
                /*up.setDisable(false);
                left.setDisable(false);
                down.setDisable(false);
                right.setDisable(true);*/
                move(scale_x, scale_y-40);
                break;

            case 15:
                setDirect(15);
                /*up.setDisable(false);
                left.setDisable(true);
                down.setDisable(false);
                right.setDisable(false);*/
                move(scale_x, scale_y-40);
                break;
            case 16:
                setDirect(16);
                /*up.setDisable(false);
                left.setDisable(false);
                down.setDisable(false);
                right.setDisable(false);*/
                move(scale_x, scale_y-40);
                break;
            case 17:
                setDirect(17);
                /*up.setDisable(false);
                left.setDisable(true);
                down.setDisable(false);
                right.setDisable(false);*/
                move(scale_x, scale_y-40);
                break;
            case 18:
                setDirect(18);
                /*up.setDisable(false);
                left.setDisable(false);
                down.setDisable(false);
                right.setDisable(false);*/
                move(scale_x, scale_y-40);
                break;
            case 19:
                System.out.println(elementsgrid.get(18).getElementStatus());
                setDirect(19);
               /* up.setDisable(false);
                left.setDisable(false);
                down.setDisable(false);
                right.setDisable(true);*/
                move(scale_x, scale_y-40);
                break;

            case 20:
                setDirect(20);
                /*up.setDisable(false);
                left.setDisable(true);
                down.setDisable(false);
                right.setDisable(false);*/
                move(scale_x, scale_y-40);
                break;
            case 21:
                move(scale_x, scale_y-40);
                break;
            case 22:
                setDirect(22);
                /*up.setDisable(false);
                left.setDisable(true);
                down.setDisable(false);
                right.setDisable(false);*/
                move(scale_x, scale_y-40);
                break;
            case 23:
                move(scale_x, scale_y-40);
                break;
            case 24:
                setDirect(24);
                /*up.setDisable(false);
                left.setDisable(false);
                down.setDisable(false);
                right.setDisable(true);*/
                move(scale_x, scale_y-40);
                break;

        }




        ArrayList<Button> buttons1 = new ArrayList<>();
        buttons1.add(up);
        buttons1.add(right);
        buttons1.add(down);
        buttons1.add(left);



        return buttons1;
    }

    private void setDirect(int index){
        if (mover.checkEmpties(index, Direction.UP)){
            up.setDisable(false);
        }
        if (mover.checkEmpties(index, Direction.LEFT)){
            left.setDisable(false);
        }
        if (mover.checkEmpties(index, Direction.DOWN)){
            down.setDisable(false);
        }
        if (mover.checkEmpties(index, Direction.RIGHT)){
            right.setDisable(false);
        }
    }
}
