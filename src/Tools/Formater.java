package Tools;

import java.text.DecimalFormat;

public class Formater {
    public static String idFormater(short value){
        DecimalFormat dF = new DecimalFormat( "0000" );
        String id = dF.format(value);
        return id;
    }

    public static float backpackWeihgtFormater(float value){
        DecimalFormat dF = new DecimalFormat( "#.###" );
        float weight = Float.parseFloat(dF.format(value));
        return weight;
    }

    public static float priceFormater(float value){
        DecimalFormat dF = new DecimalFormat( "#.##" );
        float price = Float.parseFloat(dF.format(value));
        return price;
    }
}
