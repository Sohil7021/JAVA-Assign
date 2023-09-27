public class Cells_with_Odd_Values_in_a_Matrix {
    public static void main(String[] args) {
        int[][] indices = new int[0][0];




    }

    static int oddCell(int m,int n, int[][] indices) {
        int count = 0;
        int[] row = new int[m];
        int[] col = new int[n];

        for (int x[]: indices) {
            row[x[0]]++;
            col[x[0]]++;


        }

        for (int i = 0; i < m ; i++) {
            for (int j = 0; j < n  ; j++) {
                if (row[i]+col[j] % 2 != 0) {
                    count++;
                }
            }
        }
        return count;
    }
}
