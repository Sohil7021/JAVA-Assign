package LCE;

import java.util.ArrayList;

public class Array_Linear_Search_Multiple {
    public static void main(String[] args) {
        int[] arr = {26,28,19,0,1,1};
       ArrayList<Integer> result = findAllIndexall(arr,1,0);
        System.out.println(result);
    }

    static void linaer(int[] arr, int target, int index) {

        if (index == arr.length - 1) {
            return ;
        }

//        return arr[index] == target || linaer(arr,target,index+1);

        if (arr[index] == target) {
//            list.add(index);
        }else {
             linaer(arr,target,index+1);
        }
    }


    static ArrayList<Integer> findAllIndex(int[] arr, int target, int index, ArrayList<Integer> list) {
        if (index == arr.length ) {
            return list;
        }

        if (arr[index] == target) {
            list.add(index);
        }
        return findAllIndex(arr,target,index+1,list);
    }



    static ArrayList<Integer> findAllIndexall(int[] arr, int target, int index) {
         ArrayList<Integer> list = new ArrayList<>();
        if (index == arr.length ) {
            return list;
        }

        if (arr[index] == target) {
            list.add(index);
        }
        ArrayList<Integer> ans = findAllIndexall(arr,target,index+1);
        list.addAll(ans);
        return list;
    }
}
