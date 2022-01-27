class Solution {
    public char findTheDifference(String s, String t) {
        Map<Character, Integer> m = new HashMap<>();
		for(char cc : t.toCharArray()) {
			if(m.containsKey(cc)) {
				m.put(cc, m.get(cc)+1);
			}else {
				m.put(cc, 1);
			}
		}
		
		for(char f : s.toCharArray()) {
			if(m.containsKey(f)) {
				m.put(f, m.get(f)-1);
			}else {
				return f;
			}
		}
		for(char h : m.keySet()) {
			if(m.get(h) != 0) {
				return h;
			}
		}
        
        return '\0';
        
    }
}