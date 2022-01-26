class Solution {
    public int[] sumZero(int nn) {
        int p = 1;
        int n = 1;
        
        int[] a = new int[nn];
        
        if(nn%2 == 0){
            for(int i=0;i<nn/2;i++){
                a[i] = p++;
                a[nn/2 + i] = -(n++);
            }
        }else{
            a[0] = 0;
            for(int i=1;i<=(nn/2);i++){
                a[i] = p++;
                a[nn/2 + i] = -(n++);
            }
        }
        
        return a;
    }
}