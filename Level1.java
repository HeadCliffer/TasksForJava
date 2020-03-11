import java.util.ArrayList;
import java.util.Collections;

public class Level1 {
    /*public static void main(String[] args) {

        System.out.println(BiggerGreater("ckib") + " its end"); //ibck //ckib -->ib ck

        //System.out.println("ckib".compareTo("kicb") + " ckib"); //ibck
        //System.out.println("вкиб".compareTo("ибвк") + " вкиб"); //ibck

    }*/

    public static String BiggerGreater(String input) {
        if (input.length() < 2) return "";

        StringBuilder text = new StringBuilder();
        Character smallerWord = input.charAt(0);

        for(int i = 1; i < input.length(); i++){
            if(smallerWord.compareTo(input.charAt(i)) < 0 ){
                smallerWord = input.charAt(i);
            }
        }

        Character needWord = ' ';
        int minCompareNumber = 32;
        for(int i = 0; i < input.length(); i++){
            int comp = smallerWord.compareTo(input.charAt(i));
            if(comp > 0 && comp < minCompareNumber){
                minCompareNumber = smallerWord.compareTo(input.charAt(i));
            }
        }

        for(int i = 0; i < input.length(); i++){
            if(smallerWord.compareTo(input.charAt(i)) == minCompareNumber){
                text.append(input.charAt(i));
                for(int j = 0;  j < input.length(); j++){
                    if(input.charAt(j) != text.charAt(0)){
                        text.append(input.charAt(j));
                    }
                }
                break;
            }
        }
        System.out.println(text.toString());

        return text.toString();
    }
}

