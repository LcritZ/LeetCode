
public class ReverseInterger {
			public int reverse(int  x) {
				String string = Integer.toString(x);				
				int len = string.length();
				char[] res = new char[len];
				if (x<0) {
					if(x==Integer.MIN_VALUE){
						return 0;
					}else {						
						return -reverse(-x);
					}
				}else {
					for(int i=0;i<len;i++){
						res[i]=string.charAt(len-1-i);
					}
					String s = String.valueOf(res);
					long r = Long.parseLong(s);
					if (r>Integer.MAX_VALUE) {
						return 0;
					}else {
						return (int)r;
					}					
				}					
			}
	public static void main(String[] args) {
		ReverseInterger revint = new ReverseInterger();
		int i = revint.reverse(2147483647);
		System.out.println(i);
	}

}
