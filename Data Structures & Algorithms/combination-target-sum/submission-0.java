class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<Integer> arr = new ArrayList<>();
        solve(nums,target,0,arr);

        return res;
    }

    List<List<Integer>> res = new ArrayList<>();

    public void solve(int[] nums,int target,int idx, List<Integer> arr){
        if(target == 0){
            res.add(new ArrayList<>(arr)); 
            return;
        }
        if(idx == nums.length) return;
        if(target < 0) return;
        

        arr.add(nums[idx]);
        solve(nums,target-nums[idx],idx,arr);
        arr.remove(arr.size()-1);
        solve(nums,target,idx+1,arr);
    }
}
