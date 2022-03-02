class Solution {
    int maxArea = 0;
    int count = 0;
    public int maxAreaOfIsland(int[][] grid) {
      
        boolean visited[][] = new boolean[grid.length][grid[0].length]; 
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                if(grid[i][j] == 1 && visited[i][j] == false){
                    dfs(grid, visited, i, j);
                    maxArea = Math.max(count, maxArea);
                    count = 0;
                }
            }
        }
        
        return maxArea;
    }
    
    public void dfs(int grid[][], boolean visited[][], int i, int j){
        if(i<0 || j<0 || i>=grid.length || j>= grid[0].length || visited[i][j] == true || grid[i][j]==0){
            return;
        }
     
        visited[i][j] = true;
        count++;
        
        dfs(grid, visited, i-1, j);
        dfs(grid, visited, i, j+1);
        dfs(grid, visited, i+1, j);
        dfs(grid, visited, i, j-1);
    }
}