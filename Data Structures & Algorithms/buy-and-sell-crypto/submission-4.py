class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        max_profit = 0
        last_min = prices[0]
        n = len(prices)

        for i in range(1,n,1):
            profit = prices[i] - last_min
            if(profit < 0):
                last_min = prices[i]
            max_profit = max(max_profit,profit)

        return max_profit