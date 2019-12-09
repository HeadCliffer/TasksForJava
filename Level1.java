public class Level1 {

    /*public static void main(String[] args) {

        int[][] track = { {3,5,5},{5,2,2}, {10,9,9} };

        System.out.println(Unmanned(10,3,track));

    }*/

    public static int Unmanned(int L, int N, int[][] track){
        int meters = 0;
        int totalTime;
        int result = 0;
        int way = 0;
        int colorNow;
        int red;
        int green;
        boolean isGreen = false;

        if(N != track.length) return 0;

        for (int i = 0; i < L; i++){
            if( i == track[way][0]) {

                red = track[way][1];
                green = track[way][2];
                colorNow = 0;
                totalTime = 0;
                isGreen = false;

                while (true) {

                    if (isGreen && totalTime >= meters) {

                        System.out.println(result + "its RESULT");
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

                    if (!isGreen && totalTime > meters) result++;

                }

                if (way < N - 1) way++;

            }else{
                result++;
                meters++;
            }
        }
        return result;
    }
}
