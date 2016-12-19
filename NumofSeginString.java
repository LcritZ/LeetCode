
public class NumofSeginString {
			int i=0;
			int count =0;
			char []temp;
			public NumofSeginString() {
				i =0;
				count = 0;
			}
			public int countSegments(String s) {
		        temp = s.toCharArray();
		        System.out.println(temp.length);
		        while (i<temp.length) {
					if (temp[i]==' ') {
						if (i<temp.length-1) {
							while(temp[i]==' '){
							i++;
							if (i==temp.length-1) {								
								break;
							}	
							}
						}						
						if (i==temp.length-1) {
							if(temp[i]!=' '){
									count++;
									i++;
							}else {
								i++;
							}					
						}						
					}else {
							while(temp[i]!=' '){
								if (i<=temp.length-1) {
								         i++;
								if (i==temp.length) {
									break;
								}
							}
						}					
						count++;
					if (i==temp.length) {
						break;
						}
		        }
		        }
		        return count;
		    }
	public static void main(String[] args) {
			NumofSeginString test = new NumofSeginString();
			int i =test.countSegments("i Jh");
			System.out.println(i);
	}

}
