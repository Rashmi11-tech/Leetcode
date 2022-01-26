class Solution {
    public int sumOfUnique(int[] nums) {
         Map<Integer,Integer> map = new HashMap<>();
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
          if(map.containsKey(nums[i])){
              map.put(nums[i],map.get(nums[i])+1);
          }
          else{
              map.put(nums[i],1);
          }
        }

        for(Map.Entry<Integer,Integer> pair: map.entrySet()){
          if(pair.getValue()==1){
              sum = sum + pair.getKey();
          }
        }
        return sum;
    }
}