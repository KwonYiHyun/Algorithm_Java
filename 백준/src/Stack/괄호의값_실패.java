package Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class 괄호의값_실패 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String n=br.readLine();
		
		StringBuilder sb=new StringBuilder();
		
		int cnt=0;
		Stack<String> stack=new Stack<>();
		stack.clear();
		for (int i = 0; i < n.length(); i++) {
			
			String word=n.substring(i,i+1);
			sb.append(word);
			if(stack.isEmpty()) {
				stack.push(word);
			}else if(word.equals("(")) {
				if(stack.peek().equals(")")) {
					stack.pop();
				}else if(stack.peek().equals("(")) {
					stack.push("(");
				}
			}else if(word.equals(")")) {
				if(stack.peek().equals(")")) {
					stack.push(")");
				}else if(stack.peek().equals("(")) {
					stack.pop();
				}
			}else if(word.equals("[")) {
				if(stack.peek().equals("]")) {
					stack.pop();
				}else if(stack.peek().equals("[")) {
					stack.push("[");
				}
			}else if(word.equals("]")) {
				if(stack.peek().equals("]")) {
					stack.push("]");
				}else if(stack.peek().equals("[")) {
					stack.pop();
				}
			}			
		}
		
		if(stack.isEmpty()) {
			cnt++;
		}else {
			
		}
		
		Stack<String> st=new Stack<>();
		int sum=0;
		int s=0;
		if (cnt==0) {
			System.out.println("0");
		}else {
			for (int i = 0; i < n.length(); i++) {
				String word=n.substring(i,i+1);
				st.push(word);
				if(i==0) {
					if(word.equals("(")) {
						s=2;
					}else {
						s=3;
					}
				}else {
					
				}
			}
			
			System.out.println(n);
			System.out.println(s);
		}
	}

}
