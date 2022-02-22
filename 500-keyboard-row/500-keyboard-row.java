class Solution {
    public String[] findWords(String[] words) {
        String f = "qwertyuiop";
        String m = "asdfghjkl";
        String l = "zxcvbnm";
        List<Integer> ans = new ArrayList<>();
        int k=0;
        for(String h : words){
            h = h.toLowerCase();
            boolean fi = true;
            boolean mi = true;
            boolean li = true;
            for(char c : h.toCharArray()){
                if(!f.contains(String.valueOf(c))){
                    fi = false;
                   // break;
                }
                
                if(!m.contains(String.valueOf(c))){
                   // System.out.print("cc "+c);
                    mi = false;
                   // break;
                }
                if(!l.contains(String.valueOf(c))){
                    li = false;
                   // break;
                }
            }
            
            if(fi || mi || li){
                ans.add(k);
            }
            k++;
        }
        
        String[] an = new String[ans.size()];
        int hj =0;
        for(int s : ans){
            an[hj] = words[s];
            hj++;
        }
        return an;
    }
}