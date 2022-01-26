class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int n1 = nums[0];
        int n2 = nums[nums.length-1];
        return find(n1,n2);
    }
    
    int find(int n1, int n2){
        return n2==0 ?n1:find(n2,n1%n2);
    }
}