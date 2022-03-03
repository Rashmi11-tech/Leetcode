class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int i =0;
        int j=0;
        int curr=0;
        while(i<nums.length){
            if(nums[i] == 1){
                curr++;
                max = Math.max(max,curr);
                i++;
            }else{
                curr=0;
                i++;
            }
        }
        
        return max;
        
    }
}