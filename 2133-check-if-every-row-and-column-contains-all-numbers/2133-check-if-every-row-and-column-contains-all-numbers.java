class Solution {
    public boolean checkValid(int[][] matrix) {
        
        for(int i=0;i<matrix.length;i++){
            if(!valid(i, matrix)){
                return false;
            }
        }
        
        return true;
    }
    
    public boolean valid(int i, int [][] matrix){
        Set<Integer> rset = new HashSet<>();
        Set<Integer> lset = new HashSet<>();
        
        for(int j=0;j<matrix.length;j++){
            rset.add(matrix[i][j]);
        }
        
        
        for(int j=0;j<matrix.length;j++){
            lset.add(matrix[j][i]);
        }
        
        //System.out.print(lset +" "+rset);
       
        if(rset.size() == matrix.length && lset.size()==  matrix.length ){
            return true;
        }
        else{
            return false;
        }
    }
}