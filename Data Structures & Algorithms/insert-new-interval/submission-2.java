class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        ArrayList<int[]> res = new ArrayList<>();
        for(int[] current : intervals){
            if(current[1] < newInterval[0]){
                res.add(current);
            }else if(current[0] > newInterval[1]){
                res.add(newInterval);
                newInterval = current;
            }else{
                int start = Math.min(current[0],newInterval[0]);
                int end = Math.max(current[1],newInterval[1]);

                int[] temp = {start,end};
                newInterval = temp;
            }
        }

        res.add(newInterval);
        
        return res.toArray(new int[res.size()][]);
    }
}
