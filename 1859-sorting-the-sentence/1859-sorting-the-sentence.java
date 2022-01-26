class Solution {
    public String sortSentence(String s) {
       String[] sp = s.split(" ");
        String[] ans = new String[sp.length];
        
        for(int i=0;i<sp.length;i++){
            int in = Integer.parseInt(sp[i].substring(sp[i].length() - 1));
            ans[in-1] = sp[i].substring(0, sp[i].length()-1);
        }
        String aa = "";
        for(int i=0;i<ans.length;i++){
            aa = aa +" "+ans[i];
        }
        return aa.trim();
    }
}