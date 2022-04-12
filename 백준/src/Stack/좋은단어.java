package Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class 좋은단어 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		String m[]=new String[n];
		for (int i = 0; i < n; i++) {
			m[i]=br.readLine();
		}
		int cnt=0;
		Stack<String> stack=new Stack<>();
		for (int i = 0; i < m.length; i++) {
			stack.clear();
			for (int j = 0; j < m[i].length(); j++) {
				String word=m[i].substring(j,j+1);
				if(stack.isEmpty()) {
					stack.push(word);
				}else if(word.equals("A")) {
					if(stack.peek().equals("A")) {
						stack.pop();
					}else if(stack.peek().equals("B")) {
						stack.push("A");
					}
				}else if(word.equals("B")) {
					if(stack.peek().equals("A")) {
						stack.push("B");
					}else if(stack.peek().equals("B")) {
						stack.pop();
					}
				}
			}
			
			if(stack.isEmpty()) {
				cnt++;
			}else {
				
			}
		}
		
		System.out.println(cnt);
	}

}
