package elements;

import utilites.ElementStatus;

//import javax.xml.bind.Element;

public abstract class BasicElement {
    private String color; //цвет элемента
    private ElementStatus elementStatus;
    //private int coord_h; //горизонтальная координата элемента на сетке
   // private int coord_v; //вертикальная координата элемента на сетке


    public BasicElement(String color, ElementStatus elementStatus) {
        this.color = color;
        this.elementStatus=elementStatus;
       // this.coord_h = coord_h;
       // this.coord_v = coord_v;
    }

    public String getColor() {
        return color;
    }




    public void setColor(String color) {
        this.color = color;
    }

    public void setElementStatus(ElementStatus elementStatus) {
        this.elementStatus = elementStatus;
    }

    public ElementStatus getElementStatus() {
        return elementStatus;
    }


}
