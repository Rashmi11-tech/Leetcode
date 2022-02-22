class Solution {
    public boolean areOccurrencesEqual(String s) {
        Map<Character,Integer> map = new HashMap<>();
        
        for(char c : s.toCharArray()){
            if(map.containsKey(c)){
                map.put(c, map.get(c) +1);
            }else{
                map.put(c,1);
            }
        }
        
        Set<Integer> set = new HashSet<>(map.values());
        
        if(set.size() ==1){
            return true;
        }else{
            return false;
        }
        
    }
}