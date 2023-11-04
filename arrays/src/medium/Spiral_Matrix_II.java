package medium;

import java.util.Arrays;

public class Spiral_Matrix_II {
    public static void main(String[] args) {
        int[][] arr = generateMatrix(3);
        for (int[] i : arr) {
            System.out.println(Arrays.toString(i));
        }

    }
    static int[][] generateMatrix(int n) {
        int[][] arr = new int[n][n];
        int num = 1;
        int top = 0;
        int bottom = n - 1;
        int left = 0;
        int right = n - 1;
        while(left <= right || top <= bottom) {
            for(int i=left;i<=right;i++) {
                arr[top][i] = num++;
            }
            top++;


            for(int i=top;i<=bottom;i++) {
                arr[i][right] = num++;
            }
            right--;


            if(top <= bottom) {
                for(int i=right; i>=left;i--) {
                    arr[bottom][i] = num++;
                }
                bottom --;
            }

            if(left <= right) {
                for(int i=bottom;i>=top;i--) {
                    arr[i][left] = num++;
                }
                left++;
            }
        }
        return arr;
    }
}
