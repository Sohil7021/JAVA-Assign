public class Find_the_Highest_Altitude {
    public static void main(String[] args) {
        int[] gain = {-5,1,5,0,-7};
        int result = largestAltitude(gain);
        System.out.println(result);
    }

    static int largestAltitude(int[] gain) {
        int sum = 0;
        int max = 0;
        for (int i = 0; i < gain.length ; i++) {
            sum += gain[i];
            max = Math.max(max,sum);
        }
        return max;
    }
}
