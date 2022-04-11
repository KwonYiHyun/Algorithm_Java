package Queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class 요세푸스문제0 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String mm=br.readLine();
		int n=Integer.parseInt(mm.split(" ")[0]);
		int m=Integer.parseInt(mm.split(" ")[1]);
		StringBuilder sb=new StringBuilder();
		
		Queue<Integer> queue=new LinkedList<Integer>();
		ArrayList<Integer> arr=new ArrayList<>();
		
		for (int i = 1; i <= n; i++) {
			arr.add(i);
		}
		
		int index=m-1;
		while (true) {
			queue.add(arr.get(index));
			sb.append(arr.get(index)+", ");
			if(queue.size()==n) break;
			arr.remove(index);
			index=(index+m-1)%arr.size();
		}
		
		System.out.println("<"+sb.toString().substring(0, sb.toString().length()-2)+">");
	}

}
