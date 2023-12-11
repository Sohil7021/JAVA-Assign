package medium;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Set_Matrix_Zeroes {
    public static void main(String[] args) {
        int[][] matrix = {{1,1,1},{1,0,1},{1,1,1}};
        set_zeros2(matrix);
        for (int[] arr : matrix) {
            System.out.println(Arrays.toString(arr));
        }

    }
    static void set_Zeros(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        int[] row = new int[m];
        int[] col = new int[n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==0){
                    row[i]=1;
                    col[j]=1;
                }
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(row[i]==1||col[j]==1){
                    matrix[i][j]=0;
                }
            }
        }

    }


    static void set_zeros2(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        boolean firstRow = false;
        boolean secondCol = false;

//        // Check if the first row has any zero

        for (int j = 0; j < n ; j++) {
            if (matrix[0][j] == 0) {
                firstRow = true;
                break;
            }
        }

        // Check if the first column has any zero
        for (int i = 0; i < m ; i++) {
            if (matrix[i][0] == 0) {
                secondCol = true;
                break;
            }
        }

        // Mark zeros in the first row and column
        for (int i = 1; i < m ; i++) {
            for (int j = 1; j < n ; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        // Set zeros based on marks in the first row and column
        for (int i = 1; i < m ; i++) {
            for (int j = 1; j < n ; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        // Set zeros in the first row if needed
        if (firstRow) {
            for (int j = 0; j < n ; j++) {
                matrix[0][j] = 0;
            }
        }

        if (secondCol) {
            for (int i = 0; i < m ; i++) {
                matrix[i][0] = 0;
            }
        }
    }
}
