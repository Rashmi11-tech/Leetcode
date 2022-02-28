class Solution {
    public double trimMean(int[] arr) {
        double sum = 0;
        int n = arr.length;
        int rem = n/20;
        Arrays.sort(arr);
        for (int i = rem; i<n - rem ; i++){
            sum = sum + arr[i];
        }
        return sum/(n-2*rem);
    }
}