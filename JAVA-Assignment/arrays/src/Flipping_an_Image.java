import java.util.Arrays;

public class Flipping_an_Image {
    public static void main(String[] args) {
        int[][] image = {
                {1,1,0},
                {1,0,1},
                {0,0,0}
        };

        for (int[] num: flipAndInvertImage2(image)) {
            System.out.println(Arrays.toString(num));
        }
        System.out.println();
    }
    static int[][] flipAndInvertImage(int[][] image) {


        for (int i = 0; i < image.length ; i++) {
            int start = 0;
            int end = image[i].length - 1;
            while (start < end) {
                int temp = image[i][start];
                image[i][start] = image[i][end];
                image[i][end] = temp;
                start++;
                end--;
            }
        }

        for (int i = 0; i < image.length ; i++) {
            for (int j = 0; j < image[i].length ; j++) {
                if (image[i][j] == 0) {
                    image[i][j] = 1;
                }else {
                    image[i][j] = 0;
                }
            }
        }

        return image;


    }

    static int[][] flipAndInvertImage2(int[][] image) {
//        int[][] ans = new int[image.length][image.length];
//        for (int i = 0; i < image.length ; i++) {
//            for (int j = image[i].length-1; j >= 0 ; j--) {
//                ans[i][image[i].length-1-j] = image[i][j];
//            }
//        }
//
//        for (int[] a: ans) {
//            for (int i = 0; i < ans.length ; i++) {
//                if (a[i] == 0) {
//                    a[i] = 1;
//                }else {
//                    a[i] = 0;
//                }
//            }
//        }
//        return ans;


        int c = image[0].length;
        for(int[] row: image){
            for(int i=0;i< (c+1)/2;i++) {
                int temp = row[i] ^ 1;
                row[i] = row[c-1-i] ^ 1;
                row[c-1-i] = temp;
            }
        }
        return image;
    }
}
