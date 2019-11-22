public class Level1 {
    private static int odometer(int[] oksana){
        int result = 0;
        for( int i = 0; i<oksana.length; i++ ){
            if( oksana[i] < 0 ) return result;
            if(i % 2 == 0) result += oksana[i];
        }
        return result;
    }
}
