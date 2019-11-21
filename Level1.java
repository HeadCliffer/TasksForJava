import java.math.BigInteger;

public class Level1 {
    public static int squirrel(int N) {
        BigInteger factorial = BigInteger.ONE;
        if( N < 0 ) return Integer.parseInt(null);
        else if( N == 0) return 1;
        else{
            for( int i = 1; i<=N; i++ ) {
                factorial = factorial.multiply(BigInteger.valueOf(i));
            }
            return Integer.parseInt( String.valueOf( factorial.toString().charAt(0) ));
        }
    }
}


