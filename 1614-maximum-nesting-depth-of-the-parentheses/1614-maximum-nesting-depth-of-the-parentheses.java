class Solution {
    public int maxDepth(String s) {
        int ct = 0;
        int max = 0;
        
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '('){
                ct ++;
            }
            
            if(max < ct){
                max = ct;
            }
            if(s.charAt(i) == ')'){
                ct--;
            }
        }
        return max;
    }
}