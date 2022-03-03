class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        int sum = 0;
        boolean allZ = true;
        for(int i : arr){
            sum+=i;
            if(i != 0){
                allZ=false;
            }
        }
        if(allZ){
            return true;
        }
        if(sum%3!=0) return false;
        
        sum = sum/3;
        
        int k=0;
        int temp = 0;
        for(int i=0;i<arr.length;i++){
            temp = temp+arr[i];
            if(temp == sum){
                k++;
                temp = 0;
            }
        }
        //System.out.println(k);
        if(k>=3){
            return true;
        }
        return false;
    }
}