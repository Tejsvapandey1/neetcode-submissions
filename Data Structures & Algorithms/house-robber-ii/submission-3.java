class Solution {
    int[] dp1;
    int[] dp2;
    public int solve1(int[] nums,int i){
        if(i >= nums.length){
            return 0;
        }

        if(dp1[i] != 0){
            return dp1[i];
        }

        int take = nums[i] + solve1(nums,i+2);
        int notTake = solve1(nums,i+1);

        dp1[i] =  Math.max(take,notTake);

        return dp1[i];
    }

    public int solve2(int[] nums,int i){
        if(nums.length == 1)
            return nums[0];

        if(i >= nums.length-1){
            return 0;
        }

        if(dp2[i] != 0){
            return dp2[i];
        }

        int take = nums[i] + solve2(nums,i+2);
        int notTake = solve2(nums,i+1);
        dp2[i] =  Math.max(take,notTake);

        return dp2[i];
    }

    public int rob(int[] nums) {
        dp1 = new int[nums.length+1];
        dp2 = new int[nums.length+1];

        int ans1 = solve1(nums,1);
        int ans2 = solve2(nums,0);

        return Math.max(ans1,ans2);
    }
}
