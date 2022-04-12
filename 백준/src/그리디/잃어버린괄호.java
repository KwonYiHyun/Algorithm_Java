package 그리디;

import java.util.Scanner;

public class 잃어버린괄호 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		String n;
		n=scan.nextLine();
		
		int sum=0;
		
		if(n.contains("-")) {
			String min[]=n.split("-");
			
			for (int i = 0; i < min.length; i++) {
				String pl[]=min[i].split("\\+");
				int s=0;
				for (int j = 0; j < pl.length; j++) {
					s+=Integer.parseInt(pl[j]);
				}
				
				if(i==0) {
					sum+=s;
				}else {				
					sum-=s;
				}
				
			}
		}else {
			String pl[]=n.split("\\+");
			for (int i = 0; i < pl.length; i++) {
				sum+=Integer.parseInt(pl[i]);
			}
		}
		
		System.out.println(sum);
	}

}
