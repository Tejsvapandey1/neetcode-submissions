class Solution {
    int[] dp;
    public int solve(int[] nums,int idx){
        if(idx >= nums.length) return 0;
        if(dp[idx] != 0) return dp[idx];

        dp[idx] = nums[idx] + solve(nums,idx+2);
        int skip = solve(nums,idx + 1);

        return Math.max(dp[idx],skip);
    }

    public int rob(int[] nums) {
        dp = new int[nums.length+1];
        return solve(nums,0);
    }
}
