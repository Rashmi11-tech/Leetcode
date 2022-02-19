class Solution {
    public int[] sortEvenOdd(int[] nums) {
         List<Integer> odd = new ArrayList<>();
        List<Integer> even = new ArrayList<>();
        for(int i = 0;i<nums.length;i++) {
            if(i%2 == 0) {
                even.add(nums[i]);
            } else {
                odd.add(nums[i]);
            }
        }
        Collections.sort(even);
        Collections.sort(odd, Collections.reverseOrder());
        int j = 0,k = 0;
        for(int i=0;i<nums.length;i++) {
            if(i%2 == 0) {
                nums[i] = even.get(j++);
            } else {
                nums[i] = odd.get(k++);
            }
        }
        return nums;
    }
}