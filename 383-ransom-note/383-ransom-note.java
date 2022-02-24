class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> m1 = new HashMap<>();
        for(char c : ransomNote.toCharArray()){
            if(m1.containsKey(c)){
                m1.put(c,m1.get(c)+1);
            }else{
                m1.put(c,1);
            }
        }
        Map<Character, Integer> m2 = new HashMap<>();
        for(char c : magazine.toCharArray()){
            if(m2.containsKey(c)){
                m2.put(c,m2.get(c)+1);
            }else{
                m2.put(c,1);
            }
        }
        //System.out.print(m1 +" "+m2);
        for(char i : m1.keySet()){
           // System.out.println(i);
            if(m2.containsKey(i)){
                if(m2.get(i) < m1.get(i)){
                    return false;
                }
            }else{
                return false;
            }
        }
        return true;
    }
}