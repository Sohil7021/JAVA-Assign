package medium;

import java.util.ArrayList;
import java.util.List;

public class Spiral_Matrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {6,7,8}
        };

        List<Integer> result = spiralMatrix(matrix);
        System.out.println(result);
    }
    static List<Integer> spiralMatrix(int[][] matrix) {
        ArrayList<Integer> res = new ArrayList<>();
//        int top = 0;
//        int left = 0;
//        int right = matrix[0].length - 1;
//        int bottom = matrix.length - 1;

        int top = 0;
        int bottom = matrix.length-1;
        int left = 0;
        int right = matrix[0].length-1;

        while(true){
            for(int i = left; i <= right; i++) res.add(matrix[top][i]);
            top++;
            if(left > right || top > bottom) break;

            for(int i = top; i <= bottom; i++) res.add(matrix[i][right]);
            right--;
            if(left > right || top > bottom) break;

            for(int i = right; i >= left; i--) res.add(matrix[bottom][i]);
            bottom--;
            if(left > right || top > bottom) break;

            for(int i = bottom; i >= top; i--) res.add(matrix[i][left]);
            left++;
            if(left > right || top > bottom) break;
        }

        return res;


    }
}
