public class Best_Time_to_Buy_and_Sell_Stock_II {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        int ans = buySell2(prices);
        System.out.println(ans);
    }

    static int buySell2(int[] prices) {
        int hold = -Integer.MAX_VALUE;
        int notHold = 0;

       for (int price : prices) {
           int prev = hold;
           int notprevhold = notHold;

           hold = Math.max(prev,notprevhold - price);

           notHold = Math.max(notprevhold,prev + price);
       }
       return notHold;
    }
}
