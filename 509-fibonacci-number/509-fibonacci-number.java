class Solution {
    public int fib(int n) {
        return g(n);
    }
    
    int g(int n){
        if(n<=1){
            return n;
        }
        return g(n-1) + g(n-2);
    }
}