package DFS_BFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 미로탐색 {
	
	static boolean ch[][]=new boolean[1001][1001];
	static int line[][]=new int[1001][1001];
	static int xx,yy;
	
	static int dx[]= {0,0,1,-1};
	static int dy[]= {1,-1,0,0};
	
	static Queue<int[]> q=new LinkedList<int[]>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		xx=scan.nextInt();
		yy=scan.nextInt();
		
		scan.nextLine();
		
		for (int i = 1; i <= xx; i++) {
			String n=scan.nextLine();
			for (int j = 1; j <= yy; j++) {
				line[i][j]= Integer.parseInt(n.charAt(j-1)+"");
			}
		}
		
		bfs(1,1);
		System.out.println(line[xx][yy]);
		
	}
	
	static void bfs(int x, int y) {
		q.add(new int[] {x,y});
		ch[x][y]=true;
		while (!q.isEmpty()) {
			int now[]=q.poll();
			int nx=now[0];
			int ny=now[1];
			for (int i = 0; i < 4; i++) {
				int nnx=nx+dx[i];
				int nny=ny+dy[i];
				if(nnx>=1 && nny>=1 && nnx<=xx && nny<=yy) {
					if(line[nnx][nny]==1 && !ch[nnx][nny]) {
						q.add(new int[] {nnx,nny});
						line[nnx][nny]=line[nx][ny]+1;
					}
				}
			}
		}
	}
}
