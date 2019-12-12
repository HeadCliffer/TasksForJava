public class Level1 {

    /*public static void main(String[] args) {

        int[][] track = { {3,5,5},{5,2,2} };    //12
        int[][] track2 = { {5,55,5},{15,0,0} };  //60
        int[][] track3 = { {11,5,5},{15,2,2} }; // 10
        int[][] track4 = { {3,6,2},{6,2,2} };   //14
        int[][] track5 = { {1,1,1},{9,12,10} }; // 13
        System.out.println(Unmanned(10,2, track5) + " result in main");

    }*/

    public static int Unmanned(int L, int N, int[][] track){
        int time;
        int totalTime;
        int result = 0;
        int way = 0;
        int colorNow;
        int red;
        int green;
        boolean isGreen;

        if(N > track.length) return 0;

        for (int i = 0; i < L;result++ , i++ ){

            //System.out.println(i + " = I");
            //System.out.println(result + " = result");

            if( i == track[way][0]) {

                //System.out.println("*************************");

                red = track[way][1];
                green = track[way][2];
                colorNow = 0;
                totalTime = 0;
                time = 0;
                isGreen = false;

                while (true) {
                    /*System.out.println(isGreen + " = color in while");
                    System.out.println(totalTime + " = totalTime");
                    System.out.println(result  + " result in while(true)");*/

                    if (totalTime > result){
                        time++;
                        //System.out.println(time + " = time");
                    }

                    //Change color to red
                    if (isGreen && colorNow == green) {
                        isGreen = false;
                        colorNow = 0;
                    }

                    //Change color to green
                    if (!isGreen && colorNow == red) {
                        isGreen = true;
                        colorNow = 0;
                    }

                    if (isGreen && totalTime >= result) {
                        /*System.out.println(totalTime + " = totalTime in break");
                        System.out.println(time + " = time in break");
                        System.out.println(isGreen + " = color in break");
                        System.out.println("***************************");
                        result += time;
                        System.out.println(result + " result in while");*/
                        break;
                    }
                    totalTime++;
                    colorNow++;
                }
                if (way < N - 1) way++;
            }
        }
        return result;
    }
}
