import java.util.ArrayList;
import java.util.Collections;

public class Level1 {
    /*public static void main(String[] args) {

        //System.out.println(BiggerGreater("вкиб") + " its end");

        //System.out.println("вкиб".compareTo("ивбк") + " вкиб"); //ибвк

    }*/

    public static String BiggerGreater(String input){
        if(input.length() < 2) return "";

        String[] text = new String[input.length()];
        String first;
        String second;
        String result;

        for (int i = 0; i < text.length - 1 ; i++) {
            first = String.valueOf( input.charAt( (text.length - 1) - i ) );
            second = String.valueOf( input.charAt( (text.length - 2) - i ) );
            result = "";

            for (int j = 0; j < text.length; j++) {
                text[j] = String.valueOf(input.charAt(j));
                System.out.println(text[j] + " text j");
            }

            text[(text.length - 1) - i] = second;
            text[(text.length - 2)  - i] = first;

            for (int j = 0; j < text.length ; j++) {
                result += text[j];
            }
            System.out.println(result + " its result ");

            if(result.compareTo(input) > 0) return result;

        }
        return "";
    }
}

