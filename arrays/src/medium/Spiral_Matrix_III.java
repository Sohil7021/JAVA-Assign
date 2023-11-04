package medium;

import java.util.Arrays;

public class Spiral_Matrix_III {
    public static void main(String[] args) {
        int[][] arr = spiralMatrix3(1,4,0,0);
        for (int[] i: arr) {
            System.out.println(Arrays.toString(i));
        }

    }
    static int[][] spiralMatrix3(int row,int col,int r0,int c0) {
        int[][] result = new int[row * col][2];
        int[][] direction = {
                {0,1}, // right
                {1,0}, // down
                {0,-1}, // left
                {-1,0} //up
        };

        int length = 0;
        int directionIndex = 0;
        int r = r0;
        int c = c0;
        int step = 1;
        result[0] = new int[] {r,c};

        while (step < row * col) {
            if (directionIndex == 0 || directionIndex == 2) {
                length++;
            }

            for (int i = 0; i < length ; i++) {
                r += direction[directionIndex][0];
                c += direction[directionIndex][1];

                if (r >= 0 && r < row && c >= 0 && c < col) {
                    result[step] = new int[] {r,c};
                    step++;
                }

            }
            directionIndex = (directionIndex + 1) % 4;
        }
        return result;
    }
}
