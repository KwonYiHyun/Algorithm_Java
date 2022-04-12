package Sort;

import java.util.Scanner;

public class 피보나치비스무리한수열 {
	
	static long d[]=new long[1000];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int p;
		Scanner scan=new Scanner(System.in);
		p=scan.nextInt();
		
		d[1]=1;
		d[2]=1;
		d[3]=1;
		
		System.out.println(pi(p));
	}
	
	static long pi(int p) {
		if(p==1) return 1;
		if(p==2) return 1;
		if(p==3) return 1;
		if(d[p]!=0) return d[p];
		return d[p] = pi(p-1)+pi(p-3);
	}

}
