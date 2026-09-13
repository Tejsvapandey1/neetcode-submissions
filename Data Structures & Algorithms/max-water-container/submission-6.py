class Solution:
    def maxArea(self, heights: List[int]) -> int:
        n = len(heights)
        right = n - 1
        left = 0
        maxArea = 0

        while left < right:
            height_left = heights[left]
            height_right = heights[right]
            width = right - left 
            height = min(height_left,height_right)
            area = width * height
            maxArea = max(maxArea,area)
            if height_left < height_right :
                left += 1
            else :
                right -= 1
            

        return maxArea