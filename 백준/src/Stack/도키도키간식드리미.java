package Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;
import java.util.StringTokenizer;

public class 도키도키간식드리미 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Stack<Integer> stack=new Stack<>();
		ArrayList<Integer> wait=new ArrayList<>();
		Stack<Integer> result=new Stack<>();
		int n=Integer.parseInt(br.readLine());
		int m[]=new int[n];
		
		StringTokenizer str=new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < m.length; i++) {
//			m[i]=Integer.parseInt(str.nextToken());
			wait.add(Integer.parseInt(str.nextToken()));
		}
		boolean isb=true;
		int cnt=1;
		while (cnt!=(n+1)) {
			if(!stack.isEmpty() && stack.peek()==cnt) {
				stack.pop();
				cnt++;
			}else {
				try {
					if(wait.get(0)==cnt) {
						wait.remove(0);
						cnt++;
					}else {
						stack.push(wait.get(0));
						wait.remove(0);
					}					
				} catch (Exception e) {
					// TODO: handle exception
					isb=false;
					break;
				}
			}
		}
		
		if (isb) {
			System.out.println("Nice");
		}else {
			System.out.println("Sad");
		}
	}

}
