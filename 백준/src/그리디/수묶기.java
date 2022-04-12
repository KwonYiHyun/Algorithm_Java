package 그리디;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class 수묶기 {
	
	static PriorityQueue<Integer> pqp=new PriorityQueue<Integer>(Comparator.reverseOrder());
	static PriorityQueue<Integer> pqm=new PriorityQueue<Integer>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n;
		int sum=0;
		n=scan.nextInt();
		for (int i = 0; i < n; i++) {
			int s=scan.nextInt();
			if(s>0) {
				pqp.add(s);
			}else {
				pqm.add(s);
			}
		}
		
		while (!pqp.isEmpty()) {
			if(pqp.size()==1) {
				sum+=pqp.poll();
			}else{
				int a=pqp.poll();
				int b=pqp.poll();
				sum+=Integer.max(a+b, a*b);
			}
		}
		
		while (!pqm.isEmpty()) {
			if(pqm.size()==1) {
				sum+=pqm.poll();
			}else {
				int a=pqm.poll();
				int b=pqm.poll();
				sum+=Integer.max(a+b, a*b);
			}
		}
		
		System.out.println(sum);
	}

}
