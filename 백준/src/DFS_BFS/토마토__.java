package DFS_BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ≈‰∏∂≈‰__ {
	
	static Queue<int[]> q=new LinkedList<int[]>();
	static int dx[]= {0,0,1,-1};
	static int dy[]= {1,-1,0,0};
	static boolean ch[][]=new boolean[1001][1001];
	static int line[][]=new int[1001][1001];
	
	static int n,m,cnt=0;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer str=null;
		str=new StringTokenizer(br.readLine(), " ");
		n=Integer.parseInt(str.nextToken());
		m=Integer.parseInt(str.nextToken());
		
		for (int i = 1; i <= m; i++) {
			str=new StringTokenizer(br.readLine()," ");
			for (int j = 1; j <= n; j++) {
				line[j][i]=Integer.parseInt(str.nextToken());
			}
		}
		
		for (int j = 1; j <= n; j++) {
			for (int k = 1; k <= m; k++) {
				if(line[j][k]==1 && !ch[j][k]) {
					q.add(new int[] {j,k});
				}
			}
		}
		
		
		bfs();
	}
	
	static void bfs() {
		while (!q.isEmpty()) {
			int now[]=q.poll();
			int zx=now[0];
			int zy=now[1];
			for (int i = 0; i < 4; i++) {
				int nx=zx+dx[i];
				int ny=zy+dy[i];
				if(nx>=1 && ny>=1 && nx<=n && ny<=m) {
					if(line[nx][ny]==0 && !ch[nx][ny]) {
						line[nx][ny]=line[zx][zy]+1;
						q.add(new int[] {nx,ny});
					}
				}
			}
		}
		int max=0;
		boolean iszero=true;
		for (int j = 1; j <= n; j++) {
			for (int k = 1; k <= m; k++) {
				if(line[j][k]>max) max=line[j][k];
				if(line[j][k]==0) iszero=false;
			}
		}
		
		if(iszero) {
			System.out.println(max-1);
		}else {
			System.out.println("-1");
		}
	}
}
