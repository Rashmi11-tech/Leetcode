import java.util.*;

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> ans = new ArrayList<>();
        for(int i=0 ;i< nums1.length;i++){
            if(bs(nums1[i], nums2) == 1){
                ans.add(nums1[i]);
            }
        }
        
        return ans.stream().mapToInt(Integer::intValue).toArray();
    }
    
    public int bs(int t, int nums[]){
        int s=0,e=nums.length;
        Arrays.sort(nums);
        while(s<e){
            int mid = s+(e-s)/2;
            if(nums[mid] == t){
                nums[mid] = Integer.MIN_VALUE;
                return 1;
            }else if(t<nums[mid]){
                e =mid;
            }else{
                s=mid+1;
            }
        }
        return -1;
    }
}