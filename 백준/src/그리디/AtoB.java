package 그리디;

import java.util.Scanner;

public class AtoB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		long a,b;
		long cnt=0;
		a=scan.nextLong();
		b=scan.nextLong();
		
		while (true) {
			if(b%10==1) {
				b/=10;
			}else if((b%10)!=1 && (b%10)%2!=0) {
				break;
			}else {
				b/=2;
			}
			cnt++;
			if(a>=b) break;
		}
		
		if(a==b) {
			System.out.println(cnt+1);
		}else {
			System.out.println("-1");
		}
	}
}
