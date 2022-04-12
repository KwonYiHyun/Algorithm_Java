package 그리디;

import java.util.Scanner;

public class 뒤집기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		String n=scan.nextLine();
		int cnt=0;
		int n0=0, n1=0;
		int sp=0;
		
		sp=Integer.parseInt(n.substring(0,1));
		if(sp==1) n1=1;
		else n0=1;
		for (int i = 1; i < n.length(); i++) {
			if(Integer.parseInt(String.valueOf(n.charAt(i)))==sp) {
				
			}else {
				sp=1-sp;
				if(sp==1) {
					n1++;
				}else {
					n0++;
				}
			}
		}
		
		System.out.println(Integer.min(n0, n1));
	}

}
