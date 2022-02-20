class Solution {
    public String arrangeWords(String text) {
        text = text.toLowerCase();
        String arr[] = text.split("\\s");
        Arrays.sort(arr, (String a, String b)-> Integer.compare(a.length(),b.length()));
        String ans=arr[0].substring(0,1).toUpperCase()+arr[0].substring(1)+" ";	
        for(int i=1;i<arr.length;i++)
        {  
            ans+=arr[i]+" ";
        }
        return ans.trim();
    }
}