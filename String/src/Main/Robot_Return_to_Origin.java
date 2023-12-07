package Main;

public class Robot_Return_to_Origin {
    public static void main(String[] args) {
       String moves = "UD";
       boolean result = judgeCircle(moves);
        System.out.println(result);
    }
    static boolean judgeCircle(String move) {
        int x = 0;
        int y = 0;
        for (char moves : move.toCharArray()) {
            if (moves == 'U') y--;
            else if (moves == 'D') y++;
            else if (moves == 'L') x--;
            else if (moves == 'R') x++;
        }
        return x == 0 && y == 0;

    }
}
