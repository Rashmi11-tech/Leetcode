class Solution {
    public int specialArray(int[] nums) {
        int s=0;
        int e=nums.length;
        
        while(s<=e){
            int mid = s+(e-s)/2;
            int k = count(nums,mid);
            if(mid == k){
                return mid;
            }else if(k>mid){
                s = s+1;
            }else{
                e = e-1;
            }
        }
        return -1;
    }
    
    public int count(int[] nums, int n){
        int c = 0;
        for(int nn : nums){
            if(nn >= n){
                c ++;
            }
        }
        return c;
    }
}