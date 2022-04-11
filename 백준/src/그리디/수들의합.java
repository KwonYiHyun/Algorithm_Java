package 그리디;

import java.util.Scanner;

public class 수들의합 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		long s;
		s=scan.nextLong();
		long sum=0;
		int i=1;
		while (true) {
			sum+=i;
			if(s-sum<(i+1)) break;
			
			i++;
		}
		
		System.out.println(i);
	}

}
