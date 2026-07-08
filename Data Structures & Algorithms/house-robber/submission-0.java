class Solution {
    int[] dp;
    public int solve(int[] nums, int n){
        if(n >= nums.length){
            return 0;
        }
        if(dp[n] != 0){
            return dp[n];
        }

        int take = nums[n] +solve(nums,n+2);
        int notTake = solve(nums,n+1);

        dp[n] = Math.max(take,notTake);

        return dp[n];
    }

    public int rob(int[] nums) {
        dp = new int[nums.length+1];
        return solve(nums,0);
    }
}
