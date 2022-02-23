class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
       
        return findNge(nums1, nums2);
    }
    
    public int[] findNge(int[] nums1, int[] nums2){
        int[] ans = new int[nums1.length];
        Arrays.fill(ans,-1);
        Stack<Integer> stack = new Stack<>();
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<nums2.length;i++){
            while(!stack.isEmpty() && stack.peek()<nums2[i]){
                hm.put(stack.pop(),nums2[i]);
            }
            stack.push(nums2[i]);
        }
        for(int i=0; i<nums1.length;i++){
            if(hm.containsKey(nums1[i])){
                ans[i] = hm.get(nums1[i]);
            }
        }
        
        return ans;
    }
    
}