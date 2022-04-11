package DFS_BFS;

import java.util.ArrayList;
import java.util.Scanner;

public class ¿Ø±‚≥ÛπË√ﬂ {
	
	static boolean ch[][]=new boolean[1001][1001];
	static int grow[][]=new int[1001][1001];
	static int cnt=0;
	
	static int dx[]= {0,0,1,-1};
	static int dy[]= {1,-1,0,0};
	
	static ArrayList<Integer> arr=new ArrayList<>();
	
	static int m, n, k;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int ct=scan.nextInt();
		
		for (int i = 0; i < ct; i++) {
			ch=new boolean[1001][1001];
			grow=new int[1001][1001];
			cnt=0;
			m=scan.nextInt();
			n=scan.nextInt();
			k=scan.nextInt();
			for (int j = 0; j < k; j++) {
				int x=scan.nextInt()+1;
				int y=scan.nextInt()+1;
				grow[x][y]=1;
			}
			
			for (int j = 1; j <= m; j++) {
				for (int l = 1; l <= n; l++) {
					if(grow[j][l]==1 && !ch[j][l]) {
						cnt++;
						dfs(j,l);
					}
				}
			}
			arr.add(cnt);
		}
		
		for (int i = 0; i < arr.size(); i++) {			
			System.out.println(arr.get(i));
		}
	}
	
	static void dfs(int x, int y) {
		ch[x][y]=true;
		for (int i = 0; i < 4; i++) {
			int nx=x+dx[i];
			int ny=y+dy[i];
			
			if(nx>=1 && ny>=1 && nx<=m && ny<=n) {
				if(grow[nx][ny]==1 && !ch[nx][ny]) {
					dfs(nx,ny);
				}
			}
		}
	}
}
