public class Level1 {

    /*public static void main(String[] args) {

        int[][] track = { {3,5,5},{5,2,2} };    //12
        int[][] track2 = { {5,55,5} };  //60
        int[][] track3 = { {11,5,5},{15,2,2} }; // 10
        System.out.println(Unmanned(10,1, track2));

    }*/

    public static int Unmanned(int L, int N, int[][] track){
        int meters = 0;
        int totalTime;
        int result = 0;
        int way = 0;
        int colorNow;
        int red;
        int green;
        boolean isGreen;

        if(N > track.length) return 0;

        for (int i = 0; i < L; i++, result++, meters++){

            if( i == track[way][0]) {

                red = track[way][1];
                green = track[way][2];
                colorNow = 0;
                totalTime = 0;
                isGreen = false;

                while (true) {

                    if (isGreen && totalTime >= meters) {
                        meters++;
                        break;
                    }

                    if (colorNow == red) {

                        isGreen = true;
                        colorNow = 0;

                    } else {
                        totalTime++;
                        colorNow++;
                    }

                    if (isGreen && colorNow == green) {
                        isGreen = false;
                        colorNow = 0;
                    }

                    if (!isGreen && totalTime > meters){
                        result++;
                    }

                }
                if (way < N - 1) way++;
            }

        }
        return result;
    }
}
