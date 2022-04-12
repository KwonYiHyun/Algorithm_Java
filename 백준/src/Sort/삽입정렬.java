package Sort;

import java.util.Scanner;

public class 삽입정렬 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int p=0;
		Scanner scan=new Scanner(System.in);
		p=scan.nextInt();
		int s[]=new int[p];
		for (int i = 0; i < p; i++) {
			s[i]=scan.nextInt();
		}
		
		int temp=0;
		for (int i = 1; i < s.length; i++) {
			for (int j = 0; j < i; j++) {
				if(s[i]<s[j]) {
					temp=s[i];
					s[i]=s[j];
					s[j]=temp;
				}
			}
		}
		
		for (int i = 0; i < s.length; i++) {
			System.out.print(s[i]);
		}
	}

}
