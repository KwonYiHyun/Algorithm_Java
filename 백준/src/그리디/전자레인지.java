package 그리디;

import java.util.Scanner;

public class 전자레인지 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int t;
		int cnt=0, result=0;
		t=scan.nextInt();
		int arr[]= {300,60,10};
		int r[]=new int[3];
		
		if(t%10==0) {
			
			for (int i = 0; i < arr.length; i++) {
				cnt=0;
				cnt+=t/arr[i];
				r[i]=cnt;
				t%=arr[i];
			}
			
			for (int i = 0; i < r.length; i++) {
				System.out.print(r[i]+" ");
			}
		}else {
			System.out.println("-1");
		}
	}

}
