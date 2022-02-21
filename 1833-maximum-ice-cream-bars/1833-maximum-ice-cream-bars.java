class Solution {
    public int maxIceCream(int[] costs, int coins) {
       Arrays.sort(costs);
        int total = 0;
        int i;
        for( i = 0; i < costs.length; i++){
            if(total+costs[i]>coins)break;
            total+= costs[i];
        }
        return i;
    
    }
}