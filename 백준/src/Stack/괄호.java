package Stack;

import java.util.Scanner;
import java.util.Stack;

public class 괄호 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n;
		n=scan.nextInt();
		scan.nextLine();
		
		Stack<Integer> stack=new Stack<>();
		
		String m[]=new String[n];
		
		for (int i = 0; i < n; i++) {
			m[i]=scan.nextLine();
		}
		
		for (int i = 0; i < n; i++) {
			stack.clear();
			for (int j = 0; j < m[i].length(); j++) {
				if(m[i].substring(j,j+1).equals("(")) {
					stack.push(1);
				}else if(m[i].substring(j,j+1).equals(")")) {
					if(stack.isEmpty()) {
						stack.push(1);
						break;
					}else {						
						stack.pop();
					}
				}
			}
			
			if(stack.isEmpty()) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
		}
	}

}
