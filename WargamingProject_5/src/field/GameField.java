package field;

import elements.BasicElement;
import elements.EmptyElement;
import elements.FreezedElement;
import elements.MoveableElement;
import utilites.Colors;
import utilites.ElementStatus;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class GameField {
    private String defaultcolor; //цвет фона и пустых элементов
    private String[] basiccolors;
    //private String basiccolor1; //цвета игровых элементов
    //private String basiccolor2;
    //private String basiccolor3;

    private LinkedList<BasicElement> elementsGrid;  //коллекция из 25 элементов, несущая в себе все клетки
                                                    //выбран двузвязный список, так как потребуется постоянно менять элементы местами внутри, а следовательно нужна оптимизация памяти

    public GameField(String defaultcolor, String[] basiccolors) {

        this.defaultcolor = defaultcolor;
        Colors.setDefault(defaultcolor);
        this.basiccolors=basiccolors;
        //this.basiccolor1 = basiccolor1;
        //this.basiccolor2 = basiccolor2;
        //this.basiccolor3 = basiccolor3;

        elementsGrid=new LinkedList<>();
        fillGrid();

    }

    public LinkedList<BasicElement> getElementsGrid() {
        return elementsGrid;
    }

    /**
     * метод fillgrid создает дополнительную коллекцию, заполняя ее moveableElements с разными цветами,
     * перемешивает ее, и добавляет на нужные места в elementsgrid, чередуя с FreezedElements и EmptyElements
     *
     */
    private void fillGrid(){
        int countMoveableColor1=0;

        int countMoveableColor2=0;

        int countMoveableColor3=0;

        ArrayList<BasicElement> moveables = new ArrayList<>();
        for(int i=0; i<15; i++){
            if(countMoveableColor1<5){
            moveables.add(new MoveableElement(basiccolors[0], ElementStatus.ACTIVE));
            countMoveableColor1++;
            }else if(countMoveableColor2<5){
                moveables.add(new MoveableElement(basiccolors[1], ElementStatus.ACTIVE));
                countMoveableColor2++;
            }else if (countMoveableColor3<5){
                moveables.add(new MoveableElement(basiccolors[2], ElementStatus.ACTIVE));
                countMoveableColor3++;
            }
        }

        Collections.shuffle(moveables);

        int counter = 0;
        for (int i=0;i<25;i++){
            switch(i){
                case 0: case 2: case 4: case 5: case 7: case 9: case 10: case 12: case 14: case 15: case 17: case 19: case 20: case 22: case 24:
                        elementsGrid.add(moveables.get(counter));
                        counter++;
                        break;
                case 1: case 3: case 11: case 13: case 21: case 23:
                    elementsGrid.add(new FreezedElement());
                    break;
                case 6: case 8: case 16: case 18:
                    elementsGrid.add(new EmptyElement());
                    break;


            }


        }

    }
}
