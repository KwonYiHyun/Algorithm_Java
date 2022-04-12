package DP;

import java.util.Scanner;

public class 피보나치비스무리한수열 {
	
	static int d[]=new int[1000000];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int p;
		Scanner scan=new Scanner(System.in);
		p=scan.nextInt();
		
		for (int i = 0; i < d.length; i++) {
			d[i]=0;
		}
		d[1]=1;
		d[2]=1;
		d[3]=1;
		
		System.out.println(pi(p));
	}
	
	static int pi(int p) {
		if(p==1) return 1;
		if(p==2) return 1;
		if(p==3) return 1;
		if(d[p]!=0) return d[p];
		return d[p] = pi(p-1)+pi(p-3);
	}

}
