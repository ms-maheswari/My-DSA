public class Buy_and_Sell_Stock {
    public static int maxProfit(int[] prices, int n) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            // If the current price is less than minPrice, update minPrice
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            }    
            else {
                int profit = prices[i] - minPrice;
                // If the calculated profit is greater than maxProfit, update maxProfit
                if (profit > maxProfit) {
                    maxProfit = profit;
                }
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        int n = prices.length;
        int result = maxProfit(prices, n);
        System.out.println(result);
    }  
}

// Input : [7, 1, 5, 3, 6, 4]
// Output : 5