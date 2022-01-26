class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
Set<Character> set = new HashSet<>();
    int result = 0;
    
	// Fill HashSet with allowed characters
    for (Character c : allowed.toCharArray()) {
        set.add(c);
    }
    
    for (String word : words) {
        for (int i = 0; i < word.length(); i++) {
			// If HashSet does not contain allowed characters, do not
			// increment the result counter and go to another word
            if (!set.contains(word.charAt(i))) {
                break;
            }
            
			// Increament result counter only if we have reached the end of the word
            if (i == word.length() - 1) {
                result++;
            }
        }
        
    }
    
    return result;
	}
}