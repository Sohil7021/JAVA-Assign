public class Minimum_Cost_to_Move_Chips_to_The_Same_Position {
    public static void main(String[] args) {

        int[] position = {1,2,3};
        int result = minCostToMoveChip(position);
        System.out.println(result);

    }

    static int minCostToMoveChip(int[] chips) {
        int even = 0;
        int odd = 0;
        for(int i : chips) {
            if (i % 2 == 0) {
                even++;
            }else {
                odd++;
            }
        }
        return Math.min(even,odd);

    }
}
