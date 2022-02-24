class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> l = new ArrayList<>();
        boolean[] v = new boolean[nums.length+1];
        for(int i : nums){
            v[i] = true;
        }
        for(int i=1;i< v.length;i++){
            if(!v[i]){
                l.add(i);
            }
        }
        return l;
    }
}
