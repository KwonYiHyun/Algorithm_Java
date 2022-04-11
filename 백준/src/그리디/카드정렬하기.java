package 그리디;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.concurrent.PriorityBlockingQueue;

public class 카드정렬하기 {
	
	static PriorityQueue<Integer> pq=new PriorityQueue<Integer>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n;
		int sum=0;
		n=scan.nextInt();
		for (int i = 0; i < n; i++) {
			pq.add(scan.nextInt());
		}
		
		while (!pq.isEmpty()) {
			if(pq.size()==1) {
				pq.poll();
				sum=0;
			}else if(pq.size()==2) {
				sum+=pq.poll();
				sum+=pq.poll();
			}else {
				int a=pq.poll();
				int b=pq.poll();
				int c=a+b;
				sum+=c;
				pq.add(c);
			}
		}
		
		System.out.println(sum);
	}

}
