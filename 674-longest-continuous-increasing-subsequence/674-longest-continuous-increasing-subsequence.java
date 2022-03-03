class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int ans = 1;
        
        int i=0;
        int j=1;
        int k=0;
        while(i<nums.length && j<nums.length){
            if(nums[k] < nums[j]){
                //System.out.println(j);
                ans= Math.max(ans, (j-i)+1);
            }else{
                i=j;
            }
            k++;
            j++;
        }
        
        return ans;
    }
}