package DP;

import java.util.Scanner;

public class 계단오르기 {
	
	static int d[]=new int[10000];
	static int sum=0;
	static int score[];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n;
		n=scan.nextInt();
		score=new int[n];
		d[0]=0;
		for (int i = 1; i <= score.length; i++) {
			score[i]=scan.nextInt();
		}
		
//		int s=1;
//		while (true) {
//			
//			if(score[s]+score[s+1]+score[s+3]<score[s]+score[s+2]+score[s+3]) {
//				
//			}
//		}
	}
	
	static void pi(int p) {
		
	}
}
