class Solution {
    public int findFinalValue(int[] nums, int original) {        
        for(int i : nums){
            if(i == original){
                return findFinalValue(nums, original * 2);
            }
        }
        return original;
    }
}