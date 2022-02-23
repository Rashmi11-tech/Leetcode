class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> map = new HashMap<>();
        
        for(char c : s.toCharArray()){
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }else{
                map.put(c, 1);
            }
        }
        
        Map<Character, Integer> sortedMap = sortMap(map);
        
        String ans = "";
        
        for(char c : sortedMap.keySet()){
            int v = sortedMap.get(c);
            while(v-->0){
                ans = ans + String.valueOf(c);
            }
            
        }
        
        return ans;
    }
    
    public static Map<Character, Integer> sortMap(Map<Character, Integer> hm) {
    List<Map.Entry<Character, Integer> > list =
               new LinkedList<Map.Entry<Character, Integer> >(hm.entrySet());
 
        Collections.sort(list, new Comparator<Map.Entry<Character, Integer> >() {
            public int compare(Map.Entry<Character, Integer> o1,
                               Map.Entry<Character, Integer> o2)
            {
                return (o2.getValue()).compareTo(o1.getValue());
            }
        });
         
        HashMap<Character, Integer> temp = new LinkedHashMap<Character, Integer>();
        for (Map.Entry<Character, Integer> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
        }
        return temp;
  }
}