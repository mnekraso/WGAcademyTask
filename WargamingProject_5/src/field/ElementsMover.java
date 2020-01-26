package field;

import elements.BasicElement;
import utilites.Direction;
import utilites.ElementStatus;

import java.util.LinkedList;

public class ElementsMover {

    private LinkedList<BasicElement> elementsGrid;

    public ElementsMover(LinkedList<BasicElement> elementsGrid) {

        this.elementsGrid = elementsGrid;
    }

    /**
     * меняет два элемента коллекции местами
     * @param i1-индекс 1-го элемента
     * @param i2-индекс 2-го элемента
     */
    private void change(int i1, int i2){
        BasicElement b1 = elementsGrid.get(i1);
        BasicElement b2 = elementsGrid.get(i2);
        elementsGrid.set(i1, b2);
        elementsGrid.set(i2,b1);
    }

    /**
     * меняет местами выбранный элемент в зависимости от направления
     * @param index-индекс элемента
     * @param direction-направление
     */
    public void move(int index, Direction direction){

        switch (index){
            case 0:
                if (direction==Direction.DOWN){
                    change(0,5);
                }break;
            case 2:
                if(direction==Direction.DOWN){
                    change(2,7);
                }
                break;
            case 4:
                if(direction==Direction.DOWN){
                    change(4,9);
                }
                break;
            case 5:
                if(direction==Direction.RIGHT){
                    change(5,6);
                }
                if(direction==Direction.DOWN){
                    change(5,10);
                }
                if(direction==Direction.UP){
                    change(5,0);
                }
                break;
            case 6:
                if (direction==Direction.LEFT) {
                    change(6, 5);
                }
                if(direction==Direction.RIGHT){
                    change(6,7);
                }
                break;
            case 7:
                if(direction==Direction.UP){
                    change(7,2);
                }
                if(direction==Direction.RIGHT){
                    change(7,8);
                }
                if(direction==Direction.DOWN){
                    change(7,12);
                }
                if (direction==Direction.LEFT){
                    change(7,6);
                }
                break;
            case 8:
                if (direction==Direction.LEFT) {
                    change(8, 7);
                }
                if(direction==Direction.RIGHT){
                    change(8,9);
                }
                break;
            case 9:
                if(direction==Direction.LEFT){
                    change(9,8);
                }
                if(direction==Direction.DOWN){
                    change(9,14);
                }
                if(direction==Direction.UP){
                    change(9,4);
                }
                break;
            case 10:
                if(direction==Direction.UP){
                    change(10,5);
                }
                if(direction==Direction.DOWN){
                    change(10,15);
                }
                break;
            case 12:
                if(direction==Direction.UP){
                    change(12,7);
                }
                if(direction==Direction.DOWN){
                    change(12,17);
                }
                break;
            case 14:
                if(direction==Direction.UP){
                    change(14,9);
                }
                if(direction==Direction.DOWN){
                    change(14,19);
                }
                break;
            case 15:
                if(direction==Direction.RIGHT){
                    change(15,16);
                }
                if(direction==Direction.DOWN){
                    change(15,20);
                }
                if(direction==Direction.UP){
                    change(15,10);
                }
                break;
            case 16:
                if (direction==Direction.LEFT) {
                    change(16, 15);
                }
                if(direction==Direction.RIGHT){
                    change(16,17);
                }
                break;
            case 17:
                if(direction==Direction.UP){
                    change(17,12);
                }
                if(direction==Direction.RIGHT){
                    change(17,18);
                }
                if(direction==Direction.DOWN){
                    change(17,22);
                }
                if (direction==Direction.LEFT){
                    change(17,16);
                }
                break;
            case 18:
                if (direction==Direction.LEFT) {
                    change(18, 17);
                }
                if(direction==Direction.RIGHT){
                    change(18,19);
                }
                break;
            case 19:
                if(direction==Direction.LEFT){
                    change(19,18);
                }
                if(direction==Direction.DOWN){
                    change(19,24);
                }
                if(direction==Direction.UP){
                    change(19,14);
                }
                break;
            case 20:
                if (direction==Direction.UP){
                    change(20,15);
                }break;
            case 22:
                if(direction==Direction.UP){
                    change(22,17);
                }
                break;
            case 24:
                if(direction==Direction.UP){
                    change(24,19);
                }
                break;


        }

    }

    /**
     * проверяет наличие пустых элементов вокруг выбранного
     * @param index-индекс элемента
     * @param direction-направление
     * @return true-если в указанном направлении от элемента стоит EmptyElement, иначе false
     */
    public boolean checkEmpties(int index, Direction direction){
        switch (index){
            case 0:


                if(direction==Direction.UP){
                    return false;
                }
                if(direction==Direction.RIGHT){
                    return false;
                }
                if(direction==Direction.DOWN){
                    return elementsGrid.get(5).getElementStatus() == ElementStatus.EMPTY;
                    //return elementsGrid.get(5).getElementStatus()==ElementStatus.EMPTY;
                }
                if(direction==Direction.LEFT){
                    return false;
                }

            case 2:
                if(direction==Direction.UP){
                    return false;
                }
                if(direction==Direction.RIGHT){
                    return false;
                }
                if(direction==Direction.DOWN){
                    return elementsGrid.get(7).getElementStatus()==ElementStatus.EMPTY;
                }
                if(direction==Direction.LEFT){
                    return false;
                }
            case 4:
                if(direction==Direction.UP){
                    return false;
                }
                if(direction==Direction.RIGHT){
                    return false;
                }
                if(direction==Direction.DOWN){
                    return elementsGrid.get(9).getElementStatus()==ElementStatus.EMPTY;
                }
                if(direction==Direction.LEFT){
                    return false;
                }
            case 5:
                if(direction==Direction.UP){
                    return elementsGrid.get(0).getElementStatus()==ElementStatus.EMPTY;
                }
                if(direction==Direction.RIGHT){
                    return elementsGrid.get(6).getElementStatus()==ElementStatus.EMPTY;
                }
                if(direction==Direction.DOWN){
                    return elementsGrid.get(10).getElementStatus()==ElementStatus.EMPTY;
                }
                if(direction==Direction.LEFT){
                    return false;
                }
            case 6:
                if(direction==Direction.UP){
                    return false;
                }
                if(direction==Direction.RIGHT){
                    //System.out.println(elementsGrid.get(7).getElementStatus());
                    return elementsGrid.get(7).getElementStatus()==ElementStatus.EMPTY;
                }
                if(direction==Direction.DOWN){
                    return false;
                }
                if(direction==Direction.LEFT){
                    return elementsGrid.get(5).getElementStatus()==ElementStatus.EMPTY;
                }
            case 7:
                if(direction==Direction.UP){
                    return elementsGrid.get(2).getElementStatus()==ElementStatus.EMPTY;
                }
                if(direction==Direction.RIGHT){
                    return elementsGrid.get(8).getElementStatus()==ElementStatus.EMPTY;
                }
                if(direction==Direction.DOWN){
                    return elementsGrid.get(12).getElementStatus()==ElementStatus.EMPTY;
                }
                if(direction==Direction.LEFT){
                    return elementsGrid.get(6).getElementStatus()==ElementStatus.EMPTY;
                }
            case 8:
                if(direction==Direction.UP){
                    return false;
                }
                if(direction==Direction.RIGHT){
                    return elementsGrid.get(9).getElementStatus()==ElementStatus.EMPTY;
                }
                if(direction==Direction.DOWN){
                    return false;
                }
                if(direction==Direction.LEFT){
                    return elementsGrid.get(7).getElementStatus()==ElementStatus.EMPTY;
                }
            case 9: if(direction==Direction.UP){
                return elementsGrid.get(4).getElementStatus()==ElementStatus.EMPTY;
            }
                if(direction==Direction.RIGHT){
                    return false;
                }
                if(direction==Direction.DOWN){
                    return elementsGrid.get(14).getElementStatus()==ElementStatus.EMPTY;
                }
                if(direction==Direction.LEFT){
                    return elementsGrid.get(8).getElementStatus()==ElementStatus.EMPTY;
                }
            case 10:
                if(direction==Direction.UP){
                    return elementsGrid.get(5).getElementStatus()==ElementStatus.EMPTY;
                }
                if(direction==Direction.RIGHT){
                    return false;
                }
                if(direction==Direction.DOWN){
                    return elementsGrid.get(15).getElementStatus()==ElementStatus.EMPTY;
                }
                if(direction==Direction.LEFT){
                    return false;
                }
            case 12:
                if(direction==Direction.UP){
                    return elementsGrid.get(7).getElementStatus()==ElementStatus.EMPTY;
                }
                if(direction==Direction.RIGHT){
                    return false;
                }
                if(direction==Direction.DOWN){
                    return elementsGrid.get(17).getElementStatus()==ElementStatus.EMPTY;
                }
                if(direction==Direction.LEFT){
                    return false;
                }
            case 14:
                if(direction==Direction.UP){
                    return elementsGrid.get(9).getElementStatus()==ElementStatus.EMPTY;
                }
                if(direction==Direction.RIGHT){
                    return false;
                }
                if(direction==Direction.DOWN){
                    return elementsGrid.get(19).getElementStatus()==ElementStatus.EMPTY;
                }
                if(direction==Direction.LEFT){
                    return false;
                }
            case 15:
                if(direction==Direction.UP){
                    return elementsGrid.get(10).getElementStatus()==ElementStatus.EMPTY;
                }
                if(direction==Direction.RIGHT){
                    return elementsGrid.get(16).getElementStatus()==ElementStatus.EMPTY;
                }
                if(direction==Direction.DOWN){
                    return elementsGrid.get(20).getElementStatus()==ElementStatus.EMPTY;
                }
                if(direction==Direction.LEFT){
                    return false;
                }
            case 16:
                if(direction==Direction.UP){
                    return false;
                }
                if(direction==Direction.RIGHT){
                    return elementsGrid.get(17).getElementStatus()==ElementStatus.EMPTY;
                }
                if(direction==Direction.DOWN){
                    return false;
                }
                if(direction==Direction.LEFT){
                    return elementsGrid.get(15).getElementStatus()==ElementStatus.EMPTY;
                }
            case 17:
                if(direction==Direction.UP){
                    return elementsGrid.get(12).getElementStatus()==ElementStatus.EMPTY;
                }
                if(direction==Direction.RIGHT){
                    return elementsGrid.get(18).getElementStatus()==ElementStatus.EMPTY;
                }
                if(direction==Direction.DOWN){
                    return elementsGrid.get(22).getElementStatus()==ElementStatus.EMPTY;
                }
                if(direction==Direction.LEFT){
                    return elementsGrid.get(16).getElementStatus()==ElementStatus.EMPTY;
                }
            case 18:
                if(direction==Direction.UP){
                    return false;
                }
                if(direction==Direction.RIGHT){
                    return elementsGrid.get(19).getElementStatus()==ElementStatus.EMPTY;
                }
                if(direction==Direction.DOWN){
                    return false;
                }
                if(direction==Direction.LEFT){
                    return elementsGrid.get(17).getElementStatus()==ElementStatus.EMPTY;
                }
            case 19:
                if(direction==Direction.UP){
                    return elementsGrid.get(14).getElementStatus()==ElementStatus.EMPTY;
                }
                if(direction==Direction.RIGHT){
                    return false;
                }
                if(direction==Direction.DOWN){
                    return elementsGrid.get(24).getElementStatus()==ElementStatus.EMPTY;
                }
                if(direction==Direction.LEFT){
                    return elementsGrid.get(18).getElementStatus()==ElementStatus.EMPTY;
                }
            case 20:
                if(direction==Direction.UP){
                    return elementsGrid.get(15).getElementStatus()==ElementStatus.EMPTY;
                }
                if(direction==Direction.RIGHT){
                    return false;
                }
                if(direction==Direction.DOWN){
                    return false;
                }
                if(direction==Direction.LEFT){
                    return false;
                }
            case 22:
                if(direction==Direction.UP){
                    return elementsGrid.get(17).getElementStatus()==ElementStatus.EMPTY;
                }
                if(direction==Direction.RIGHT){
                    return false;
                }
                if(direction==Direction.DOWN){
                    return false;
                }
                if(direction==Direction.LEFT){
                    return false;
                }
            case 24:
                if(direction==Direction.UP){
                    return elementsGrid.get(19).getElementStatus()==ElementStatus.EMPTY;
                }
                if(direction==Direction.RIGHT){
                    return false;
                }
                if(direction==Direction.DOWN){
                    return false;
                }
                if(direction==Direction.LEFT){
                    return false;
                }

            default:
                return false;

        }}


    }

