public class Best_Time_to_Buy_and_Sell_Stock {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        int ans = buySell(prices);
        System.out.println(ans);

    }
    static int buySell(int[] prices) {
        if(prices == null || prices.length <= 1) {
            return 0;
        }

        int minbuy = prices[0];
        int profit = 0;

        for (int i = 0; i < prices.length ; i++) {
            minbuy = Math.min(minbuy,prices[i]);
            profit = Math.max(profit,prices[i] - minbuy);
        }

        return profit;
    }
}
