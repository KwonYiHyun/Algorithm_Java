package DFS_BFS;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class DFS {
	
	static int n,m,v;
	static boolean line[][]=new boolean[1001][1001];
	static boolean ch[]=new boolean[1001];
	
	static Queue<Integer> qu=new LinkedList<Integer>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		
		for (int i = 1; i <= n; i++) {
			line[i][i]=false;
		}
		ch[v]=true;
		dfs(v);
		
		ch=new boolean[1001];
		System.out.println();
		
		ch[v]=true;
		bfs(v);
	}
	
	public static void bfs(int num) {
		System.out.print(num+" ");
		qu.add(num);
		
		while (!qu.isEmpty()) {
			int tp=qu.poll();
			for (int i = 1; i <= n; i++) {
				if(line[tp][i] && !ch[i]) {
					ch[i]=true;
					qu.add(i);
					System.out.print(i+" ");
				}
			}
		}
	}
	
	public static void dfs(int num) {
		
		System.out.print(num+" ");
		for (int i = 1; i <= n; i++) {
			if(line[num][i] && !ch[i]) {
				ch[i]=true;
				dfs(i);
			}
		}
		
	}

}
