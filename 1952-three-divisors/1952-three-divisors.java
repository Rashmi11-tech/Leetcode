class Solution {
    public boolean isThree(int n) {
        int i = 1;
        int isThree = 0;
        while(i<=n){
            if(n % i ==0){
                isThree ++;
            }
            i++;
        }
        return isThree == 3 ? true : false;
    }
}