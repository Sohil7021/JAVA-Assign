import java.util.Arrays;

public class CA_Aggressive_Cows {
    public static void main(String[] args) {
        int[] arr = {10,1,2,7,5};
        System.out.println(cows(arr,3));
    }
    static int cows(int[] arr, int k) {
        int n = arr.length;
        Arrays.sort(arr);
        int start = 1;
        int end = arr[n-1] - arr[0];
        int ans = 0;
        // first Sort in increasing order
        // important ------- *********************-----------------
        // min distance with max value


        while(start <= end) {
            int mid  = start + (end - start) / 2;
            int count = 1;
            int pos = arr[0];
            for(int i=1;i<n;i++) {
                if(pos+mid <= arr[i]) {
                    count++;
                    pos = arr[i];
                }
            }

            if(count < k) {
                end = mid - 1;
            }else {
                ans = mid;
                start = mid + 1;
            }

        }
        return ans;

    }
}
