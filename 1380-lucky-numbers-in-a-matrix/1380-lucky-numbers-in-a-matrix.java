class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;
        
        //行的最小值
        int[] row = new int[m];
        //列的最大值
        int[] col = new int[n];
        
        for(int i = 0; i < m; i ++){
            //初始化
            row[i] = Integer.MAX_VALUE;
            for(int j = 0; j < n; j ++){
                row[i] = Math.min(row[i], matrix[i][j]);
                col[j] = Math.max(col[j], matrix[i][j]);
            }
        }
        
        for(int i = 0; i < m; i ++){
            for(int j = 0; j < n; j ++){
                if((matrix[i][j] == row[i]) && (matrix[i][j] == col[j])){
                result.add(matrix[i][j]);    
                }
            }
        }
        
        return result;
    }
}