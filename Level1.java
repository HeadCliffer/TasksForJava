public class Level1 {

    /*public static void main(String[] args) {

        System.out.println(BigMinus("1", "21") + " it's result in main"); //819    result is 1181

    }*/

    public static String BigMinus(String s1, String s2) {
        StringBuilder numbers = new StringBuilder();
        String big;
        String small;
        String nums = "";
        int minusFactor = 0;
        int sum;
        int k;
        int l;
        String result = "";

        // Check positive numbers
        if(s1.charAt(0) == '-' || s2.charAt(0) == '-') return "Use ony positive number";


        // Sort big and small numbers ???
        if(s1.length() >= s2.length()){
            big = s1;
            small = s2;
        }else{
            big = s2;
            small = s1;
        }

        //Try do it
        l = 1;
        //System.out.println(small.length());
        while(true){
            sum = 0;
            if( l > small.length() ){
                for (int i = 0; i < big.length() - (l - 1); i++) {

                    nums += big.charAt(i);

                }
                numbers.reverse();


                result = nums + numbers;
                break;
            }

            sum = ( Integer.parseInt( String.valueOf(big.charAt(big.length() - l)) ) - minusFactor )
                    -
                    Integer.parseInt( String.valueOf(small.charAt(small.length() - l)) );

            minusFactor = 0;

            //System.out.println(sum + " its sum");
            //System.out.println(result + " its result");

            if(sum < 0){
              k = 1;
              while(true) {
                  if( l >= big.length() ){
                    sum = -sum;
                    numbers.append(sum);
                    l++;
                    break;
                  }
                  else if (big.charAt((big.length() - l) - k) != '0') {
                      numbers.append( sum + 10 );
                      minusFactor++;
                      l++;
                      //System.out.println(result +  " it's while result");
                      break;

                  } else k++;
              }
            }else{
                numbers.append(sum);
                l++;
            }

        }
        //Delet zeros
        k = 0;
        for(int i = 0; i<result.length(); i++){
            if(result.charAt(i) == '0' && i != result.length()- 1) k++;
            else{
                result = result.substring(k);
                break;
            }
        }
        return result;
    }
}
