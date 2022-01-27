class Solution {
    public void duplicateZeros(int[] arr) {
        int i =0;
        int j = arr.length-1;
        while(i<=j){
            if(arr[i] == 0){
                while(j>i){
                    arr[j] = arr[j-1];
                    j--;
                }
                i=j+2;
                j = arr.length-1;
            }
            else i++;
        }
    }
}