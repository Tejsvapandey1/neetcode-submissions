class Solution {

    int[] dp;

    public int solve(int[] coins, int amount) {

        // Base case
        if (amount == 0) {
            return 0;
        }

        // Impossible
        if (amount < 0) {
            return Integer.MAX_VALUE;
        }

        // Already calculated
        if (dp[amount] != -1) {
            return dp[amount];
        }

        int ans = Integer.MAX_VALUE;

        for (int coin : coins) {

            int result = solve(coins, amount - coin);

            if (result != Integer.MAX_VALUE) {
                ans = Math.min(ans, 1 + result);
            }
        }

        dp[amount] = ans;

        return dp[amount];
    }

    public int coinChange(int[] coins, int amount) {

        dp = new int[amount + 1];
        Arrays.fill(dp, -1);

        int ans = solve(coins, amount);

        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}