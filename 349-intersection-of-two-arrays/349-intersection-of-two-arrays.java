class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
      
        Set<Integer> ans = new HashSet<>();
        
        List<Integer> ae = new ArrayList<>();
        for(int h : nums2){
            ae.add(h);
        }
        
        for(int a : nums1){
            if(ae.contains(a)){
                ans.add(a);
            }
        }
        
       // System.out.println(ans);
        int[] aaa = new int[ans.size()];
        int i=0;
        for(int g : ans){
            aaa[i] = g;
            i++;
        }
        return aaa;
    }
}