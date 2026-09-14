class Solution:
    def combinationSum(self, nums: List[int], target: int) -> List[List[int]]:

        combinations = []
        result = []

        def backtrack(start,target):
            if target == 0:
                result.append(combinations.copy())
                return
            
            if target < 0:
                return

            for i in range(start,len(nums)):
                combinations.append(nums[i])

                backtrack(i,target -  nums[i])

                combinations.pop()
            
        backtrack(0,target)
        return result
        