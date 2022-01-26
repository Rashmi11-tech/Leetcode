class Solution {
    public String replaceDigits(String s) {
        StringBuilder sb = new StringBuilder();
    
    for (int i = 0; i < s.length(); i++) {
        if (i % 2 == 1) {
			// "s.charAt(i) - '0'" - convert char to int. Example: '1' - '0' == 1
			// "(char)('a' + 1)" - shift character and cast it to char. Example: 'a' + 1 == 98 and (char)98 == 'b'
            sb.append((char)(s.charAt(i-1) + s.charAt(i) - '0'));
        } else {
			// Append even characters without numbers
            sb.append(s.charAt(i));
        }
    }
    
    return sb.toString();
    }
}