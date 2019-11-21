
import java.math.BigInteger;
import java.util.*;
public static class main ( String[] args){

        int crackedNuts = squirrel(2);


        }
public class Level1 {
    private static BigInteger factorial = BigInteger.valueOf(1);

    public static int squirrel(int N) {
        if(N==0) return 1; // 0! = 1;
        else{
            for( int i = 1; i<=N; i++ ) {
                factorial = factorial.multiply(BigInteger.valueOf(i));
                System.out.println(factorial);
            }
            char[] emeralds = factorial.toString().toCharArray();
            System.out.println(emeralds[0]);
            return Integer.parseInt(String.valueOf(emeralds[0]));
        }
    }
}


