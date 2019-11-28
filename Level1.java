public class Level1 {

    /*public static void main(String[] args){

        String s = "отдай мою кроличью лапку";
        String text = TheRabbitsFoot(s, true );
        System.out.println(text);
        text = TheRabbitsFoot(text, false );
        System.out.println(text);

    }*/

    public static String TheRabbitsFoot(String s, boolean encode){
        String result = "";
        int splitCount = 0;
        String split;
        //Delete space.
        split = s.replaceAll(" ", "");

        //Get squareRoot and round number.
        double squareRoot = Math.round(Math.sqrt(split.length()));
        if( squareRoot * squareRoot < split.length()) squareRoot++;

        //Set to int and create matrix
        char[][] matrix = new char[(int)squareRoot][(int)squareRoot];

        //Init matrix
        for (int i = 0; i < squareRoot; i++) {
            for (int j = 0; j < squareRoot; j++) {
                if(splitCount == split.length()) break;
                matrix[i][j] = split.charAt( splitCount );
                splitCount++;
            }
        }
        if(encode) {
            //Encryption and Decryption String
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix.length; j++) {

                    result += matrix[j][i];

                }
                result += " ";
            }
        }else{
            //Decryption String
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix.length ; j++) {
                    result += matrix[j][i];
                }
            }
        }
        return result;
    }
}
