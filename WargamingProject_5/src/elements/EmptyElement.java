package elements;

import utilites.Colors;
import utilites.ElementStatus;

public class EmptyElement extends BasicElement {

    public EmptyElement() {
        super(Colors.getDefault_color(), ElementStatus.EMPTY);
    }
}
