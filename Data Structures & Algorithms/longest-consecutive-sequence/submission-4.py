class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        num_set = set(nums)
        max_count = 0;

        for num in nums:
            if num - 1 not in num_set:
                temp_num = num
                count = 0
                while temp_num in num_set:
                    temp_num += 1
                    count += 1
                max_count = max(max_count,count)

        return max_count 