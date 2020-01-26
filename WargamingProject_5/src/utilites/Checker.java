package utilites;

import elements.BasicElement;
import javafx.stage.Stage;

import java.awt.*;
import java.util.ArrayList;
import java.util.LinkedList;

public class Checker {
    private LinkedList<BasicElement> elementsgrid;


    public Checker(LinkedList<BasicElement> elementsgrid) {
        this.elementsgrid = elementsgrid;
    }

    /**
     * проверяет правильность расположения элементов
     * @return true-если элементы направильных местах, иначе false
     */
    public boolean check(){
        System.out.println("Checking");
        int k=0;
        if(Colors.getColor1().equals(elementsgrid.get(0).getColor())){
            k++;
        }
        if(Colors.getColor1().equals(elementsgrid.get(5).getColor())){
            k++;
        }
        if(Colors.getColor1().equals(elementsgrid.get(10).getColor())){
            k++;
        }
        if(Colors.getColor1().equals(elementsgrid.get(15).getColor())){
            k++;
        }
        if(Colors.getColor1().equals(elementsgrid.get(20).getColor())){
            k++;
        }
        if(Colors.getColor2().equals(elementsgrid.get(2).getColor())){
            k++;
        }
        if(Colors.getColor2().equals(elementsgrid.get(7).getColor())){
            k++;
        }
        if(Colors.getColor2().equals(elementsgrid.get(12).getColor())){
            k++;
        }
        if(Colors.getColor2().equals(elementsgrid.get(17).getColor())){
            k++;
        }
        if(Colors.getColor2().equals(elementsgrid.get(22).getColor())){
            k++;
        }
        if(Colors.getColor3().equals(elementsgrid.get(4).getColor())){
            k++;
        }
        if(Colors.getColor3().equals(elementsgrid.get(9).getColor())){
            k++;
        }
        if(Colors.getColor3().equals(elementsgrid.get(14).getColor())){
            k++;
        }
        if(Colors.getColor3().equals(elementsgrid.get(19).getColor())){
            k++;
        }
        if(Colors.getColor3().equals(elementsgrid.get(24).getColor())){
            k++;
        }

        return k == 15;
    }
}
