public class Level1 {

    public static void main(String[] args) {

        System.out.println(LineAnalysis("*.*.*.*.*.*"));

    }

    public static boolean LineAnalysis(String line){
        String pattern;
        int star = 0;

        line.trim();

        //Check start and end stars
        if(line.charAt(0) != '*'
        || line.charAt(line.length() - 1) != '*') return false;

        //Pattern forming
        for(int i = 0; i < line.length(); i++ ){

            if(line.charAt(i) == '*'){
                star++;
            }

            if(star == 2){
                i++;
                pattern = line.substring( 0,i );
                //Check txt with pattern
                try {
                    for (int j = 0; j < line.length() - 1; ) {

                        if (!line.substring(j, i + j).equals(pattern)) return false;
                        j += i - 1;

                    }
                }catch(StringIndexOutOfBoundsException e){
                    return false;
                }
                return true;
            }
        }
        //NotFountStarsException
        return false;
    }

}
