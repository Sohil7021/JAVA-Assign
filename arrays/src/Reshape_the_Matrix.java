import java.util.Arrays;

public class Reshape_the_Matrix {
    public static void main(String[] args) {
        int[][] mat = {
                {1,2},
                {3,4}


        };

        int[][] result = matrixReshape(mat,1,4);
        for (int[] a: result) {
            System.out.println(Arrays.toString(a));
        }
    }
    static  int[][] matrixReshape(int[][] mat,int r,int c) {
        int[][] ans = new int[r][c];

        int rows = mat.length;
        int cols = mat[0].length;

        if ((rows * cols) != (r*c)) {
            return mat;
        }

        int ansRows = 0;
        int ansCols = 0;

        for (int i = 0; i < rows ; i++) {
            for (int j = 0; j < cols ; j++) {
                ans[ansRows][ansCols] = mat[i][j];
                ansCols++;


                if (ansCols == c) {
                    ansCols = 0;
                    ansRows++;
                }
            }
        }
        return ans;



    }
}
