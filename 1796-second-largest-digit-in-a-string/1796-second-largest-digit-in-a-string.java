class Solution {
    public int secondHighest(String s) {
        Set<Integer> l = new TreeSet<>();
        
        for(int i=0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i))){
                l.add(Character.getNumericValue(s.charAt(i)));
            }
        }
        List<Integer> ld = new ArrayList<>(l);
        Collections.sort(ld);
        if(ld.size() < 2){
            return -1;
        }
        return ld.get(l.size()-2);
    }
}