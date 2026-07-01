class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for(int i : nums){
            set.add(i);
        }

        int cnt = 0;

        for(int i : nums){
            if(!set.contains(i-1)){
                int tempCnt = 1;
                int temp = i+1;
                while(set.contains(temp)){
                    temp++;
                    tempCnt++;
                }
                cnt = Math.max(tempCnt,cnt);
            }
        }

        return cnt;
    }
}
