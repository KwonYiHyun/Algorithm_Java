package Sort;

import java.util.Scanner;

public class 세수정렬 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[3];
		Scanner scan=new Scanner(System.in);
		a[0]=scan.nextInt();
		a[1]=scan.nextInt();
		a[2]=scan.nextInt();
		
		int temp=0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		
		System.out.println(a[0]+" "+a[1]+" "+a[2]);
	}

}
