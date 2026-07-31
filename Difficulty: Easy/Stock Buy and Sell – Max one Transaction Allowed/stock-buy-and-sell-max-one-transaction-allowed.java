class Solution {
    public int maxProfit(int prices[]) {

        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {

            // Minimum buying price
            minPrice = Math.min(minPrice, price);

            // Profit if sold today
            int profit = price - minPrice;

            // Maximum profit
            maxProfit = Math.max(maxProfit, profit);
        }

        return maxProfit;
    }
}