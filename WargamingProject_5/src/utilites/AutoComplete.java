package utilites;

import elements.BasicElement;

import java.util.LinkedList;

public class AutoComplete {
    private LinkedList<BasicElement> elementsgrid;

    public AutoComplete(LinkedList<BasicElement> elementsgrid) {
        this.elementsgrid = elementsgrid;
    }

    /**
     * метод заполняет таблицу элементов правильными значениями, для проверки метода check() завершения игры
     */
    public void complete(){
        elementsgrid.get(0).setElementStatus(ElementStatus.ACTIVE);
        elementsgrid.get(0).setColor(Colors.getColor1());
        elementsgrid.get(5).setElementStatus(ElementStatus.ACTIVE);
        elementsgrid.get(5).setColor(Colors.getColor1());
        elementsgrid.get(10).setElementStatus(ElementStatus.ACTIVE);
        elementsgrid.get(10).setColor(Colors.getColor1());
        elementsgrid.get(15).setElementStatus(ElementStatus.ACTIVE);
        elementsgrid.get(15).setColor(Colors.getColor1());
        elementsgrid.get(20).setElementStatus(ElementStatus.ACTIVE);
        elementsgrid.get(20).setColor(Colors.getColor1());

        elementsgrid.get(6).setElementStatus(ElementStatus.EMPTY);
        elementsgrid.get(16).setElementStatus(ElementStatus.EMPTY);
        elementsgrid.get(8).setElementStatus(ElementStatus.EMPTY);
        elementsgrid.get(18).setElementStatus(ElementStatus.EMPTY);

        elementsgrid.get(2).setElementStatus(ElementStatus.ACTIVE);
        elementsgrid.get(2).setColor(Colors.getColor2());
        elementsgrid.get(7).setElementStatus(ElementStatus.ACTIVE);
        elementsgrid.get(7).setColor(Colors.getColor2());
        elementsgrid.get(12).setElementStatus(ElementStatus.ACTIVE);
        elementsgrid.get(12).setColor(Colors.getColor2());
        elementsgrid.get(17).setElementStatus(ElementStatus.ACTIVE);
        elementsgrid.get(17).setColor(Colors.getColor2());
        elementsgrid.get(22).setElementStatus(ElementStatus.ACTIVE);
        elementsgrid.get(22).setColor(Colors.getColor2());

        elementsgrid.get(4).setElementStatus(ElementStatus.ACTIVE);
        elementsgrid.get(4).setColor(Colors.getColor3());
        elementsgrid.get(9).setElementStatus(ElementStatus.ACTIVE);
        elementsgrid.get(9).setColor(Colors.getColor3());
        elementsgrid.get(14).setElementStatus(ElementStatus.ACTIVE);
        elementsgrid.get(14).setColor(Colors.getColor3());
        elementsgrid.get(19).setElementStatus(ElementStatus.ACTIVE);
        elementsgrid.get(19).setColor(Colors.getColor3());
        elementsgrid.get(24).setElementStatus(ElementStatus.ACTIVE);
        elementsgrid.get(24).setColor(Colors.getColor3());
    }
}
