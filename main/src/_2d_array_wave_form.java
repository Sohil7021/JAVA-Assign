public class _2d_array_wave_form {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        array(arr);
    }
    static void array(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j <arr[i].length  ; j++) {
                if (j % 2 == 0) {
                    System.out.println(arr[i][j]);
                }else {
                    for (int k = arr.length - 1;  k >= 0 ; k--) {
                        System.out.println(arr[i][j]);
                    }
                }
            }
        }
    }
}
