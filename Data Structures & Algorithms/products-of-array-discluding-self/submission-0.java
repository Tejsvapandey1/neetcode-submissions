class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] output = new int[nums.length];
        int prod = 1;
        int zeroCount = 0;

        for(int i : nums){
            if (i != 0) {
                prod *= i;
            } else {
                zeroCount++;
            }
        }

        for(int i = 0; i < nums.length; i++){
            if (zeroCount > 1) {
                output[i] = 0;
            } else if (zeroCount == 1) {
                output[i] = (nums[i] == 0) ? prod : 0;
            } else {
                output[i] = prod / nums[i];
        }

        }

        return output;
    }
}  
