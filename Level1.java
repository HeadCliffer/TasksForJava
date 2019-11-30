import javax.sound.sampled.Line;
import java.util.HashMap;
import java.util.Map;

public class Level1 {

    /*public static void main(String[] args){

        System.out.println(PrintingCosts("123"));

    }*/

    public static int PrintingCosts(String Line){
        int result = 0;
        boolean isOn;

        char[] list = {' ','&',',','2','8','>','D','J','P','V','\\','b','h','n','t','z',
                        '!','\'','-','3','9','?','E','K','Q','W',']','c','i','o','u','{',
                        '"','(','.','4',':','@','F','L','R','X','^','d','j','p','v','|',
                        '#',')','/','5',';','A','G','M','S','Y','_','e','k','q','w','}',
                        '$','*','0','6','<','B','H','N','T','Z','`','f','l','r','x','~',
                        '%','+','1','7','=','C','I','O','U','[','a','g','m','s','y'};

        int[] costs = { 0, 24, 7, 22, 23, 10, 26, 18, 23, 19, 10, 25, 21, 18, 17, 19,
                        9, 3, 7, 23, 26, 15, 26, 21, 31, 26, 18, 17, 15, 20, 17, 18,
                        6, 12, 4, 21, 8, 32, 20, 16, 28, 18, 7, 25, 20, 25, 13, 12,
                        24, 12, 10, 27, 11, 24, 25, 28, 25, 14, 8, 23, 21,25, 19, 18,
                        29, 17, 22, 26, 10, 29, 25, 25, 16, 22, 3, 18, 16, 13, 13, 9,
                        22, 13, 19, 16, 14, 20, 18, 26, 23, 18, 23, 30, 22, 21, 24 };

        //Check all chars and costs
        /*for (int i = 0; i < list.length; i++) {
            System.out.println(list[i] + " " + costs[i]);
        }*/

        //Check costs       else result += 23;
        for (int i = 0; i < Line.length(); i++) {
        isOn = false;
            for(int j = 0; j<list.length; j++){
                if(Line.charAt(i) == list[j]){
                    result += costs[j];
                    isOn = true;
                }
            }
            if(!isOn) result += 23;
        }
        return result;
    }
}

