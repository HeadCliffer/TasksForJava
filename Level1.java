import java.util.*;

public class Level1 {
    public static int [] SynchronizingTables(int N, int [] ids, int [] salary){
        List<Integer> idsCopy = new ArrayList<>();
        List<Integer> salaryCopy = new ArrayList<>();
        int[] result = new int[N];

        if( N != ids.length || N != salary.length ) return result;
        //Copy arrays into lists
        for(int i = 0; i<N; i++){
            idsCopy.add(ids[i]);
            salaryCopy.add(salary[i]);
        }
        //Sort Arrays
        Collections.sort(idsCopy); // both haves one index
        Collections.sort(salaryCopy);

        //Sort salary
        for(int i = 0; i<N; i++){
            for( int j = 0; j<N; j++ ){
                if( idsCopy.get(i) == ids[j] ){
                    result[j] = salaryCopy.get(i);
                }
            }
        }
        return result;
    }
}