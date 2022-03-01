class Solution {
    public boolean isPossibleDivide(int[] nums, int k) {
        int n=nums.length;
        Arrays.sort(nums);
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(int i=0;i<n;i++)
        {
            if(map.get(nums[i])==0)
                continue;
            for(int v=nums[i];v<nums[i]+k;v++)
            {
                if(!map.containsKey(v)||map.get(v)==0)
                    return false;
                else
                    map.put(v,map.get(v)-1);
            }
        }
        return true;
    }
}