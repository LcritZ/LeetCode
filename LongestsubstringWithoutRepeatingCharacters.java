import java.lang.Math;
public class LongestsubstringWithoutRepeatingCharacters {
	public int lengthOfLongestSubstring(String s) {
			if (s==null) {
				return 0;
			}
			if (s.length()==0|s.length()==1) {
				return s.length();
			}
        	char []temp = s.toCharArray();
        	int firstnum = 0;
        	int maxlen =1;
        	for (int i = 0; i < temp.length; i++) {
        		for (int j = i-1; j >= firstnum; j--) {
					if (temp[i]==temp[j]) {
						firstnum = j+1;
						continue;
					}
				}
        		maxlen = Math.max(maxlen, i-firstnum+1);				
			}
        	return maxlen;
    }

	public static void main(String[] args) {
		LongestsubstringWithoutRepeatingCharacters test = new LongestsubstringWithoutRepeatingCharacters();
		int result = test.lengthOfLongestSubstring("abcabcbb");
		System.out.println(result);
	}

}
