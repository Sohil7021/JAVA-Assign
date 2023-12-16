package GFG;

public class Program_for_Tower_of_Hanoi_Algorithm {
    public static void main(String[] args) {
        int n = 3;
        hanoi(n,'A','C','B');

    }
    static void hanoi(int n,char from_road, char to_road, char aux_road) {
        if (n == 0) {
            return;
        }
//            A - C - B
        hanoi(n-1,from_road,aux_road,to_road);
        System.out.println("Move disk " + n + " from road" + from_road + " to road" + to_road);
//        B - C - A
        hanoi(n-1,aux_road,to_road,from_road);
    }
}
