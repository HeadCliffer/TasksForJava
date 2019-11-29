public class Level1 {

    /*public static void main(String[] args){

        String ts = "123456789";
        String s = Level1.TheRabbitsFoot(ts, true);
        System.out.println(s);
        s = Level1.TheRabbitsFoot(s, false);
        System.out.println(s);
        if(s.equals("123456789") ) System.out.println("Yes");
        else System.out.println("No");
        System.out.println(s.length());

        for(int i = 0; i<s.length(); i++){

            System.out.print(s.charAt(i));

        }
    }*/

    public static String TheRabbitsFoot(String s, boolean encode){
        String result = "";
        int splitCount = 0;
        String split = "";

        //Second var
        char[] ch = s.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if(ch[i] == ' ') i++;
            split += ch[i];
        }

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
            //Encryption String
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix.length; j++) {

                    result += matrix[j][i];

                }

                if(i != matrix.length - 1) result += " ";
            }
            return result.trim();

        }else {
            //Decryption String
                for (int i = 0; i < matrix.length; i++) {
                    for (int j = 0; j < matrix.length; j++) {
                        result += matrix[j][i];
                    }
                }
            }

        return result.trim();
    }
}
