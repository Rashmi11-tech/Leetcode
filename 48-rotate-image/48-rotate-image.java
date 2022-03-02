class Solution {
    public void rotate(int[][] matrix) {
        getTranspose(matrix);
        for(int i=0;i<matrix.length;i++){
            rotateRows(matrix[i]);
        }
        
    }
    
    public void rotateRows(int[] m){
        int i=0;
        int j=m.length-1;
        while(i<j){
            int t = m[i];
            m[i] = m[j];
            m[j] = t;
            i++;
            j--;
        }
    }
    public void getTranspose(int[][] matrix){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<i;j++){
                int t = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = t;
            }
        }
    }
}