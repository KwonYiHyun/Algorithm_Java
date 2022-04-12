package Stack;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class 스택수열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		Stack<Integer> stack=new Stack<>();
		ArrayList<String> arr=new ArrayList<>();
		int cnt=1;
		int max=Integer.MIN_VALUE;
		
		int n;
		n=scan.nextInt();
		int m[]=new int[n];
		
		for (int i = 0; i < n; i++) {
			m[i]=scan.nextInt();
		}
		
		for (int i = 0; i < m.length; i++) {
			if(i==0) {
				for (int j = 1; j <= m[i]; j++) {
					stack.push(j);
					arr.add("+");
					if(max<cnt) max=cnt;
					cnt++;
				}
				stack.pop();
				arr.add("-");
			}else {
				
				if(m[i]>=m[i-1]) {
					if(m[i]<=max && !stack.contains(m[i])) {
						arr.clear();
						arr.add("NO");
					}else {
						int t=m[i]-cnt;
						for (int j = 0; j <= t; j++) {
							stack.push(cnt);
							arr.add("+");
							if(max<cnt) max=cnt;
							cnt++;
						}
						stack.pop();
						arr.add("-");
					}
				}else {
					stack.pop();
					arr.add("-");
				}
			}
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
