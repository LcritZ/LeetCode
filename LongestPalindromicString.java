
public class LongestPalindromicString {
	public String longestPalindrome(String s) {
		char[] temp = s.toCharArray();
		String result;
		int start1 = 0, end1 = 0, len1 = 0;
		int start2 = 0, end2 = 0, len2 = 0;
		int start = 0, end = 0, len = 0;
		for (int i = 0; i < temp.length - 2; i++) {
			if (temp[i] == temp[i + 2]) {
				int st = 0, e = 0;
				for (int j = 0; j <= i && (i + 2 + j) < temp.length; j++) {
					if ((temp[i - j] == temp[i + 2 + j])) {
						st = i - j;
						e = i + 2 + j;
					} else {
						break;
					}
				}
				if ((e - st) > len1) {
					start1 = st;
					end1 = e;
					len1 = e - st + 1;
				}
			}
		}
		for (int k = 0; k < temp.length - 1; k++) {
			if (temp[k] == temp[k + 1]) {
				int st = k, e = k + 1;
				for (int j = 0; j <= k && (k + 1 + j) < temp.length; j++) {
					if (temp[k - j] == temp[k + 1 + j]) {
						st = k - j;
						e = k + 1 + j;
					} else {
						break;
					}
				}
				if ((e - st + 1) > len2) {
					start2 = st;
					end2 = e;
					len2 = e - st + 1;
				}
			}
		}
		if (len1 >= len2) {
			start = start1;
			end = end1;
			len = len1;
		} else {
			start = start2;
			end = end2;
			len = len2;
		}
		if (s.length() == 1) {
			return s;
		}
		if (len == 0) {
			return null;
		} else {
			result = s.substring(start, end + 1);
			return result;
		}

	}

	public static void main(String[] args) {
		LongestPalindromicString test = new LongestPalindromicString();
		String temp = test.longestPalindrome("aaaa");
		System.out.println(temp);
	}

}
