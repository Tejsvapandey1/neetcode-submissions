
class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b) -> (a[1] - b[1]));

        int prevEnd = intervals[0][1];
        int cnt = 1;
        for(int i = 1; i < intervals.length; i++){
            int currStart = intervals[i][0];
            if(prevEnd > currStart){
                continue;
            }
            prevEnd = intervals[i][1];
            cnt++;
        }

        return (intervals.length - cnt);
    }
}
