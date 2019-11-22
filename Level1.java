public class Level1 {

    public static void main(String[] args){
        int[] speed = {10,1,20,2};
        System.out.println(odometer(speed));

    }
    private static int odometer(int[] oksana){
        int result = 0;
        for( int i = 0; i<oksana.length; i++ ){
            if( oksana[i] < 0 ) return result;
            if(i % 2 == 0) result += oksana[i];
        }
        return result;
    }
}
