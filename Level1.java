import java.math.BigInteger;

public class Level1 {
    public static BigInteger factorial = BigInteger.ONE;

    public static int squirrel(int N) {
        if(N==0) return 1; // 0! = 1;
        else{
            for( int i = 1; i<=N; i++ ) {
                factorial = factorial.multiply(BigInteger.valueOf(i));
            }
            char[] emeralds = factorial.toString().toCharArray();

            return Integer.parseInt(String.valueOf(emeralds[0]));
        }
    }
}


