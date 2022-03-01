class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> an = new ArrayList<>();
        HashSet<Integer> ss = new HashSet<>();
        for(int n : nums){
            if(ss.contains(n)){
                an.add(n);
                //ss.remove(n);
            }else{
                ss.add(n);
            }
        }
        return an;
    }
}