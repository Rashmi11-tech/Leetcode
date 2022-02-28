class Solution {
    public int countPairs(int[] nums, int k) {
        int c=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(i*j % k == 0){
                    if(nums[i] == nums[j]){
                        c++;
                    }
                }
            }
        }
        return c;
    }
}