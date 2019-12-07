public class Level1 {

    /*public static void main(String[] args) {
        int[] data = {1137, 2748};
        System.out.println( UFO(2,data, false) );
    }*/
    public static int[] UFO(int N, int [] data, boolean octal){
        int system;
        int[] result = new int[N];
        int k;

        if(octal) system = 8;
        else system = 16;
            for (int i = 0; i < N; i++) {
            k = String.valueOf(data[i]).length() - 1;
                for (int j = 0; j < String.valueOf(data[i]).length(); j++) {

                    result[i] += Integer.parseInt(String.valueOf(String.valueOf(data[i]).charAt(j)))
                                * (int) Math.pow(system, k);
                    k--;

                }
            }
        return result;
    }
}
