package DP;

import java.util.Scanner;

public class ÇÇÀÚ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int p;
		Scanner scan=new Scanner(System.in);
		p=scan.nextInt();
		
		System.out.println(pi(p));
	}
	
	static int pi(int p) {
		if(p==1) return 0;
		if(p==2) return 1;
		return pi(p-1)+(p-1);
	}

}
