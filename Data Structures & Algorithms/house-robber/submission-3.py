class Solution:
    def rob(self, nums: List[int]) -> int:
        dp = {}

        def helper(idx):
            if(idx >= len(nums)): return 0

            if(idx in dp): return dp[idx]        
            
            take = nums[idx] + helper(idx+2)
            inTake = helper(idx + 1)

            dp[idx] = max(take,inTake)

            return dp[idx]
            
        res = helper(0)

        return res
        