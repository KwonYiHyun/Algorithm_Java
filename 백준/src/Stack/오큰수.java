package Stack;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

public class ¿ÀÅ«¼ö {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		Stack<Integer> stack=new Stack<>();
		StringBuilder sb=new StringBuilder();
		String nn=bf.readLine();
		int n=Integer.parseInt(nn);
		int st, result;
		int max=0;
		
//		String a=bf.readLine();
//		String arr[]=a.split(" ");
		String arr[]=new String[n];
		
		StringTokenizer str=new StringTokenizer(bf.readLine(), " ");
		for (int i = 0; i < arr.length; i++) {
			arr[i]=str.nextToken();
		}
		
		for (int i = arr.length-1; i >= 0; i--) {
			if(max<Integer.parseInt(arr[i])) max=Integer.parseInt(arr[i]);
			stack.push(Integer.parseInt(arr[i]));
		}
		
		while (!stack.isEmpty()) {
			result=-1;
			st=stack.pop();
			if(st==max) {
				
			}else {
				for (int i = 0; i < stack.size(); i++) {
					if(st<stack.get(stack.size()-i-1)) {
						result=stack.get(stack.size()-i-1);
						break;
					}
				}	
			}
			sb.append(result+" ");
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}
}
