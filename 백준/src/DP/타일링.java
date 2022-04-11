package DP;

import java.util.Scanner;

public class ≈∏¿œ∏µ {
	
	static int d[]=new int[100];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int p;
		Scanner scan=new Scanner(System.in);
		p=scan.nextInt();
		for (int i = 0; i < d.length; i++) {
			d[i]=0;
		}
		d[0]=1;
		d[1]=3;
		
		System.out.println(pi(p));
	}
	
	static int pi(int p) {
		if(p==1) return 1;
		if(p==2) return 3;
		if(d[p]!=0) return d[p];
		return d[p]=pi(p-2);
	}

}
