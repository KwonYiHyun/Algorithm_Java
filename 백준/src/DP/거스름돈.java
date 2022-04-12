package DP;

import java.util.Scanner;

public class 거스름돈 {
	
	static int d[]=new int[100000];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int p;
		Scanner scan=new Scanner(System.in);
		p=scan.nextInt();
		
		for (int i = 0; i < d.length; i++) {
			d[i]=0;
		}
		d[0]=0;
		if(pi(p)>100000) {
			System.out.println(-1);
		}else {
			System.out.println(pi(p));
		}
	}
	
	static int pi(int p) {
		if(p==0) return 1;
		if(p<0) return 1000000;
		if(p==2) return 1;
		if(p==5) return 1;
		if(d[p-1]!=0) return d[p-1];
		return d[p-1] = min(pi(p-5), pi(p-2))+1;
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
