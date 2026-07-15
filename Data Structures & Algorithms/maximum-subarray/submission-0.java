class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int maxSum = -1;
        for(int i : nums){
            if(sum < 0){
                sum = 0;
            }
            sum += i;
            maxSum = Math.max(maxSum,sum);
        }

        return maxSum;
    }
}
