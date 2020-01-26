package utilites;

public class Colors {

    public final static String color_black="#000000";
    public final static String freezed_color = "#000000";
    private static String default_color;
    public static void setDefault(String color){
        if(color.equals("COLOR1")){
            default_color=basiccolor1;
        }else if (color.equals("COLOR2")){
            default_color=basiccolor2;
        }else if (color.equals("COLOR3")){
            default_color=basiccolor3;
        }
        else if (color.equals("COLOR4")){
            default_color=basiccolor4;
        }else if (color.equals("COLOR5")){
            default_color=basiccolor5;
        }
    }
    private static String color1;
    public static void setColor1(String color){
        switch (color) {
            case "COLOR1":
                color1 = color11;
                break;
            case "COLOR2":
                color1 = color12;
                break;
            case "COLOR3":
                color1 = color13;
                break;
            case "COLOR4":
                color1 = color14;
                break;
            case "COLOR5":
                color1 = color15;
                break;
        }
    }

    private static String color2;
    public static void setColor2(String color){
        switch (color) {
            case "COLOR1":
                color2 = color21;
                break;
            case "COLOR2":
                color2 = color22;
                break;
            case "COLOR3":
                color2 = color23;
                break;
            case "COLOR4":
                color2 = color24;
                break;
            case "COLOR5":
                color2 = color25;
                break;
        }
    }
    private static String color3;
    public static void setColor3(String color){
        switch (color) {
            case "COLOR1":
                color3 = color31;
                break;
            case "COLOR2":
                color3 = color32;
                break;
            case "COLOR3":
                color3 = color33;
                break;
            case "COLOR4":
                color3 = color34;
                break;
            case "COLOR5":
                color3 = color35;
                break;
        }
    }

    public static String getDefault_color() {
        return default_color;
    }

    public static String getColor1() {
        return color1;
    }

    public static String getColor2() {
        return color2;
    }

    public static String getColor3() {
        return color3;
    }

    public final static String basiccolor1 = "#BBB5B3";
    public final static String basiccolor2 = "#EBFDDC";
    public final static String basiccolor3 = "#FCF9F7";
    public final static String basiccolor4 = "#B1B5C9";
    public final static String basiccolor5 = "#9EA1B0";




    public final static String color11 = "#D2691E";
    public final static String color12 = "#8B4513";
    public final static String color13 = "#A0522D";
    public final static String color14 = "#A52A2A";
    public final static String color15 = "#800000";


    public final static String color21 = "#0000FF";
    public final static String color22 = "#0000CD";
    public final static String color23 = "#00008B";
    public final static String color24 = "#000080";
    public final static String color25 = "#191970";

    public final static String color31 = "#FFE4B5";
    public final static String color32 = "#FFDAB9";
    public final static String color33 = "#EEE8AA";
    public final static String color34 = "#F0E68C";
    public final static String color35 = "#BDB76B";



}
