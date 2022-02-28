class Solution {
    public int[] shortestToChar(String s, char c) {
        int[] ans = new int[s.length()];
        int n = s.length();
        int curPos = -n;
        
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == c){
                curPos = i;
            }
            ans[i] = i - curPos;
        }
        
        
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i) == c){
                curPos = i;
            }
            ans[i] = Math.min(ans[i], Math.abs(i-curPos));
        }
        
        return ans;
    }
}