package Stack;

import java.util.Scanner;
import java.util.Stack;

public class ±ÕÇüÀâÈù¼¼»ó {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		Stack<String> stack=new Stack<>();
		
		
		while (true) {
			String n;
			n=scan.nextLine();
			if(n.equals(".")) break;
			
			stack.clear();
			
			for (int j = 0; j < n.length(); j++) {
				if(n.substring(j,j+1).equals("(")) {
					stack.push("(");
				}else if(n.substring(j,j+1).equals(")")) {
					if(stack.isEmpty()) {
						stack.push("(");
						break;
					}else {
						if(stack.peek().equals("[")) {
							stack.push("(");
							break;
						}else {							
							stack.pop();
						}
					}
				}else if(n.substring(j,j+1).equals("[")) {
					stack.push("[");
				}else if(n.substring(j,j+1).equals("]")) {
					if(stack.isEmpty()) {
						stack.push("[");
						break;
					}else {
						if(stack.peek().equals("(")) {
							stack.push("[");
							break;
						}else {							
							stack.pop();
						}
					}
				}
			}
			
			if(stack.isEmpty()) {
				System.out.println("yes");
			}else {
				System.out.println("no");
			}
		}
	}

}
