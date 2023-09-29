public class Determine_Whether_Matrix_Can_Be_Obtained_By_Rotation {
    public static void main(String[] args) {
        int[][] mat = {
                {0,1},
                {1,0}
        };
        int[][] target = {
                {1,0},
                {0,1}
        };

        boolean result = findRotation(mat,target);
        System.out.println(result);
    }
    static boolean findRotation(int[][] mat,int[][] target) {
       boolean p =true;
       boolean q = true;
       boolean r = true;
       boolean s = true;

        int m = mat.length;
        int n = mat[0].length;
        for (int i = 0; i < mat.length ; i++) {
            for (int j = 0; j < mat.length ; j++) {
                if (mat[i][j] != target[i][j]) {
                    p = false;
                }
                if (mat[i][j] != target[m-1-j][i]) {
                    q = false;
                }

                if (mat[i][j] != target[m-1-i][m-1-j]) {
                    r = false;
                }

                if (mat[i][j] != target[j][m-1-i]) {
                    s = false;
                }

            }
        }
        return p|q|r|s;

    }
}
