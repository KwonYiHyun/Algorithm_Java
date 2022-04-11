package Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class ž {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Stack<Integer> stack=new Stack<>();
		int n=Integer.parseInt(br.readLine());
		int arr[]=new int[n];
		int index[]=new int[n];
		
		StringTokenizer str=new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < arr.length; i++) {
			arr[i]=Integer.parseInt(str.nextToken());
		}
		
		for (int i = arr.length-1; i >= 0; i--) {
			while (!stack.isEmpty() && arr[i]>arr[stack.peek()]) {
				index[stack.pop()]=(i+1);
			}
			
			stack.push(i);
		}
		
		while (!stack.isEmpty()) {
			index[stack.pop()]=0;
		}
		
		for (int i = 0; i < index.length; i++) {
			System.out.print(index[i]+" ");
		}
	}
}
