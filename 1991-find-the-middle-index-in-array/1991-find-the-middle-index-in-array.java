class Solution {
    public int findMiddleIndex(int[] nums) {
        int sum = 0;
        for(int n: nums)
        {
            sum+=n;
        }
        
        int leftsum = 0;
        for(int i =0; i < nums.length; i++)
        {
            int rightsum = sum - (leftsum + nums[i]);
            if(leftsum == rightsum) return i;
            else
            {
                leftsum += nums[i];
            }
        }
        
        return -1;

    }
}