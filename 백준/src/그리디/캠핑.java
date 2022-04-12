package 그리디;

import java.util.ArrayList;
import java.util.Scanner;

public class 캠핑 {
	
	static StringBuilder sb=new StringBuilder();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int l,p,v;
		int i=1;
		while (true) {
			l=scan.nextInt();
			p=scan.nextInt();
			v=scan.nextInt();
			if(l==0 && p==0 && v==0) break;
			
			int n=v/p;
			int m=v%p;
			if(m<l) {
				sb.append("Case "+i+": "+((l*n)+m)+"\n");
			}else {
				sb.append("Case "+i+": "+((l*n)+l)+"\n");
			}
			
			i++;
		}
		
		System.out.println(sb);
	}

}
