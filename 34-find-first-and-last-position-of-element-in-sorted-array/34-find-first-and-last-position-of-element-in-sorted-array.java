class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1,-1};
        boolean isF = false;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == target && !isF){
                ans[0] = i;
                isF = true;
            }
            if(isF && nums[i] == target){
                ans[1] = i;
            }
        }
        
        return  ans;
    }
}