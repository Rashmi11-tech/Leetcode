class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean increasing = false;
boolean decreasing = false;
        for(int i = 0; i < nums.length - 1; i++){
        if(nums[i] < nums[i + 1]){
            increasing = true;
        } else if (nums[i] > nums[i + 1]){
            decreasing = true;
        }
        if(nums[i] > nums[i + 1] && increasing){
            return false;
        }
        if(nums[i] < nums[i + 1] && decreasing){
            return false;
        }
        }
    return true;
    }
}