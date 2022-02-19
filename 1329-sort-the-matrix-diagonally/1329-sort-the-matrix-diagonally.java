class Solution {
    public int[][] diagonalSort(int[][] mat) {
        
        for(int i=0;i<mat.length;i++){
            sort(mat,i,0);
        }
        
        for(int i=0;i<mat[0].length;i++){
            sort(mat,0,i);
        }
        
        return mat;
    }
    
    public void sort(int[][] mat, int i, int j){
        List<Integer> l = new ArrayList<>();
        int h =i, h1=j;
        while(i< mat.length && j < mat[0].length){
            l.add(mat[i][j]);
            i++;
            j++;
        }
        Collections.sort(l);
        int y=0;
        while(h< mat.length && h1 < mat[0].length){
            mat[h][h1] = l.get(y);
            h++;
            h1++;
            y++;
        }
    }
}

