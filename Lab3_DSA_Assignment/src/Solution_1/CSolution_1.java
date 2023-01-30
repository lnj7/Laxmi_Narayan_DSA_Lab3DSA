package Solution_1;

import java.util.Scanner;
import java.util.Stack;

public class CSolution_1 {

	public CSolution_1() {
		// TODO Auto-generated constructor stub
	}

	boolean isBalance(String str) {


		Stack<Character> stack=new Stack<>();


		for(int i=0;i<str.length();i++) {

			char chkChar=str.charAt(i);

			if(chkChar=='['||chkChar=='{'||chkChar=='(') {

				stack.push(chkChar);
				continue;

			}

			if(stack.isEmpty())
			{
				return false;	
			}

			char c;

			switch(chkChar) {
			case ')':
				c=stack.pop();
				if(c=='{'||c=='[')
					return false;
				break;
			case '}':
				c=stack.pop();
				if(c=='('||c=='[')
					return false;
				break;
			case ']':
				c=stack.pop();
				if(c=='('||c=='{')
					return false;
				break;
			default:
				break;
			}

		}
		return (stack.isEmpty());

	}

	public void balanceString() {

		Scanner sc = new Scanner(System.in);
		String str=sc.nextLine();
		//		String str="[()}]";

		boolean result=	isBalance(str);
		if(result) {
			System.out.print("The entered String has Balanced Brackets\n");
		}else {
			System.out.print("The entered Strings do not contain Balanced Brackets\n");
		}

	}

}
