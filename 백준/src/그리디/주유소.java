package 그리디;

import java.util.Scanner;

public class 주유소 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n;
		long sum=0, won=0, l=0, min=Integer.MAX_VALUE;
		n=scan.nextInt();
		
		long d[]=new long[n-1];
		long c[]=new long[n];
		
		for (int i = 0; i < n-1; i++) {
			d[i]=scan.nextInt();
			sum+=d[i];
		}
		
		for (int i = 0; i < n; i++) {
			c[i]=scan.nextInt();
		}
		
		for (int i = 0; i < n-1; i++) {
			if(min>c[i]) min=c[i];
			won+=min*d[i];
		}
		
		System.out.println(won);
	}

}