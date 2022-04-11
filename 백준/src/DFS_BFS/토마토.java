package DFS_BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ≈‰∏∂≈‰ {
	
	static Queue<int[]> q=new LinkedList<int[]>();
	static int dx[]= {0,0,1,-1};
	static int dy[]= {1,-1,0,0};
	static boolean ch[][]=new boolean[1001][1001];
	static int line[][]=new int[1001][1001];
	
	static int n,m,cnt=0;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s=br.readLine();
		n=Integer.parseInt(s.split(" ")[0]);
		m=Integer.parseInt(s.split(" ")[1]);
		
		for (int i = 1; i <= m; i++) {
			String t[]=br.readLine().split(" ");
			for (int j = 1; j <= n; j++) {
				line[j][i]=Integer.parseInt(t[j-1]);
			}
		}
		
		for (int i = 1; i <= m; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print(line[j][i]+"\t");
			}
			System.out.println();
		}
		System.out.println("=============================");
		bfs(n,m);
		
		for (int i = 1; i <= m; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print(line[j][i]+"\t");
			}
			System.out.println();
		}
		
//		if(cnt==0) {
//			System.out.println("0");
//		}else {
//			if(cnt==n*m) {
//				System.out.println("-1");
//			}else {
//				System.out.println(cnt+1);
//			}
//		}
	}
	
	static void bfs(int x, int y) {
		ch[x][y]=true;
		q.add(new int[] {x,y});
		while (!q.isEmpty()) {
			int now[]=q.poll();
			int zx=now[0];
			int zy=now[1];
			
			for (int i = 0; i < 4; i++) {
				int nx=zx+dx[i];
				int ny=zy+dy[i];
				if(nx>=1 && ny>=1 && nx<=n && ny<=m) {
					if(line[nx][ny]==0 && !ch[nx][ny]) {
						ch[nx][ny]=true;
						q.add(new int[] {nx,ny});
						line[nx][ny]=line[zx][zy]+1;
					}
				}
			}
		}
	}
}
