class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> ans = new ArrayList<>();
        int n = rowIndex + 1;
        for(int i=1;i<=n;i++){
            List<Integer> a = new ArrayList<>();
            for(int j=1;j<=i;j++){
                if(j==1 || i==j){
                    a.add(1);
                }else{
                    int t = ans.get(i-2).get(j-1) + ans.get(i-2).get(j-2);
                    a.add(t);
                }
            }
            ans.add(a);
        }
        
        return ans.get(rowIndex);
    }
}