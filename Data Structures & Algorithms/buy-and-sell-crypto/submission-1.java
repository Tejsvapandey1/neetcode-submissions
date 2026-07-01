class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int minSoFar = Integer.MAX_VALUE;
        
        for(int price : prices){
            if(price < minSoFar){
                minSoFar = price;
            }else{
                profit = Math.max(profit,price - minSoFar);
            }
        }
        return profit;
    }
}
