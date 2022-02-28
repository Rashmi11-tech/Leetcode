class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        
        int sum = 0;
        int k = cost.length-3;
        for(int i =cost.length-1;i>=0;i--)
        {
            if(i!= k){
                sum = sum + cost[i];
            }else
                k = k-3;
        }
        return sum;
    }
}