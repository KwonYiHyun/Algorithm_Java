package DP;

import java.util.ArrayList;
import java.util.Scanner;

public class 신나는함수실행 {
	
	static int d[][][]=new int[100][100][100];
	static ArrayList<String> arr=new ArrayList<>();
	static ArrayList<Integer> save=new ArrayList<>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int a,b,c;
		d[0][0][0]=1;
		while (true) {
			a=scan.nextInt();
			b=scan.nextInt();
			c=scan.nextInt();
			if(a==-1 && b==-1 && c==-1) {
				break;
			}
			arr.add("w("+a+", "+b+", "+c+") = "+w(a,b,c));
		}
		
		for (int i = 0; i < arr.size(); i++) {
			System.out.println(arr.get(i));
		}
	}
	
	static int w(int a, int b, int c) {
		if(a<=0 || b<=0 || c<=0) return 1;
		if(d[a][b][c]!=0) return d[a][b][c];
		if(a>20 || b>20 || c>20) return d[a][b][c] = w(20,20,20);
		if(a<b && b<c) return d[a][b][c] = w(a,b,c-1) + w(a,b-1,c-1) - w(a,b-1,c);
		return d[a][b][c] = w(a-1,b,c) + w(a-1,b-1,c) + w(a-1,b,c-1) - w(a-1,b-1,c-1);
	}
}
