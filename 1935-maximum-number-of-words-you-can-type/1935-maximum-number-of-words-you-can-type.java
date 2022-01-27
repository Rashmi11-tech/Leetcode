class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        int c = 0;
        String[] tp = text.split(" ");
        
        for(String t : tp){
            for(char ch : brokenLetters.toCharArray()) {
            	if(t.chars().anyMatch(p->p == ch)) {
            		c++;
            		break;
            	}
            }
        }
        return tp.length - c;
    }
}