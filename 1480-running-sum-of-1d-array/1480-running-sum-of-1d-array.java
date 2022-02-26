class Solution {
    public int[] runningSum(int[] nums) {
        int[] ans = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            ans[i] = sum(0,i,nums);
        }
    
        return ans;
    }
    
    public int sum(int i,int j, int[] nums){
        int sum = 0;
        for(int k=i;k<=j;k++){
            sum += nums[k];
        }
        return sum;
    }
}