class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int [] ans = new int[k];
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int a = map.getOrDefault(nums[i], 0);
            map.put(nums[i], a+1);
        }
        int a=0; int x=0;
      while(k>0){
          a = Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey();
          ans[x] = a;
          map.remove(a);
          x++;
          k--;
      }  
    
        System.out.println(a);
        
        return ans;
        
    }
}