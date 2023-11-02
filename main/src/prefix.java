public class prefix {
    public static void main(String[] args) {
//        CA Prefix
//        Kadane's Algorithm
        int[] arr = {1,2,3,-2,5};
        long result = kadane(arr);
        System.out.println(result);


    }
    static long kadane(int[] arr) {
        long max = Integer.MIN_VALUE;
        long prefix = 0;
        for (int i = 0; i < arr.length ; i++) {
            prefix += arr[i];
            max = Math.max(max,prefix);
            if (prefix < 0) {
                prefix = 0;
            }
        }
        return max;
    }

}
