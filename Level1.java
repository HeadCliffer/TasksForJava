import java.util.ArrayList;
import java.util.Collections;

public class Level1 {
    public static void main(String[] args) {

        //System.out.println(BiggerGreater("ckib") + " its end"); //ibck //ckib -->ib ck

        //System.out.println("ckib".compareTo("kicb") + " ckib"); //ibck
        //System.out.println("вкиб".compareTo("ибвк") + " вкиб"); //ibck
        //System.out.println(BiggerGreater("zaz"));

    }

    public static String BiggerGreater(String input) {
        if (input.length() < 2) return "";
        Character biggerWord = input.charAt(0);
        if(input.length() == 2){
            if(biggerWord.compareTo(input.charAt(1)) > 0) return "";
        }

        StringBuilder text = new StringBuilder();
        //Find bigger word
        for(int i = 1; i < input.length(); i++){
            if(biggerWord.compareTo(input.charAt(i)) < 0 ){
                biggerWord = input.charAt(i);
            }
        }
        //System.out.println(biggerWord);
        //Find minimal number from compareTo
        int minCompareNumber = 32;
        int arrayNumber = 0;
        for(int i = 0; i < input.length(); i++){
            int comp = biggerWord.compareTo(input.charAt(i));
            if(comp >= 0 && comp < minCompareNumber){
                minCompareNumber = comp;
                arrayNumber = i;
            }
        }

        //System.out.println(arrayNumber);
        //Init text
        for(int i = 0; i < input.length(); i++){
            if(biggerWord.compareTo(input.charAt(i)) == minCompareNumber){
                text.append(input.charAt(i));
                for(int j = 0;  j < input.length(); j++){
                    //if(input.charAt(j) != text.charAt(0)){
                    if(j != arrayNumber){
                        text.append(input.charAt(j));
                    }
                }
                break;
            }
        }
        return text.toString();
    }
}

