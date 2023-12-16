package GFG;

public class Product_of_2_Numbers_using_Recursion {
    public static void main(String[] args) {
        int result = product(5,2);
        System.out.println(result);

    }
    static int product(int x, int y) {
        if (x < y) {
            return product(y,x);
        } else if (y != 0) {
            return (x + product(x,y-1));
        }else {
            return 0;
        }

    }
}
