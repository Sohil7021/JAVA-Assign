package LCE;

public class Concept_Passing_Number {
    public static void main(String[] args) {
        fun(5);
    }
//    Concept Passing Number
//    n-- VS --n

    static void fun(int n) {
        if(n == 0) {
            return;
        }

        System.out.println(n);
        fun(--n);

    }
}
