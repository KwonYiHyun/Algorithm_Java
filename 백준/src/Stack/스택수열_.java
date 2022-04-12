package Stack;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class 스택수열_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		Stack<Integer> stack=new Stack<>();
		ArrayList<String> arr=new ArrayList<>();
		
		int n;
		n=scan.nextInt();
		int m[]=new int[n];
		
		for (int i = 0; i < n; i++) {
			m[i]=scan.nextInt();
		}
		
		int start=1;
		
		for (int i = 0; i < m.length; i++) {
			
			if(start<=m[i]) {				
				for (int j = start; j <= m[i]; j++) {
					stack.push(j);
					arr.add("+");
					start++;
				}
			}else if(stack.peek()!=m[i]) {
				arr.clear();
				arr.add("NO");
			}
			
			stack.pop();
			arr.add("-");
		}
		
		for (int i = 0; i < arr.size(); i++) {
			if(arr.get(i).equals("NO")) {
				System.out.println("NO");
				break;
			}else {
				System.out.println(arr.get(i));
			}
		}
	}
}
