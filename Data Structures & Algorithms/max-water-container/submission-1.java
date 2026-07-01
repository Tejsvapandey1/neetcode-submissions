class Solution {
    public int maxArea(int[] heights) {
        int r = heights.length - 1;
        int l = 0;
        int maxArea = Integer.MIN_VALUE;
        while(l<r){
            int width = r - l;
            int height = Math.min(heights[l],heights[r]);
            int area = width*height;
            maxArea = Math.max(area,maxArea);
                
            if(heights[l] < heights[r]){
                l++;
            }else{
                r--;
            }
        }

        return maxArea;
    }
}
