public class Level1 {

    /*public static void main(String[] args){

        String s = "кук разбивается на набор строк через выравнивание по заданной ширине.";
        WordSearch(12, s, "строк" );

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
                spaceLength = 0;
                arrayCount++;
            }

            if(spaceLength == len) {
                i--;
                sCopy += ln;
                spaceLength = 0;
                arrayCount++;
            }

            else{
                sCopy += ch[i];
            }
            spaceLength++;
        }

        /*System.out.println(sCopy);
        System.out.println(arrayCount);
        System.out.println(arrayNumbers);
        System.out.println("**************");*/

        int[] numbers = new int[arrayCount];
        char[] chCopy = sCopy.toCharArray();
        String word = "";
        int count = 0;

        //Check subs word
        for (int i = 0; i < chCopy.length; i++) {

            if(chCopy[i] == '\n'){
                i++;
                //System.out.println(word);
                if(word.contentEquals(subs)){
                    numbers[count] = 1;
                    count++;
                    word = "";
                }else{
                    count++;
                    word = "";
                }
            }
            if(chCopy[i] == ' ' || i == chCopy.length - 1 ){
                //System.out.println(word);
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
