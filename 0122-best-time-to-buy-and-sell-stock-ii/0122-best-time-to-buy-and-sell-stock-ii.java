class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int len = prices.length;
        int buy = prices[0];
        for(int day = 1; day < len; day++){
            if(buy > prices[day]){
                buy = prices[day];
            }
            else if(prices[day] > buy){
                profit += (prices[day] - buy);
                buy = prices[day];
            }
        }
        
        return profit;
    }
}