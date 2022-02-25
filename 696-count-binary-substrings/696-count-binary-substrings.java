class Solution {
    public int countBinarySubstrings(String s) {
        int prevLength = 0;
        int runLength =1;
        int count =0;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)!= s.charAt(i-1)){
                prevLength = runLength;
                runLength =1;
            }else{
                runLength++;
            }
            if(prevLength >= runLength) count++;
        }
        return count;
    }
}

