class Solution {
    public int[] sortArrayByParityII(int[] nums) {
         int n = nums.length;
        int[] ans = new int[n];
        int j = 0;
        for(int i: nums) if(i%2==0){ans[j] = i; j+=2;}
        j = 1;
        for(int i: nums) if(i%2==1){ans[j] = i; j+=2;}
        return ans;
    }
}