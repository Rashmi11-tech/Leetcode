class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        Stack<Integer> s = new Stack<>();
        int[] nxtGen = new int[n];
        
        for(int i = 2*n -1 ; i >= 0 ; i--){
            
           while(!s.isEmpty() && s.peek() <= nums[i%n] )
               s.pop();
            
            if(s.isEmpty()) nxtGen[i%n]=-1;
            
            else nxtGen[i%n]=s.peek();
            
            s.push(nums[i%n]);
        }
        return nxtGen;
    }
}