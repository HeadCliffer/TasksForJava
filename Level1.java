import java.math.BigInteger;

public class Level1 {
    public static BigInteger factorial = BigInteger.ONE;

    public static int squirrel(int N) {
        if(N<0) return Integer.parseInt(null);
        if( N==0 || N==1 ) return 1; // 0! = 1;
        else{
            for( int i = 2; i<=N; i++ ) {
                factorial = factorial.multiply(BigInteger.valueOf(i));
                System.out.println(factorial);
            }
            return Integer.parseInt( String.valueOf( factorial.toString().charAt(0) ));
        }
    }
}


