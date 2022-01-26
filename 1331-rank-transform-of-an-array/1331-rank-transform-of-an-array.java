class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] tmp = Arrays.copyOf(arr,arr.length);
        Arrays.sort(tmp);
        HashMap<Integer,Integer> mp = new HashMap<Integer,Integer>();
        int i = 1;
        for(Integer x:tmp){
            if(!mp.containsKey(x)) mp.put(x,i++);
        }

        i=0;
        for(Integer x:arr){
            arr[i++] = mp.get(x);
        }
        return arr;
    }
}