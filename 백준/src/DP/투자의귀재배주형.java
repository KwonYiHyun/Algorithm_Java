package DP;

import java.util.Scanner;

public class 투자의귀재배주형 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int H,Y;
		Scanner scan=new Scanner(System.in);
		H=scan.nextInt();
		Y=scan.nextInt();
		
		System.out.println((int) Math.floor(pi(H,Y)));
	}
	
	static double pi(int h, int y) {
		if(y<0) return 0;
		if(y==0) return 0;
		if(y==1) return (int) Math.floor(h*1.05f);
		if(y==3) return (int) Math.floor(h*1.2f);
		if(y==5) return (int) Math.floor(h*1.35f);
		
		if(y%3==0 && y%5==0) return max((int) Math.floor(pi(h, y-3)*1.2f), (int) Math.floor(pi(h, y-5)*1.35f));
		if(y%5==0) return max((int) Math.floor(pi(h, y-3)*1.2f), (int) Math.floor(pi(h, y-5)*1.35f));
		if(y%3==0) return max((int) Math.floor(pi(h, y-3)*1.2f), (int) Math.floor(pi(h, y-5)*1.35f));
		
		return max((int) Math.floor(pi(h, y-1)*1.05f), (int) Math.floor(pi(h, y-3)*1.2f), (int) Math.floor(pi(h, y-5)*1.35f));
	}
	
	static double max(double a, double b) {
		double max=0;
		if(a>b) {
			max=a;
		}else {
			max=b;
		}
		return max;
	}
	
	static double max(double a, double b, double c) {
		double max=0;
		if(a>b) {
			max=a;
		}else {
			max=b;
		}
		if(max<c) {
			max=c;
		}
		return max;
	}

}
