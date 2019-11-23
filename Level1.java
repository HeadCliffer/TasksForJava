public class Level1 {
    public static int ConquestCampaign(int N, int M, int L, int[] battalion) {
        int js = 1;
        int[][] country = new int[N][M];
        int[][] countryCopy = new int[N][M];
        int dayCount = 0;
        int territoryCount = 0;
        boolean isCaptured = false;
        //Check right arguments
        if (L * 2 > battalion.length || L < 1) return 0;
        //Load battalion
        for (int i = 0; i < L * 2; i += 2) {
            country[battalion[i] - 1][battalion[js] - 1] = 1;
            js += 2;
        }
        dayCount++;
        //Capture country
        while (!isCaptured) {
            if (territoryCount == (N * M)) {
                isCaptured = true;
            }else{
                    for (int i = 0; i < N; i++) {
                        for (int j = 0; j < M; j++) {
                            if (i < N  - 1 && country[i][j] == 1) { // Down
                                countryCopy[i + 1][j] = 1;
                            }
                            if (i > 0 && country[i][j] == 1) { //Up
                                countryCopy[i - 1][j] = 1;
                            }
                            if (j < M - 1 && country[i][j] == 1) { //Right
                                countryCopy[i][j + 1] = 1;
                            }
                            if (j > 0 && country[i][j] == 1) { // Left
                                countryCopy[i][j - 1] = 1;
                            }
                        }
                    }

                    for (int i = 0; i < N; i++) {  //Copy Country from countryCopy
                        for (int j = 0; j < M; j++) {
                            if( countryCopy[i][j] == 1) country[i][j] = countryCopy[i][j];
                        }
                    }

                    territoryCount = 0;
                    for(int i = 0; i < N; i++ ){ //checkTerritoryCount
                        for(int j = 0; j < M; j++){
                            if( country[i][j] == 1 ) territoryCount++;
                        }
                    }
                    dayCount++;
            }// else point
        }
        return dayCount;
    }
}