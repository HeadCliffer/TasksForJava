public class Level1 {
    public static int odometer(int[] oksana) {
        int result = 0;
        int hours = 0;
        for (int i = 0; i < oksana.length; i++) {
            if (oksana[i] < 0) return result;
            if(i % 2 == 1){
                result += oksana[i-1]*(oksana[i] - hours);
                hours += oksana[i] - hours;
            }
        }
        return result;
    }
}
