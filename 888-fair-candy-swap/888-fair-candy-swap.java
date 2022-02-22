class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int[] ans = new int[2];
        
        int a = sum(aliceSizes);
        int b = sum(bobSizes);
        Arrays.sort(aliceSizes);
        Arrays.sort(bobSizes);
        int baki = (b-a) / 2;
       // System.out.print(baki);
        for(int i=0;i<aliceSizes.length;i++){
            if(bs(aliceSizes[i]+baki, bobSizes) == 1){
                ans[0] = aliceSizes[i];
                ans[1] = aliceSizes[i] + baki;
                return ans;
            }
        }
        
        return ans;
    }
    
    public int sum(int[] n){
        int sum = 0;
        for(int i : n){
            sum += i;
        }
        return sum;
    }
    
    public int bs(int t, int[] num){
        
        int s=0,e=num.length;
        
        while(s<e){
            int mid = s+(e-s)/2;
            if(num[mid] == t){
                return 1;
            }else if(num[mid] < t){
                s = mid+1;
            }else{
                e = mid;
            }
        }
        return -1;
    }
}