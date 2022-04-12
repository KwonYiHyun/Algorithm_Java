package DP;

import java.util.Iterator;
import java.util.Scanner;

public class 미로탐색 {
	
	static int arrsave[][]=new int[1000][1000];
//	static int N,M;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int N,M;
		N=scan.nextInt();
		M=scan.nextInt();
		scan.nextLine();
		String ary[]=new String[N];
		int arr[][]=new int[N][M];
		int result[][]=new int[N][M];
		result[0][0]=1;
		
		for (int i = 0; i < 1000; i++) {
			for (int j = 0; j < 1000; j++) {
				arrsave[i][j]=0;
			}
		}
		
		for (int i = 0; i < N; i++) {
			ary[i]=scan.nextLine();
		}
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				arr[i][j]=Integer.parseInt(ary[i].substring(j,j+1));
				if(ary[i].substring(j,j+1).equals("0")) {
					result[i][j]=1000;
					arrsave[i][j]=1000;
				}
			}
		}
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				getResult(i, j);
			}
		}
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				System.out.print(arrsave[i][j]);
			}
			System.out.println();
		}
		
		System.out.println(arrsave[1][0]);
	}
	
	static int getResult(int r, int c) {
		if(r==0 && c==0) return arrsave[r][c] = 1;
		if(r==0 && arrsave[0][c]!=1000) return arrsave[r][c]=min(getResult(0, c-1), getResult(r+1, c))+1;
		if(c==0 && arrsave[r][0]!=1000) return arrsave[r][c]=min(getResult(r-1, 0), getResult(r, c+1))+1;
//		if(arrsave[r][c]==0) return 1000;
		if(arrsave[r][c]!=0) return arrsave[r][c];
		if(arrsave[r][c]==1000) return 0;
		return arrsave[r][c]=min(getResult(r-1, c), getResult(r, c-1))+1;
	}
	
	static int min(int a, int b) {
		if(a<b) {
			return a;
		}else {
			return b;
		}
	}

}
