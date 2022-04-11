package DP;

import java.util.Scanner;

public class _01≈∏¿œ {
	
	static int d[]=new int[10000000];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n;
		n=scan.nextInt();
		
		d[0]=0;
		d[1]=1;
		d[2]=2;
		System.out.println(pi(n));
	}
	
	static int pi(int p) {
		if(p==0) return 0;
		if(p==1) return 1;
		if(p==2) return 2;
		if(d[p]!=0) return d[p];
		return d[p]=(pi(p-1)+pi(p-2))%15746;
	}
}