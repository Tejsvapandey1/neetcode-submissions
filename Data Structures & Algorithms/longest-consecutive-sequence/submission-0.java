class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for(int i =0; i < nums.length; i++){
            set.add(nums[i]);
        }

      
        int maxCnt = 0;

        for(int i = 0; i < nums.length; i++){
            int curr = nums[i];
            int cnt = 0;
            if(!set.contains(curr-1)){
                while(set.contains(curr)){
                    cnt++;
                    curr++;
                }
                maxCnt = Math.max(maxCnt,cnt);
            }
        }

        return maxCnt;
    }

}
