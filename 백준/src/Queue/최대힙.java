package Queue;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class 최대힙 {

	static PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
	static StringBuilder sb=new StringBuilder();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n;
		n=scan.nextInt();
		for (int i = 0; i < n; i++) {
			int s=scan.nextInt();
			if(s==0) {
				print();
			}else {
				pq.add(s);
			}
		}
		
		System.out.println(sb);
	}
	
	static void print() {
		if(pq.isEmpty()) {
			sb.append("0\n");
		}else {
			sb.append(pq.poll()+"\n");
		}
	}
	
}
