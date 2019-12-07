public class Level1 {

    /*public static void main(String[] args) {

        int[] votes = {6,5,3,88,5};
        System.out.println( MassVote(5, votes) );

    }*/

    public static String MassVote(int N, int [] Votes){
        int number = 0;
        double[] results = new double[N];
        double winner = results[0];
        double summary = 0;

        for(int i = 0; i < N; i++){
            summary += Votes[i];
        }

        //find percent of votes and find winner
        for(int i = 0; i < N; i++){
            results[i] = (Votes[i] / summary) * 100;

            //Cut numbers
            for(int j = 0; j < String.valueOf(results[i]).length(); j++){

                    if(String.valueOf(results[i]).charAt(j) == '.' && (j+3) <= String.valueOf(results[i]).length() )
                        results[i] = Double.parseDouble( String.valueOf(results[i]).substring(0,j + 3) );

            }
            //System.out.println(results[i]);

            //Find winner
            if(winner < results[i]){
                winner = results[i];
                number = i + 1;

            }
        }

        //Check results
        for (int i = 0; i < N; i++) {

            if(winner == results[i] && (i + 1) != number) return "no winner";

        }

            if(winner >= 50.0) return "majority winner " + number;
            else return "minority winner " + number;
    }
}
