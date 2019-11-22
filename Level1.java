public class Level1 {

    public static int odometr(int[] oksana){
        int result = 0;
        for( int i = 0; i<oksana.length; i++ ){
            if(i % 2 == 1) continue;
            if( oksana[i] < 0 ) return result;
            else {
                result += oksana[i];
            }
        }
        return result;
    }
}
