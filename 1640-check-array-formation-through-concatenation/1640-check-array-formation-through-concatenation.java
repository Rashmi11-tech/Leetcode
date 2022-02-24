class Solution {
    public boolean canFormArray(int[] arr, int[][] pieces) {
        Map<Integer, int[]> pMap = new HashMap();
        for (int[] p : pieces) {
            pMap.put(p[0], p);
        }
        
        int i = 0;
        while (i < arr.length) {
            if (!pMap.containsKey(arr[i])) {
                return false;
            }
            for (int p : pMap.get(arr[i])) {
                if (p != arr[i++]) {
                   return false;
                }
            }
        }
        return true;
    }
    
}