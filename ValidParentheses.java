import java.util.Arrays;
import java.util.Stack;

public class ValidParentheses {

	 public boolean isValid(String s) {
		if (s.length()%2!=0)
	          return false;
		if (s.length()==0) {
			return true;
		}
       
		if (s.charAt(0)==')'||s.charAt(0)==']'||s.charAt(0)=='}') {
			return false;
		}
		Stack<Character> charStack = new Stack<Character>();
		 for(int i=0;i<s.length();i++){
			 switch (s.charAt(i)) {
				case '(':
					charStack.push(s.charAt(i));
					break;
				case '[':
					charStack.push(s.charAt(i));
					break;
				case '{':
					charStack.push(s.charAt(i));
					break;
				case ')':
					char c1 = charStack.pop();
					if (c1!='(') {
						return false;
					}
					break;
				case ']':
					char c2 = charStack.pop();
					if (c2!='[') {
						return false;
					}
					break;
				case '}':
					char c3 = charStack.pop();
					if (c3!='{') {
						return false;
					}
					break;
				default:
					break;
				}
		 }
		 if (!charStack.empty()) {
			return false;
		}else {			
			return true;
		}
	 }

	public static void main(String[] args) {
		String s1 = "12{}()";
		ValidParentheses v1 = new ValidParentheses();
		System.out.println(v1.isValid(s1));
	}

}
