class Solution {
    public int maxProfit(int[] prices) {
        int minBuy = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int num : prices){
            minBuy = Math.min(minBuy, num);
            // System.out.println(num - minBuy);
            maxProfit = Math.max(maxProfit, num - minBuy);
        }
        
        return maxProfit;
    }
}