package DP;

import java.util.Scanner;

public class 만들기1로 {
	
	static int cnt=0, p;
	static int d[]=new int[1000000];

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		p=scan.nextInt();
		
		for (int i = 0; i < d.length; i++) {
			d[i]=0;
		}
		d[0]=1;
		System.out.println(pi(p));
	}
	
	static int pi(int p) {
		if(p==1) return 0;
		if(d[p-1]!=0) return d[p-1];
		if(p%3==0 && p%2==0) {
			return d[p-1] = min(pi(p/3), pi(p/2), pi(p-1))+1;
		}
		if(p%3==0) {
			return d[p-1] = min(pi(p/3), pi(p-1))+1;
		}
		if(p%2==0) {
			return d[p-1] = min(pi(p/2), pi(p-1))+1;
		}
		
		return d[p-1] = pi(p-1)+1;
		
	}
	
	static int max(int a, int b, int c) {
		int max=0;
		max=Integer.max(a, b);
		max=Integer.max(max, c);
		return max;
	}
	
	static int min(int a, int b, int c) {
		int min=0;
		min=Integer.min(a, b);
		min=Integer.min(min, c);
		return min;
	}
	
	static int min(int a, int b) {
		if(a<b) {
			return a;
		}else {
			return b;
		}
	}

}
