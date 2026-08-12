class Solution {
    public int maxArea(int[] heights) {
        int n = heights.length ;
        int left = 0;
        int right = n-1;
        int maxArea = 0;

        while(left < right){
            int area = (right - left )*(Math.min(heights[left],heights[right]));
            maxArea = Math.max(area,maxArea);
            if(heights[left] < heights[right]){
                left++;
            }else if(heights[left] > heights[right]){
                right--;
            }else{
                right--;
                left++;
            }
        }

        return maxArea;
    }
}
