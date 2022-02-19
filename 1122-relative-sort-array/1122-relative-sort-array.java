class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
         int[]freq=new int[1001];
  int[]ans=new int[arr1.length];
 for(int num:arr1){
     freq[num]++;
 }
 int j=0;
 for(int i=0;i< arr2.length;i++){
     while(freq[arr2[i]]-->0){
         ans[j++]=arr2[i];
     }
 }
 for(int i=0;i< freq.length;i++){
     while (freq[i]-->0){
         ans[j++]=i;
     }
 }
 return ans;
    }
}