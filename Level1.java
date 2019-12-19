import java.util.ArrayList;
import java.util.Collections;

public class Level1  {
    /*public static void main(String[] args) {

        String[] items = { "платье1 12",
                "сумка32 800",
                "платье1 3",
                "сумка23 6",
                "сумка128 100000"};

        //for(int i = 0; i< items.length; i++) {
            System.out.println( ShopOLAP(items.length, items) );
        //}
    }*/

    public static String[] ShopOLAP(int N, String[] items) {
        ArrayList<String> list = new ArrayList<>();
        ArrayList<Integer> prices = new ArrayList<>();
        ArrayList<String> itemList = new ArrayList<>();
        String itemWithoutPrice = "";
        String s;
        int count = 0;
        int sum;
        int section = 0;

        for (int i = 0; i < N; i++) {
            list.add(items[i]);
        }

        Collections.sort(list);

        //Get only item name and substring number (section).
        for (int i = 0; i < list.size(); i++) {
            s = list.get(i);
            for (int j = 1; j < s.length() ; j++) {
                if(s.charAt(j) == ' '){
                    j++;
                    itemWithoutPrice = s.substring(0, j);
                    section = j;
                    break;
                }
            }

            //Unit numbers from same items
            sum = Integer.parseInt(s.substring(section));
            for (int j = i + 1; j < list.size(); j++) {

                if(list.get(j).substring(0, section).equals(itemWithoutPrice)){
                    sum += Integer.parseInt(list.get(j).substring(section));
                    i++;
                }
                else break;

            }
            prices.add(sum);
            itemList.add(itemWithoutPrice + sum);
        }

        Collections.sort(prices);
        Collections.reverse(prices);

        String[] result = new String[prices.size()];
        for (int i = 0; i < prices.size(); i++) {
            s = itemList.get(i);
            for (int j = 0; j < s.length(); j++) {

                if(s.charAt(j) == ' '){
                    j++;
                    for (int k = count; k < prices.size(); k++) {

                        if(s.substring(j).equals(String.valueOf(prices.get(k)))
                                && result[k] == null ){
                            result[k] = s.substring(0, j) + prices.get(k);
                            break;
                        }
                    }
                }
            }
        }
        return result;
    }
}
