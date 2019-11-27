public class Level1 {

    /*public static void main(String[] args){

        String s = "строка разбивается на набор строк через выравнивание по заданной ширине.";
        WordSearch(2, "1 2 3 4 5 6789", "678" );

    }*/

    public static int [] WordSearch(int len, String s, String subs){
        int spaceLength = 0;
        int arrayCount = 1;
        String arrayNumbers = "";
        String sCopy = "";
        String ln = "\n";
        char[] ch = s.trim().toLowerCase().toCharArray();

        // add \n
        for(int i = 0; i<ch.length; i++) {

            if(ch[i] == ' '  && spaceLength >= len/2 ) {
                i++;
                sCopy += ln;
                spaceLength = -1;
                arrayCount++;
            }

            if(spaceLength == len) {
                i--;
                sCopy += ln;
                spaceLength = -1;
                arrayCount++;
            }

            else{
                sCopy += ch[i];
                //System.out.println(sCopy + " is sCopy");
            }
            spaceLength++;
        }

        /*System.out.println(sCopy);
        System.out.println(arrayCount);
        System.out.println(arrayNumbers);
        System.out.println("**************");
         */

        int[] numbers = new int[arrayCount];
        char[] chCopy = sCopy.toCharArray();
        String word = "";
        int count = 0;

        //Check subs word
        for (int i = 0; i < chCopy.length; i++) {

            if(chCopy[i] == '\n'){
                i++;
                System.out.println(word);
                if(word.contentEquals(subs)){
                    numbers[count] = 1;
                    count++;
                    word = "";
                }else{
                    count++;
                    word = "";
                }
            }
            if(chCopy[i] == ' ' ){
                i++;
        //        System.out.println(word);
                if(word.contentEquals(subs)) {      //Don't need count++ , because check  words on one String.
                    numbers[count] = 1;
                    word = "";
                }else word = "";
            }
            if(i == chCopy.length - 1 ){        //Check end of String.length.
                word += chCopy[i];
          //      System.out.println(word);
                if(word.contentEquals(subs)) {
                    numbers[count] = 1;
                    word = "";
                }else word = "";

            }
            else word += chCopy[i];
        }

        /*for (int i = 0; i <numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }*/

        return numbers;
    }
}
