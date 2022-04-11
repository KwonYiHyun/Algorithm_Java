package DP;

import java.util.Scanner;

public class 피보나치 {
	
	static long d[]=new long[100];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < d.length; i++) {
			d[i]=0;
		}
		
		int p;
		Scanner scan=new Scanner(System.in);
		p=scan.nextInt();
		
		System.out.println(pi(p));
	}
	
	static long pi(int a) {
		if(a==1) return 1;
		if(a==2) return 1;
		if(d[a]!=0) return d[a];
		
		return d[a] = pi(a-1)+pi(a-2);
	}

}
