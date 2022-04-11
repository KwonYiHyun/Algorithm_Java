package DP;

import java.util.Scanner;

public class RPG°Å¸® {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n;
		n=scan.nextInt();
		int m[][]=new int[n][3];
		int s[][]=new int[n][3];
		for (int i = 0; i < n; i++) {
			int a=scan.nextInt();
			int b=scan.nextInt();
			int c=scan.nextInt();
			m[i][0]=a;
			m[i][1]=b;
			m[i][2]=c;
		}
		
		for (int i = 1; i < n; i++) {
			m[i][0]+=Integer.min(m[i-1][1], m[i-1][2]);
			m[i][1]+=Integer.min(m[i-1][0], m[i-1][2]);
			m[i][2]+=Integer.min(m[i-1][0], m[i-1][1]);
		}
		
		System.out.println(m[n-1][0]+" / "+m[n-1][1]+" / "+m[n-1][2]);
	}
}
