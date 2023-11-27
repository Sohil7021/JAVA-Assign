package LCE;

public class Array_Linear_Search {
    public static void main(String[] args) {
        int[] arr = {26,28,19,0,1,2};
        System.out.println(linaer(arr,1,0));

    }
    static boolean linaer(int[] arr, int target, int index) {
        if (index == arr.length - 1) {
            return false;
        }

//        return arr[index] == target || linaer(arr,target,index+1);

        if (arr[index] == target) {
            return true;
        }else {
            return linaer(arr,target,index+1);
        }
    }

}
