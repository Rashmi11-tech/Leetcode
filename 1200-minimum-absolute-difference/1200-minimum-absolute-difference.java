class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
       Arrays.sort(arr);
        List<List<Integer>> list=new ArrayList<>();
        int min=Integer.MAX_VALUE;
        
       for(int i=1;i<arr.length;i++)
             min=Math.min(min,arr[i]-arr[i-1]);
        
       for(int i=1;i<arr.length;i++)
       {
           int diff=arr[i]-arr[i-1];
           if(diff==min)
           {
               List<Integer> pair=new ArrayList<>(2);
               pair.add(arr[i-1]);
               pair.add(arr[i]);
               list.add(pair);
           }
       }
        
        return list;
    }
}