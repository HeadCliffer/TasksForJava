public class Level1 {
    public static String PatternUnlock(int N, int [] hits){
        double result = 0.0;
        String resultEnd;
        int[][] map = { {6, 1, 9},
                        {5, 2, 8},
                        {4, 3, 7} };

        if(N < hits.length || N > hits.length) return "Check Array length number."; //Check N number.

        //Check hits and Check right sequence.
        for(int m = 0; m < hits.length - 1; m++) {

            if(hits[m] == map[0][0] && hits[m + 1] == map[0][1] ) result++; //for 6
            else if(hits[m] == map[0][0] && hits[m + 1] == map[1][0]  ) result++;
            else if(hits[m] == map[0][0] && hits[m + 1] == map[1][1] ) result += 1.41421;

            else if(hits[m] == map[1][0] && hits[m + 1] == map[0][0]) result++;//for5
            else if(hits[m] == map[1][0] && hits[m + 1] == map[1][1]) result++;
            else if(hits[m] == map[1][0] && hits[m + 1] == map[2][0]) result++;
            else if(hits[m] == map[1][0] && hits[m + 1] == map[0][1] ) result += 1.41421;
            else if(hits[m] == map[1][0] && hits[m + 1] == map[2][1] ) result += 1.41421;

            else if(hits[m] == map[2][0] && hits[m + 1] == map[2][1] ) result++; //for 4
            else if(hits[m] == map[2][0] && hits[m + 1] == map[1][0]  ) result++;
            else if(hits[m] == map[2][0] && hits[m + 1] == map[1][1] ) result += 1.41421;

            else if(hits[m] == map[0][1] && hits[m + 1] == map[0][0]) result++;//for 1
            else if(hits[m] == map[0][1] && hits[m + 1] == map[1][1]) result++;
            else if(hits[m] == map[0][1] && hits[m + 1] == map[0][2]) result++;
            else if(hits[m] == map[0][1] && hits[m + 1] == map[1][0] ) result += 1.41421;
            else if(hits[m] == map[0][1] && hits[m + 1] == map[1][2] ) result += 1.41421;

            else if(hits[m] == map[1][1] && hits[m + 1] == map[0][1]) result++;//for 2.
            else if(hits[m] == map[1][1] && hits[m + 1] == map[1][2]) result++;
            else if(hits[m] == map[1][1] && hits[m + 1] == map[2][1]) result++;
            else if(hits[m] == map[1][1] && hits[m + 1] == map[1][0]) result++;
            else if(hits[m] == map[1][1] && hits[m + 1] == map[0][0] ) result += 1.41421;
            else if(hits[m] == map[1][1] && hits[m + 1] == map[0][2] ) result += 1.41421;
            else if(hits[m] == map[1][1] && hits[m + 1] == map[2][2] ) result += 1.41421;
            else if(hits[m] == map[1][1] && hits[m + 1] == map[2][0] ) result += 1.41421;

            else if(hits[m] == map[2][1] && hits[m + 1] == map[2][0]) result++;//for 3.
            else if(hits[m] == map[2][1] && hits[m + 1] == map[1][1]) result++;
            else if(hits[m] == map[2][1] && hits[m + 1] == map[2][2]) result++;
            else if(hits[m] == map[2][1] && hits[m + 1] == map[1][0] ) result += 1.41421;
            else if(hits[m] == map[2][1] && hits[m + 1] == map[1][2] ) result += 1.41421;

            else if(hits[m] == map[0][2] && hits[m + 1] == map[0][1]) result++;//for 9.
            else if(hits[m] == map[0][2] && hits[m + 1] == map[1][2]) result++;
            else if(hits[m] == map[0][2] && hits[m + 1] == map[1][1] ) result += 1.41421;

            else if(hits[m] == map[1][2] && hits[m + 1] == map[0][2]) result++;//for 8.
            else if(hits[m] == map[1][2] && hits[m + 1] == map[1][1]) result++;
            else if(hits[m] == map[1][2] && hits[m + 1] == map[2][2]) result++;
            else if(hits[m] == map[1][2] && hits[m + 1] == map[2][1] ) result += 1.41421;
            else if(hits[m] == map[1][2] && hits[m + 1] == map[0][1] ) result += 1.41421;

            else if(hits[m] == map[2][2] && hits[m + 1] == map[2][1]) result++;//for 7.
            else if(hits[m] == map[2][2] && hits[m + 1] == map[1][2]) result++;
            else if(hits[m] == map[2][2] && hits[m + 1] == map[1][1] ) result += 1.41421;
            else return "Check sequence!";
        }
        resultEnd= String.format("%.5f" , result)
                .replace("0", "")
                .replace("." , "")
                .replace(",", "");

        return resultEnd;
    }
}