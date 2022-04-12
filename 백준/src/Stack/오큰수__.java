package Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

public class 오큰수__ {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		Stack<Integer> stack=new Stack<>();
		StringBuilder sb=new StringBuilder();
		String nn=bf.readLine();
		int n=Integer.parseInt(nn);
		
		String arr[]=new String[n];
		
		StringTokenizer st=new StringTokenizer(bf.readLine()," ");
		for (int i = 0; i < arr.length; i++) {
			arr[i]=st.nextToken();
		}
		
		for (int i = 0; i < n; i++) {
			while (!stack.isEmpty() && Integer.parseInt(arr[stack.peek()]) < Integer.parseInt(arr[i])) {
				arr[stack.pop()]=arr[i];
			}
			stack.push(i);
		}
		
		while (!stack.isEmpty()) {
			arr[stack.pop()]="-1";
		}
		
		for (int i = 0; i < arr.length; i++) {
			sb.append(arr[i]+" ");
		}
		
		System.out.println(sb);
	}
}
