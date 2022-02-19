class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a1,a2)->Integer.compare(a1[0], a2[0]));
        
        List<int[]> res = new ArrayList<>();
        res.add(intervals[0]);
        
        for(int i=1;i<intervals.length;i++){
            int[] last = res.get(res.size()-1);
            
            if(last[1] >= intervals[i][0]){
                last[1] = Math.max(last[1], intervals[i][1]);
            }else{
                res.add(intervals[i]);
            }
        }
        
        return res.toArray(new int[0][]);
    }
}