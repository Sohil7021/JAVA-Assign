public class First_Bad_Version {
    public static void main(String[] args) {

    }
//    static int firstBadVersion(int n) {
//        int start = 0;
//        int end = n;
//        while(start <= end) {
//            int mid = start + (end - start) / 2;
//            if(isBadVersion(mid) == true && isBadVersion(mid - 1) == false) {
//                return mid;
//            } else if (isBadVersion(mid) == false) {
//                start = mid + 1;
//            }else {
//                end = mid;
//            }
//            return -1;
//        }

//    static int firstBadVersion(int n) {
//        int start = 1;
//        int end = n;
//        while (start <= end) {
//            int mid = start + (end - start ) / 2;
//            if (isBadVersion(mid)) {
//                end = mid - 1;
//            }else {
//                start = mid + 1;
//            }
//        }
//        return start;
//    }
    }

