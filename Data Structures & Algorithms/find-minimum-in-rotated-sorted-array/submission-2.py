class Solution:
    def findMin(self, nums: List[int]) -> int:
        minn = nums[0]

        for i in range(len(nums)):
            if(nums[i] < minn):
                minn = nums[i]

        return minn
        