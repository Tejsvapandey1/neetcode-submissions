class Solution {
    public int product(int[] nums, int pos) {
        if (pos == 0) {
            int prod = 1;
            for (int i = 1; i < nums.length; i++) {
                prod *= nums[i];
            }
            return prod;
        } else if (pos == nums.length - 1) {
            int prod = 1;
            for (int i = 0; i < nums.length - 1; i++) {
                prod *= nums[i];
            }
            return prod;
        } else {
            int temp1 = 1;
            int temp2 = 1;
            int prod = 1;

            for (int i = 0; i < pos; i++) {
                temp1 *= nums[i];
            }
            for (int i = pos + 1; i < nums.length; i++) {
                temp2 *= nums[i];
            }

            prod = temp1 * temp2;
            return prod;
        }
    }

    public int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        int n = nums.length;

        for(int i = 0; i < n; i++){
            int temp = 1;
            for(int j = 0; j < n; j++){
                if(i != j){
                    temp*=nums[j];
                }
            }

            res[i] = temp;
        }

        return res;
    }
}
