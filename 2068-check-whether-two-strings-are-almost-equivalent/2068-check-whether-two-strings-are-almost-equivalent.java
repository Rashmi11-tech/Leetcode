class Solution {
    public boolean checkAlmostEquivalent(String word1, String word2) {
    int [] count = new int[26];
	int n = word1.length();

	for(int i =0; i<n; i++)
	{
		char a = word1.charAt(i);
		char b = word2.charAt(i);
		count[a-'a']++;
		count[b-'a']--;
	}
	for(int i =0; i<26; i++)
		if(Math.abs(count[i])>3)
			return false;
	return true;
    }
    
}