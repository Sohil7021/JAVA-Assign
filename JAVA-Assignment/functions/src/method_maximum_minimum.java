import java.util.Scanner;

public class method_maximum_minimum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the num1:- ");
        int num1 = in.nextInt();
        System.out.print("Enter the num2:-  ");
        int num2 = in.nextInt();
        System.out.print("Enter the num3:- ");
        int num3 = in.nextInt();

        int ans = large(num1,num2,num3);
        System.out.println("The max num is:- " + ans);

        int minAns = small(num1,num2,num3);
        System.out.println("The min num is:- " + minAns);


//        int ans = large(65,98,2);
//        System.out.println("The max num is:- " + ans);
//
//        int ans1 = small(4,3,2);
//        System.out.println("The min number is:- " + ans1);
    }

    static int large(int a,int b,int c) {

//        Optimize solution using math function

        return Math.max(Math.max(a,b),c);


//        int max = a;
//        if (b > max) {
//            max = b;
//        }else if (c > max){
//            max = c;
//        }
//
//        return max;
    }

    static int small(int a, int b, int c) {



        //        Optimize solution using math function

                  return Math.min(Math.min(a,b),c);

//        int min = a;
//        if (b < min) {
//            min = b;
//        }else if (c < min){
//            min = c;
//        }
//
//        return min;
    }
}
