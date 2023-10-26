public class split_array {
    public static void main(String[] args) {
        int[] arr = {7,2,5,10,8};
        System.out.println(split_array(arr,2));

    }
    static int  split_array(int[] arr,int k) {
        int start = 0;
        int end = 0;
        int ans = 0;

        for(int i=0;i<arr.length;i++) {
            start = Math.max(start,arr[i]);
            end += arr[i];
        }

        while (start <= end) {
            int mid = start + (end - start) / 2;
            int sum = 0;
            int count = 1;

            for (int i = 0; i < arr.length ; i++) {
                sum += arr[i];
                if (sum > mid) {
                    count++;
                    sum = arr[i];
                }

            }

            if (count <= k) {
                ans = mid;
                end = mid - 1;
            }else {
                start = mid + 1;
            }
        }
        return ans;
    }
}
