import java.util.ArrayList;
import java.util.Collections;

public class Level1 {

    public static void main(String[] args) {

        int[] price = { 100,200,300,200,500,350,400,500,200,6000,50405,3231 };
        System.out.println(MaximumDiscount( price.length, price) );
        System.out.println(price.length + " price Length is main");

    }

    public static int MaximumDiscount( int N, int [] price ){
        ArrayList<Integer> list = new ArrayList<>(N);
        int h = 1;
        int result = 0;

        for (int i = 0; i < N ; i++) {
            list.add(price[i]);
        }

        Collections.sort(list, Collections.reverseOrder());

        /*for(int r : list){
            System.out.print(r + " ");
        }*/

        for(int k : list){

            if(h % 3 == 0){
                result += k;
            }
            h++;

        }
        return result;
    }
}
