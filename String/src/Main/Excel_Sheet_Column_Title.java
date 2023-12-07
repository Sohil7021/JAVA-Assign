package Main;

public class Excel_Sheet_Column_Title {
    public static void main(String[] args) {
        int columnNumber = 1;
        String result = title(columnNumber);
        System.out.println(result);
    }
    static String title(int col) {
        StringBuilder ans = new StringBuilder();

        while (col > 0) {
            col--;

            ans.append((char)((col) % 26 + 'A'));
            col = (col) / 26;
        }

        return ans.reverse().toString();

    }
}
