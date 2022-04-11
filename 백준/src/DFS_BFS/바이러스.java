package DFS_BFS;

import java.util.Scanner;

public class 바이러스 {
	
	static boolean ch[]=new boolean[1001];
	static boolean line[][]=new boolean[1001][1001];
	static int ct=0;
	static int c, cnt;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		c=scan.nextInt();
		cnt=scan.nextInt();
		
		for (int i = 0; i < cnt; i++) {
			int a=scan.nextInt();
			int b=scan.nextInt();
			line[a][b]=true;
			line[b][a]=true;
		}
		
		for (int i = 0; i <= c; i++) {
			line[i][i]=true;
		}
		
		ch[1]=true;
		dfs(1);
		System.out.println(ct-1);
	}
	
	static void dfs(int num) {
		ct++;
		for (int i = 1; i <= c; i++) {
			if(line[num][i] && !ch[i]) {
				ch[i]=true;
				dfs(i);
			}
		}
	}

}
