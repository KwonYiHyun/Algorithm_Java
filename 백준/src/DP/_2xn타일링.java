package DP;

import java.util.Scanner;

public class _2xn≈∏¿œ∏µ {
	
	static int d[]=new int[10000];

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n;
		n=scan.nextInt();
		d[0]=1;
		d[1]=1;
		System.out.println(pi(n));
	}
	
	
	static int pi(int p) {
		if(p==0) return 1;
		if(p==1) return 1;
		if(d[p]!=0) return d[p];
		return d[p] = (pi(p-1)+pi(p-2))%10007;
	}
}
