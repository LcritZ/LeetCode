package leetcodeMarch;

public class RomantoInteger {

    public int romanToInt(String s) {
    	int res = 0;
    	while(s!=null){
    		if (s.length()==0) {
				break;
			}
    		if (s.startsWith("M")) {
				res+=1000;
				s = s.substring(1);
				System.out.println(s);
				continue;
			}
    		if (s.startsWith("CM")) {
				res+=900;
				s = s.substring(2);
				continue;
			}
    		if (s.startsWith("CD")) {
				res+=400;
				s = s.substring(2);
				continue;
			}
    		if (s.startsWith("D")) {
				res+=500;
				s = s.substring(1);
				continue;
			}
    		if (s.startsWith("C")) {
				res+=100;
				s = s.substring(1);
				continue;
			}
    		if (s.startsWith("XC")) {
				res+=90;
				s = s.substring(2);
				continue;
			}
    		if (s.startsWith("XL")) {
				res+=40;
				s = s.substring(2);
				continue;
			}
    		if (s.startsWith("L")) {
				res+=50;
				s = s.substring(1);
				continue;
			}
    		if (s.startsWith("X")) {
				res+=10;
				s = s.substring(1);
				continue;
			}
    		if (s.startsWith("IX")) {
				res+=9;
				s = s.substring(2);
				continue;
			}
    		if (s.startsWith("IV")) {
				res+=4;
				s = s.substring(2);
				continue;
			}
    		if (s.startsWith("V")) {
				res+=5;
				s = s.substring(1);
				continue;
			}
    		if (s.startsWith("I")) {
				res+=1;
				s = s.substring(1);
				continue;
			}
    		
    		System.out.println(s);
    	}
    	return res;
    }


	public static void main(String[] args) {
		RomantoInteger r1 = new RomantoInteger();
		System.out.println(r1.romanToInt("CDLV"));
	}

}
