/*
class Solution {
    public static int count = 0;
    public int islandPerimeter(int[][] grid) {
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j] == 1){
                    dfs(grid, i , j);
                    break;
                }
            }
        }
        
        return count;
    }
    
    public static void dfs(int[][] grid, int i, int j){
        if(i<0 || i>=grid.length || j<0|| j>=grid[i].length || grid[i][j] ==0){
            count ++;
            return;
        }
        if(grid[i][j] == -1){
           // count++;
            return;
        }
        
        grid[i][j]=-1;
        
        dfs(grid, i+1, j);
        dfs(grid, i-1, j);
        dfs(grid, i, j+1);
        dfs(grid, i, j-1);
        
    }
}

*/
class Solution {
 public int islandPerimeter(int[][] grid) {
        
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0;j < grid[0].length; j++) {
                
                if (grid[i][j] == 1) {
                    
                  return calculatePerimeter(i, j, grid);
                    
                }
                
            }
        }
        
        return 0;
    }
        
        public int calculatePerimeter( int i, int j, int[][] grid) {
            
            if ( i < 0 || j >= grid[0].length || i >= grid.length || j < 0 || grid[i][j] == 0) {
                return 1;
            }
            
            if (grid[i][j] == 2) {
                return 0;
            }
            
            grid[i][j] = 2;
            
            return calculatePerimeter(i + 1, j, grid) + calculatePerimeter(i - 1, j, grid) + calculatePerimeter(i, j + 1, grid) + calculatePerimeter(i, j - 1, grid);
            
        }
}