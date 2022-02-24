class Solution {
    public int findLucky(int[] arr) {
        Map<Integer, Integer> m = 
               new TreeMap<Integer, Integer>(Collections.reverseOrder());
        for(int i : arr){
           if(m.containsKey(i)){
               m.put(i, m.get(i)+1);
           }else{
               m.put(i,1);
           }
        }
      //  System.out.print(m);
        
        for(int i : m.keySet()){
            if(i == m.get(i)){
                return i;
            }
        }
        
        return -1;
    }
}