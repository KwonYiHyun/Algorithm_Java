package DP;

import java.util.Iterator;
import java.util.Scanner;

public class ∫–πË«’ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int p;
		Scanner scan=new Scanner(System.in);
		p=scan.nextInt();
		int sum=0;
		int result=0;
		for (int i = 1; i <= p; i++) {
			String s=String.valueOf(i);
			sum=0;
			for (int j = 0; j < s.length(); j++) {
				sum+=Integer.parseInt(s.substring(j, j+1));
			}
			sum+=i;
			if(sum==p) {
				result=i;
				break;
			}
		}
		
		System.out.println(result);
	}

}
