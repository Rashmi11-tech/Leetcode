class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue(Collections.reverseOrder());
        
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                int d = matrix[i][j];
                pq.add(d);
                if(pq.size()>k){
                    pq.poll();
                }
            }
        }
        
        return pq.peek();
    }
}