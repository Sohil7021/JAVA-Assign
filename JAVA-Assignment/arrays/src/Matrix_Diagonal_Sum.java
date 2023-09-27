public class Matrix_Diagonal_Sum {
    public static void main(String[] args) {
        int[][] mat = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        int result = diagonalSum2(mat);
        System.out.println(result);
    }
    static int diagonalSum(int[][] mat) {
        int n = mat.length;
        int sum = 0;

        for (int i = 0; i < n ; i++) {
            sum += mat[i][i];

            sum += mat[n-1-i][i];
        }

        if (n % 2 != 0) {
            sum -= mat[n/2][n/2];
        }
        return sum;
    }

    static  int diagonalSum2(int[][] mat) {
        int sum = 0;
        int n =  mat.length;
        for (int i = 0; i < n ; i++) {
            sum += (mat[i][i] + mat[i][n-i-1]);
        }

        if (n % 2 == 0) {
            return sum;
        } else {
            return sum -= mat[n/2][n/2];
        }

    }
}
