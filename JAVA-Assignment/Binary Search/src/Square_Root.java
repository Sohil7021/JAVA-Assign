public class Square_Root {
    public static void main(String[] args) {
        int x = 8;
        int result = mySqrt(x);
        System.out.println(result);

    }
    static int mySqrt(int x) {
        int r = x;
        while (r*r > x) {
            r = (r + x/r) / 2;

        }
        return (int) r;
    }

    static  int mySqrt2(int x) {
        int start = 1;
        int end = x;
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(mid == x / mid) {
                return mid;
            }else if(mid < x/mid) {
                start = mid + 1;
            }else {
                end = mid - 1;
            }
        }
        return end;

    }
}
