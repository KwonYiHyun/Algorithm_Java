package DP;

import java.util.ArrayList;
import java.util.Scanner;

public class 파도반수열 {
	
	static ArrayList<Long> arr=new ArrayList<>();
	static long d[]=new long[1000];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		d[0]=0;
		d[1]=1;
		d[2]=1;
		d[3]=1;
		int n;
		n=scan.nextInt();
		for (int i = 0; i < n; i++) {
			arr.add(pi(scan.nextInt()));
		}
		
		for (int i = 0; i < n; i++) {
			System.out.println(arr.get(i));
		}
	}
	
	static long pi(int p) {
		if(p==0) return 0;
		if(p==1) return 1;
		if(p==2) return 1;
		if(p==3) return 1;
		if(d[p]!=0) return d[p];
		return d[p] = pi(p-2)+pi(p-3);
	}

}
