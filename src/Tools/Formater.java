package Tools;

import java.text.DecimalFormat;

public class Formater {
    public static String idFormater(int value) {
        DecimalFormat dF = new DecimalFormat("0000");
        return dF.format(value);
    }

    public static String eventCodeFormater(int value) {
        DecimalFormat dF = new DecimalFormat("000");
        return dF.format(value);
    }


    public static float backpackWeihgtFormater(float value) {
        DecimalFormat dF = new DecimalFormat("#.###");
        return Float.parseFloat(dF.format(value));
    }

    public static float priceFormater(float value) {
        DecimalFormat dF = new DecimalFormat("#.##");
        return Float.parseFloat(dF.format(value));
    }
}
