class Solution {
    public int[] shuffle(int[] nums, int n) {
        int op[] = new int[2*n];
        for(int i = 0, j = 0; i < n; i++, j=j+2){
            op[j] = nums[i];
            op[j+1] = nums[i+n];
        }
        return op;
    }
}