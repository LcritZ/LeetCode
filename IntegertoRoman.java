package leetcodeMarch;

public class IntegertoRoman {

	public String intToRoman(int num) {
        String [][]mode ={
        		{"","I","II","III","IV","V","VI","VII","VIII","IX"},
        		{"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"},
        		{"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"},
        		{"","M","MM","MMM"}  
        		};
        StringBuilder s = new StringBuilder();
        s.append(mode[3][num/1000]);
        s.append(mode[2][num/100%10]);
        s.append(mode[1][num/10%10]);
        s.append(mode[0][num%10]);
        String ss = s.toString();
        return ss;
        }


	public static void main(String[] args) {
		IntegertoRoman i1 = new IntegertoRoman();
		System.out.println(i1.intToRoman(453));
		
	}

}
