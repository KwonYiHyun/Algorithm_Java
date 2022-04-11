package Stack;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class ¿ÀÅ«¼ö_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		Stack<Integer> _stack=new Stack<>();
		Stack<Integer> stack=new Stack<>();
		StringBuilder sb=new StringBuilder();
		int n;
		n=scan.nextInt();
		int st, result;
		
		for (int i = 0; i < n; i++) {
			_stack.add(scan.nextInt());
		}
		
		for (int i = 0; i < n; i++) {
			stack.push(_stack.pop());
		}
		
		int nge[]=new int[n];
		
		while (true) {
			if(stack.isEmpty()) break;
			
			result=-1;
			st=stack.peek();
			for (int i = 0; i < stack.size(); i++) {
				if(st<stack.get(stack.size()-i-1)) {
					result=stack.get(stack.size()-i-1);
					break;
				}
			}
			stack.pop();
			sb.append(result+" ");
		}
		
		System.out.println(sb);
	}
}
