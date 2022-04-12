package DFS_BFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 미로탐색_ {
	
	static int dx[]= {0,0,1,-1};
	static int dy[]= {1,-1,0,0};
	
	static boolean ch[][]=new boolean[1001][1001];
	static int line[][]=new int[1001][1001];
	
	static Queue<int[]> q=new LinkedList<int[]>();
	
	static int n,m;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		n=scan.nextInt();
		m=scan.nextInt();
		scan.nextLine();
		
		for (int i = 1; i <= n; i++) {
			String s=scan.nextLine();
			for (int j = 0; j < s.length(); j++) {
				line[i][j+1]=Integer.parseInt(s.substring(j,j+1));
			}
		}
		
		bfs(1,1);
		System.out.println(line[n][m]);
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
				if (nx>=1 && ny>=1 && nx<=n && ny<=m) {
					if (line[nx][ny]==1 && !ch[nx][ny]) {
						ch[nx][ny]=true;
						q.add(new int[] {nx,ny});
						line[nx][ny]=line[zx][zy]+1;
					}
				}
			}
		}
	}

}
