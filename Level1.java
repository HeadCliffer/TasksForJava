public class Level1 {

    /*public static void main(String[] args){

        int[] data = {0,1,0,0,0};
        System.out.println(SumOfThe(5, data) + " Programm end");

    }*/

    public static int SumOfThe(int N, int [] data){
        int sum = 0;
        int result = 0;
        int sumCopy;

        if(N<=0) return data[0];
        // Add all numbers
        for(int i = 0;i<N; i++){
            sum += data[i];
            //System.out.print( sum + " ");
        }

        //Finding right number...
        for(int i = 0; i<N; i++){
            for(int j = 0; j<N; j++){
                sumCopy = sum;
                if( sumCopy - data[i] == data[j]) result = data[j];
                //System.out.println(result);
            }
        }
        return result;
    }

}
