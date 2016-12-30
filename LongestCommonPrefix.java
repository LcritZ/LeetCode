
public class LongestCommonPrefix {
	public String shortestString(String[] strs){
		int []len = new int[strs.length];
		for (int i = 0; i < len.length; i++) {
			len[i] = strs[i].length();
		}
		int temp  = len[0];
		int pos = 0;
		for (int i = 1; i < len.length; i++) {
			if (len[i]<temp) {
				temp = len[i];
				pos = i;
			}
		}
		return strs[pos];
	}
    public String longestCommonPrefix(String[] strs) {
    	//System.out.println(strs.length);
    	if (strs.length==0) {
			return "";
		}
    	String shortString = shortestString(strs);
    	if (shortString.length()==1) {
			for (int i = 0; i < strs.length; i++) {
				if (strs[i].charAt(0)!=shortString.charAt(0)) {
					return "";
				}
			}
			return shortString;
		}
    	int end = 0,flag = 1;
    	int strslen = strs.length;
    	int l = shortString.length();
        for (int i = 0; i < l; i++) {
			for (int j = 0;j < strslen; j++) {
				if (strs[j].charAt(i)!=shortString.charAt(i)) {
					flag = 0;
					break;						
				}
			}
			if (flag == 0) {
				System.out.println(i);
				end = i;				
				break ;
			}else {
				end =i+1;
			}
		}
        return shortString.substring(0, end);
    }
	public static void main(String[] args) {
		LongestCommonPrefix test = new LongestCommonPrefix();
		String []str = {"ab","ab","ab"};
		String result = test.longestCommonPrefix(str);
		System.out.println(result);
	}

}
