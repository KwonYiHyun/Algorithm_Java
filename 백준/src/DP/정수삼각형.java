package DP;

import java.util.Scanner;

public class 정수삼각형 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n;
		n=scan.nextInt();
		
		int m[][]=new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i+1; j++) {
				m[i][j]=scan.nextInt();
			}
		}
		
		for (int i = n-2; i >=0; i--) {
			for (int j = 0; j <= i; j++) {
				m[i][j]+=Integer.max(m[i+1][j], m[i+1][j+1]);
			}
		}
		
		System.out.println(m[0][0]);
	}

}
