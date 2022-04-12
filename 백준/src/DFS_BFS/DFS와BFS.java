package DFS_BFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class DFS와BFS {
	
	static boolean ch[]=new boolean[1001];
	static boolean line[][]=new boolean[1001][1001];
	
	static int n;
	static int m;
	static int v;
	
	static Queue<Integer> q=new LinkedList<Integer>();

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		n=scan.nextInt();
		m=scan.nextInt();
		v=scan.nextInt();
		
		for (int i = 0; i < m; i++) {
			int a=scan.nextInt();
			int b=scan.nextInt();
			line[a][b]=true;
			line[b][a]=true;
		}
		
		dfs(v);
		System.out.println("");
		ch=new boolean[1001];
		
		bfs(v);
	}
	
	static void dfs(int num) {
		ch[num]=true;
		System.out.print(num+" ");
		for (int i = 1; i <= n; i++) {
			if(line[num][i] && !ch[i]) {
				dfs(i);
			}
		}
	}
	
	static void bfs(int num) {
		ch[num]=true;
		q.add(num);
		System.out.print(num+" ");
		
		while (!q.isEmpty()) {
			int t=q.poll();
			for (int i = 1; i <= n; i++) {
				if(line[t][i] && !ch[i]) {
					ch[i]=true;
					q.add(i);
					System.out.print(i+" ");
				}
			}
		}
	}

}
