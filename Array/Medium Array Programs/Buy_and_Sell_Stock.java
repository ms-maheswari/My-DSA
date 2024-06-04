public class Buy_and_Sell_Stock {
    public static void main(String[] args) {
        // Initialize an array of stock prices

        int[] prices = {7, 1, 5, 3, 6, 4};
        int n = prices.length;

        // Call the maxProfit method to calculate the maximum profit
        int result = maxProfit(prices, n);
        System.out.println(result);
    }

    // Method to calculate the maximum profit
    public static int maxProfit(int[] prices, int n) {
        // Initialize minPrice to the maximum integer value
        int minPrice = Integer.MAX_VALUE;
        // Initialize maxProfit to 0
        int maxProfit = 0;

        // Iterate through each price in the array
        for (int i = 0; i < prices.length; i++) {
            // If the current price is less than minPrice, update minPrice
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            }
            // Otherwise, calculate the profit by subtracting minPrice from the current price
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
}
