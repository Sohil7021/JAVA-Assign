public class _2d_array_count_zeros_on_sorted {
    public static void main(String[] args) {
        int[][] arr = {
                {0,0,0},
                {0,0,1},
                {0,1,1}
        };
        int result = countZeros(arr);
        System.out.println(result);
    }
    static int countZeros(int[][] arr) {
      int n = arr.length;
      int row = 0;
      int col = n -1;
       int count = 0;
       while(row < arr.length && col >= 0) {
           if(arr[row][col] == 0) {
               count += col + 1;
               row++;
           }else {
               col--;
           }
       }
       return count;

    }
}
