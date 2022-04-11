package DP;

import java.util.ArrayList;
import java.util.Scanner;

public class 피보나치함수 {
	
	static int s1[]=new int[100];
	static int s2[]=new int[100];
	static int sum1=0,sum2=0;
	
	static ArrayList<Integer> arr=new ArrayList<>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		s1[0]=1;
		s1[1]=0;
		s2[0]=0;
		s2[1]=1;
		int n=scan.nextInt();
		for (int i = 0; i < n; i++) {
			int a=scan.nextInt();
			arr.add(a);
		}
		
		for (int i = 0; i < n; i++) {			
			System.out.println(pi1(arr.get(i))+" "+pi2(arr.get(i)));
		}
		
	}
	
	static int pi1(int p) {
		if(p==0) {
			return 1;
		}
		if(p==1) {
			return 0;
		}
		if(s1[p]!=0) {
			return s1[p];
		}
		return s1[p] = pi1(p-1)+pi1(p-2);
	}
	
	static int pi2(int p) {
		if(p==0) {
			return 0;
		}
		if(p==1) {
			return 1;
		}
		if(s2[p]!=0) {
			return s2[p];
		}
		return s2[p] = pi2(p-1)+pi2(p-2);
	}
}
